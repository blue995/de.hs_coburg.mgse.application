package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.business.view.ViewCourse;
import de.hs_coburg.mgse.business.view.ViewCourseCatalogue;
import de.hs_coburg.mgse.business.view.ViewCoursesMeta;
import de.hs_coburg.mgse.business.view.ViewDegreeMeta;
import de.hs_coburg.mgse.persistence.HibernateUtil;
import de.hs_coburg.mgse.persistence.model.*;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class CourseCatalogueBusiness implements CourseCatalogueBusinessIf {
    @Override
    public List<ModuleHandbook> readCourseCatalogueList() throws Exception {
        List<ModuleHandbook> list;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            list = em.createQuery("SELECT x FROM ModuleHandbook x").getResultList();

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (list == null) throw new Exception("Course catalogue list not found");
        return list;
    }

    @Override
    public List<ViewCoursesMeta> readViewCourseCatalogueList() throws Exception {
        List<ViewCoursesMeta> view_courses_meta_list = new ArrayList<>();

        try {
            List<ModuleHandbook> course_catalogue_list;
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();
            course_catalogue_list = em.createQuery("SELECT x FROM ModuleHandbook x").getResultList();
            em.getTransaction().commit();
            //em.close();

            for (ModuleHandbook course_catalogue : course_catalogue_list) {
                ViewCourseCatalogue view_course_catalog = new ViewCourseCatalogue();
                view_course_catalog.setCatalogueId(course_catalogue.getId());
                view_course_catalog.setShortName("Modulhandbuch");
                view_course_catalog.setValidityDate(course_catalogue.getCurriculum().getSer().getValidityDate().toString());

                String course_name = course_catalogue.getCurriculum().getSer().getCourse().getCompleteName();
                String degree_name = course_catalogue.getCurriculum().getSer().getCourse().getDegree().getDegreeClass().getCompleteName();

                ViewCoursesMeta view_courses_meta = null;
                ViewDegreeMeta view_degree_meta = null;

                for (ViewCoursesMeta tmp_view_courses_meta : view_courses_meta_list) {
                    if (tmp_view_courses_meta.getCompleteName() == course_name) {
                        view_courses_meta = tmp_view_courses_meta;
                        for (ViewDegreeMeta tmp_view_degree_meta : tmp_view_courses_meta.getDegrees()) {
                            if (tmp_view_degree_meta.getCompleteName() == degree_name) {
                                view_degree_meta = tmp_view_degree_meta;
                                break;
                            }
                        }
                    }
                }

                if (view_courses_meta != null) {
                    if (view_degree_meta != null) {
                        view_degree_meta.getCourseCatalogues().add(view_course_catalog);
                        view_courses_meta.getDegrees().add(view_degree_meta);
                    } else {
                        view_degree_meta = new ViewDegreeMeta();
                        view_degree_meta.setCompleteName(degree_name);
                        view_degree_meta.setCourseCatalogues(new ArrayList<>());
                        view_degree_meta.getCourseCatalogues().add(view_course_catalog);
                        view_courses_meta.getDegrees().add(view_degree_meta);
                    }
                } else {
                    view_courses_meta = new ViewCoursesMeta();
                    view_courses_meta.setCompleteName(course_name);
                    view_degree_meta = new ViewDegreeMeta();
                    view_degree_meta.setCompleteName(degree_name);
                    view_degree_meta.setCourseCatalogues(new ArrayList<>());
                    view_degree_meta.getCourseCatalogues().add(view_course_catalog);
                    view_courses_meta.setDegrees(new ArrayList<>());
                    view_courses_meta.getDegrees().add(view_degree_meta);
                    view_courses_meta_list.add(view_courses_meta);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (view_courses_meta_list == null) throw new Exception("Course catalogue list not found");
        return view_courses_meta_list;
    }

    @Override
    public ModuleHandbook readCourseCatalogue(long id) throws Exception {
        ModuleHandbook item;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            item = em.find(ModuleHandbook.class, id);

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (item == null) throw new Exception("Course catalogue not found");
        return item;
    }

    @Override
    public ViewCourseCatalogue readViewCourseCatalogue(long id) throws Exception {
        ViewCourseCatalogue view_course_catalogue = null;

        try {
            ModuleHandbook course_catalogue;
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();
            course_catalogue = em.find(ModuleHandbook.class, id);
            em.getTransaction().commit();
            if (course_catalogue == null) throw new Exception("Course catalogue not found");

            view_course_catalogue = new ViewCourseCatalogue();
            view_course_catalogue.setId(course_catalogue.getId());
            view_course_catalogue.setCatalogueId(course_catalogue.getId());
            view_course_catalogue.setCourseOfStudy(course_catalogue.getCurriculum().getSer().getCourse().getCompleteName() + " " + course_catalogue.getCurriculum().getSer().getCourse().getDegree().getGlossaryEntry().getWord());
            view_course_catalogue.setCourseOfStudyAbbreviation("");
            view_course_catalogue.setValidityDate(course_catalogue.getCurriculum().getSer().getValidityDate().toString());
            //view_course_catalogue.setFacultyName();

            List<ViewCourse> view_course_list = new ArrayList<>();
            for (ModuleDescription module_desc : course_catalogue.getModuleDescriptions()) {
                ViewCourse view_course = new ViewCourse();
                view_course.setId(view_course.getId());
                view_course.setCourseOfStudy(course_catalogue.getCurriculum().getSer().getCourse().getDegree().getDegreeClass().getCompleteName() + " " + course_catalogue.getCurriculum().getSer().getCourse().getCompleteName());
                view_course.setModuleSpecification((module_desc.getCurriculumEntry().getModule().getDetails() != null) ? module_desc.getCurriculumEntry().getModule().getDetails().getWord() : module_desc.getCurriculumEntry().getModule().getCompleteName());
                view_course.setAbbreviation((module_desc.getCurriculumEntry().getModule().getDetails() != null) ? module_desc.getCurriculumEntry().getModule().getDetails().getAbbreviation() : module_desc.getCurriculumEntry().getModule().getCompleteName());
                view_course.setSemesterHours(module_desc.getCurriculumEntry().getModule().getSemesterHours());
                view_course.setEcts(module_desc.getCurriculumEntry().getModule().getEcts());

                List<String> workload_list = new ArrayList<>();
                for (Workload workload : module_desc.getWorkloads()) workload_list.add(new String(workload.getEffort().toString() + " " + workload.getDescription()));
                view_course.setWorkload(String.join(", ", workload_list));

                view_course.setSemester(module_desc.getCurriculumEntry().getSemester());
                view_course.setRota(module_desc.getCurriculumEntry().getRota());
                view_course.setLanguage(module_desc.getLanguage());
                view_course.setPrerequisites(module_desc.getPrerequisite());
                view_course.setQualificationGoals(module_desc.getQualificationGoals());
                view_course.setContent(module_desc.getContent());
                view_course.setLiterature(module_desc.getLiterature());
                view_course.setDuration("einsemestrig");

                List<String> lecturer_list = new ArrayList<>();
                for (Professor prof : module_desc.getLectures()) lecturer_list.add(prof.getAbbreviation().getAbbreviation());
                view_course.setLecturer(String.join(", ", lecturer_list));

                view_course.setResponsiblePerson(lecturer_list.get(0));

                List<String> mar_list = new ArrayList<>();
                for (ModuleAdmissionRequirement mar : module_desc.getAdmissionRequirements()) {
                    List<String> paragraph_list = new ArrayList<>();
                    for (Paragraph paragraph : mar.getParagraphs()) paragraph_list.add(paragraph.getTitle());
                    mar_list.add(mar.getText() + ((paragraph_list.size() > 0) ? ("[" + String.join(", ", paragraph_list) + "]") : ""));
                }
                view_course.setAdmissionRequirements(String.join(", ", mar_list));

                List<String> exam_list = new ArrayList<>();
                for (ConcreteExamType exam : module_desc.getCurriculumEntry().getConcreteExamTypes()) {
                    exam_list.add(new String(exam.getExamType().getExamTypeDeclaration().getDetails().getWord() + " (" + exam.getExamType().getLowerBound() + " - " + exam.getExamType().getUpperBound() + " " + exam.getExamType().getExamTypeDeclaration().getUnit() + ")"));
                }
                view_course.setExamType(String.join(", ", exam_list));

                List<String> media_list = new ArrayList<>();
                for (Media media : module_desc.getMedias()) media_list.add(media.getCompleteName().replace("[","").replace("]",""));
                view_course.setMediaType(String.join(", ", media_list));

                view_course_list.add(view_course);
            }

            view_course_catalogue.setCourses(view_course_list);

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (view_course_catalogue == null) throw new Exception("Course catalogue list not found");
        return view_course_catalogue;
    }
}

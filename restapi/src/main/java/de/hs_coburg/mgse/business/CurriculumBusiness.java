package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.business.view.*;
import de.hs_coburg.mgse.persistence.HibernateUtil;
import de.hs_coburg.mgse.persistence.model.*;

import javax.persistence.EntityManager;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CurriculumBusiness implements CurriculumBusinessIf {

    @Override
    public List<Curriculum> readCurriculumList() throws Exception {
        List<Curriculum> curriculum_list;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            curriculum_list = em.createQuery("SELECT x FROM Curriculum x").getResultList();

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (curriculum_list == null) throw new Exception("Curriculum list not found");
        return curriculum_list;
    }

    @Override
    public List<ViewCurriculumMeta> readViewCurriculumList() throws Exception {
        List<ViewCurriculumMeta> view_curricula_meta_list = new ArrayList<>();

        try {
            List<Curriculum> curriculum_list;
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();
            curriculum_list = em.createQuery("SELECT x FROM Curriculum x").getResultList();
            em.getTransaction().commit();
            if (curriculum_list == null) throw new Exception("Curriculum list not found");

            for (Curriculum curriculum : curriculum_list) {
                String curriculum_course;
                String curriculum_degree;

                ViewCurriculumInfo view_curriculum_info = new ViewCurriculumInfo();
                view_curriculum_info.setCurriculumId(curriculum.getId());
                view_curriculum_info.setShortName(curriculum.getCompleteName() + " v" + curriculum.getVersion());
                view_curriculum_info.setValidityDate(curriculum.getSer().getValidityDate().toString());

                curriculum_course = curriculum.getSer().getCourse().getCompleteName();
                curriculum_degree = curriculum.getSer().getCourse().getDegree().getDegreeClass().getCompleteName();

                ViewCurriculumMeta view_curriculum_meta = null;
                ViewDegreeMeta view_degree_meta = null;

                for (ViewCurriculumMeta tmp_view_curriculum_meta : view_curricula_meta_list) {
                    if (tmp_view_curriculum_meta.getCompleteName() == curriculum_course) {
                        view_curriculum_meta = tmp_view_curriculum_meta;
                        for (ViewDegreeMeta tmp_view_degree_meta : tmp_view_curriculum_meta.getDegrees()) {
                            if (tmp_view_degree_meta.getCompleteName() == curriculum_degree) {
                                view_degree_meta = tmp_view_degree_meta;
                                break;
                            }
                        }
                    }
                }

                // is course already in list
                if (view_curriculum_meta != null) {
                    // is degree already in list
                    if (view_degree_meta != null) {
                        view_degree_meta.getCurricula().add(view_curriculum_info);
                    } else {
                        if (view_curriculum_meta.getDegrees() == null) view_curriculum_meta.setDegrees(new ArrayList<>());
                        List<ViewCurriculumInfo> list = new ArrayList<>();
                        list.add(view_curriculum_info);
                        view_curriculum_meta.getDegrees().add(new ViewDegreeMeta(curriculum_degree, null, null, list));
                    }
                } else {
                    ViewCurriculumMeta tmp_view_curriculum_meta = new ViewCurriculumMeta();
                    tmp_view_curriculum_meta.setCompleteName(curriculum_course);
                    if (tmp_view_curriculum_meta.getDegrees() == null) tmp_view_curriculum_meta.setDegrees(new ArrayList<>());
                    List<ViewCurriculumInfo> list = new ArrayList<>();
                    list.add(view_curriculum_info);
                    tmp_view_curriculum_meta.getDegrees().add(new ViewDegreeMeta(curriculum_degree, null, null, list));
                    view_curricula_meta_list.add(tmp_view_curriculum_meta);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
        return view_curricula_meta_list;
    }

    @Override
    public Curriculum readCurriculum(long curriculum_id) throws Exception {
        Curriculum curriculum;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            curriculum = em.find(Curriculum.class, curriculum_id);

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (curriculum == null) throw new Exception("Curriculum not found");
        return curriculum;
    }

    @Override
    public ViewCurriculum readViewCurriculum(long curriculum_id) throws Exception {
        ViewCurriculum view_curriculum = null;

        try {
            Curriculum curriculum;
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();
            curriculum = em.find(Curriculum.class, curriculum_id);
            em.getTransaction().commit();
            if (curriculum == null) throw new Exception("Curriculum not found");

            view_curriculum = new ViewCurriculum();
            view_curriculum.setId(curriculum.getId());
            view_curriculum.setVersion(curriculum.getVersion());
            view_curriculum.setValidityDate(curriculum.getSer().getValidityDate().toString());
            view_curriculum.setSemester(curriculum.getSemester());
            view_curriculum.setYear(curriculum.getYear());
            view_curriculum.setCompleteName(curriculum.getCompleteName());

            // ### StudySections ###
            Map<StudySection, Map<String, List<ViewCurriculumEntry>>> lookup = new HashMap<>();
            List<ViewCurriculumEntry> tmp_view_curriculum_entry_list = new ArrayList<>();
            for (ModuleSpecification module_specification : curriculum.getModuleSpecifications()) {
                ViewCurriculumEntry view_curriculum_entry = new ViewCurriculumEntry();
                view_curriculum_entry.setSemester(module_specification.getSemester());
                view_curriculum_entry.setRota(module_specification.getRota());
                if(module_specification.getDetails() != null){
                    view_curriculum_entry.setModuleCompleteName(module_specification.getDetails().getWord());
                    view_curriculum_entry.setModuleAbbreviation(module_specification.getDetails().getAbbreviation());
                }else {
                    view_curriculum_entry.setModuleCompleteName((module_specification.getModule().getDetails() != null) ? module_specification.getModule().getDetails().getWord() : module_specification.getModule().getCompleteName());
                    view_curriculum_entry.setModuleAbbreviation(module_specification.getModule().getCompleteName());
                }

                view_curriculum_entry.setEcts(module_specification.getModule().getEcts());
                view_curriculum_entry.setSemesterHours(module_specification.getModule().getSemesterHours());

                // concat aid & custom aid list to coma separated string
                List<String> aid_list = new ArrayList<>();
                for (Aid aid : module_specification.getAids()) aid_list.add(aid.getCompleteName());
                for (CustomAid aid : module_specification.getCustomAids()) aid_list.add(aid.getCompleteName());
                view_curriculum_entry.setAidList(String.join(", ", aid_list));

                // testers
                List<ViewProfessor> tester_list = new ArrayList<>();
                for (Professor tester : module_specification.getTesters()) {
                    tester_list.add(new ViewProfessor(tester.getFirstName(), tester.getLastName(), tester.getEmail(), tester.getRoom(), tester.getAbbreviation().getAbbreviation()));
                }
                view_curriculum_entry.setTesters(tester_list);

                // responsible persons
                // TODO

                // course types
                List<ViewCourseType> view_course_type_list = new ArrayList<>();
                for (CourseTypeDeclaration course_type : module_specification.getCourseTypes()) {
                    ViewCourseType view_course_type = new ViewCourseType(course_type.getDetails().getWord(), course_type.getDetails().getAbbreviation());
                    view_course_type_list.add(view_course_type);
                }
                view_curriculum_entry.setModuleCourseTypes(view_course_type_list);

                // exam types
                List<ViewExamType> view_exam_type_list = new ArrayList<>();
                for (ConcreteExamType exam_type : module_specification.getConcreteExamTypes()) {
                    ViewExamType view_exam_type = new ViewExamType(exam_type.getExamType().getExamTypeDeclaration().getDetails().getWord(),
                                                                   exam_type.getExamType().getExamTypeDeclaration().getDetails().getAbbreviation(),
                                                                   exam_type.getExamType().getExamTypeDeclaration().getUnit(),
                                                                   exam_type.getExamType().getLowerBound(), exam_type.getExamType().getUpperBound());
                    view_exam_type_list.add(view_exam_type);
                }
                view_curriculum_entry.setModuleExamTypes(view_exam_type_list);

                List<StudySection> studySections = curriculum.getSer().getStudySections().stream().filter(ss -> ss.getModules().contains(module_specification.getModule())).collect(Collectors.toList());
                if(studySections.size() != 1){
                    throw new RuntimeException("Study section is not unique");
                }
                StudySection section = studySections.get(0);
                String moduleType = module_specification.getModule().getModuleType();
                if(!lookup.containsKey(section)){
                    lookup.put(section, new HashMap<>());
                }
                if(!lookup.get(section).containsKey(moduleType)){
                    lookup.get(section).put(moduleType, new LinkedList<>());
                }
                lookup.get(section).get(moduleType).add(view_curriculum_entry);
            }

            List<ViewCurriculumStudySection> view_curriculum_study_section_list = new ArrayList<>();

            List<StudySection> ordered = new LinkedList<>(lookup.keySet());
            ordered.sort(new StudySectionComparator());
            for (StudySection study_section : ordered) {
                ViewCurriculumStudySection view_curriculum_study_section = new ViewCurriculumStudySection();
                view_curriculum_study_section.setCompleteName(study_section.getCompleteName());

                // Liste an SubSections (Pflichtmodul, Wahlmodule, usw.)
                List<ViewStudySubsectionType> view_study_subsection_type_list = new ArrayList<>();
                List<String> orderedModuleTypes = new LinkedList<>(lookup.get(study_section).keySet());
                orderedModuleTypes.sort(new ModuleTypeComparator(study_section));
                for(String moduleType: orderedModuleTypes){
                    ViewStudySubsectionType view_subsection_type = new ViewStudySubsectionType();
                    view_subsection_type.setSubsectionTypeName(moduleType);
                    view_subsection_type.setCurriculumEntries(lookup.get(study_section).get(moduleType));
                    view_study_subsection_type_list.add(view_subsection_type);
                }

                view_curriculum_study_section.setSubsectionTypes(view_study_subsection_type_list);
                view_curriculum_study_section_list.add(view_curriculum_study_section);
            }
            view_curriculum.setCurriculumStudySections(view_curriculum_study_section_list);

            // ### Footnote ###
            List<ViewFootnote> footnote_list = new ArrayList<>();
            int footnote_counter = 1;
            for (Footnote note : curriculum.getSer().getFootnotes()) {
                footnote_list.add(new ViewFootnote(footnote_counter, note.getText()));
                footnote_counter++;
            }
            view_curriculum.setFootnotes(footnote_list);

            // ### Glossary ###
            List<Glossary> glossary_list;
            em.getTransaction().begin();
            glossary_list = em.createQuery("SELECT x FROM Glossary x").getResultList();
            em.getTransaction().commit();
            Glossary glossary = glossary_list.get(0);
            if (glossary == null) throw new Exception("Glossary not found");

            List<ViewGlossarySection> view_glossary_section_list = new ArrayList<>();
            for (GlossarySection glossary_section : glossary.getSections()) {
                List<ViewGlossaryEntry> view_glossary_entry_list = new ArrayList<>();
                for (GlossaryEntry glossary_entry : glossary_section.getEntries()) {
                    view_glossary_entry_list.add(new ViewGlossaryEntry(glossary_entry.getId(),
                            glossary_entry.getWord(),
                            glossary_entry.getAbbreviation(),
                            glossary_entry.getMeaning()));
                }
                view_glossary_section_list.add(new ViewGlossarySection(glossary_section.getId(), view_glossary_entry_list));
            }
            ViewGlossary view_glossary = new ViewGlossary(glossary.getId(), view_glossary_section_list);
            view_curriculum.setGlossary(view_glossary);

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (view_curriculum == null) throw new Exception("Curriculum not found");
        return view_curriculum;
    }

}

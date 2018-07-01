package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.business.view.*;
import de.hs_coburg.mgse.persistence.HibernateUtil;
import de.hs_coburg.mgse.persistence.model.*;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class SerBusiness implements SerBusinessIf {

    @Override
    public List<StudyExaminationRegulations> readStudyExaminationRegulationsList() throws Exception {
        List<StudyExaminationRegulations> ser_list;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            ser_list = em.createQuery("SELECT x FROM StudyExaminationRegulations x").getResultList();

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (ser_list == null) throw new Exception("StudyExaminationRegulations list not found");
        return ser_list;
    }

    @Override
    public List<ViewStudyExaminationRegulationsMeta> readViewStudyExaminationRegulationsList() throws Exception {
        List<ViewStudyExaminationRegulationsMeta> view_ser_meta_list = new ArrayList<>();

        try {
            List<StudyExaminationRegulations> ser_list;
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();
            ser_list = em.createQuery("SELECT x FROM StudyExaminationRegulations x").getResultList();
            em.getTransaction().commit();
            if (ser_list == null) throw new Exception("StudyExaminationRegulations list not found");

            for (StudyExaminationRegulations ser : ser_list) {
                ViewStudyExaminationRegulationsMeta tmp_view_ser_meta = null;

                // find course in view_ser_meta_list
                for (ViewStudyExaminationRegulationsMeta view_ser_meta : view_ser_meta_list) {
                    if (view_ser_meta.getCompleteName() == ser.getCourse().getCompleteName()) {
                        tmp_view_ser_meta = view_ser_meta;
                        break;
                    }
                }

                // ser short name is between brackets of ser title
                String short_name = ser.getTitle().substring(ser.getTitle().indexOf("(") + 1, ser.getTitle().indexOf(")"));

                // is course already in view_ser_meta_list
                if (tmp_view_ser_meta != null) {
                    ViewDegreeMeta tmp_view_degree_meta = null;

                    // find degree in view_ser_meta.degrees
                    for (ViewDegreeMeta view_degree_meta : tmp_view_ser_meta.getDegrees()) {
                        if (view_degree_meta.getCompleteName() == ser.getCourse().getDegree().getGlossaryEntry().getWord()) {
                            tmp_view_degree_meta = view_degree_meta;
                            break;
                        }
                    }

                    ViewStudyExaminationRegulationsInfo vseri = new ViewStudyExaminationRegulationsInfo(ser.getId(), short_name, ser.getValidityDate().toString());

                    // is degree already in view_ser_meta.degrees -> add new ViewStudyExaminationRegulationsInfo
                    if (tmp_view_degree_meta != null) {
                        tmp_view_degree_meta.getSers().add(vseri);
                    } else { // is degree not in view_ser_meta.degrees -> add new ViewDegreeMeta with new ViewStudyExaminationRegulationsInfo list with new ViewStudyExaminationRegulationsInfo
                        ViewDegreeMeta vdm = new ViewDegreeMeta(ser.getCourse().getDegree().getGlossaryEntry().getWord(), new ArrayList<ViewStudyExaminationRegulationsInfo>(), null, null);
                        vdm.getSers().add(vseri);
                        tmp_view_ser_meta.getDegrees().add(vdm);
                    }

                } else { // is course not in view_ser_meta_list -> add new ViewStudyExaminationRegulationsMeta with new ViewDegreeMeta list with new ViewStudyExaminationRegulationsInfo list with new ViewStudyExaminationRegulationsInfo
                    ViewStudyExaminationRegulationsInfo vseri = new ViewStudyExaminationRegulationsInfo(ser.getId(), short_name, ser.getValidityDate().toString());
                    ViewDegreeMeta vdm = new ViewDegreeMeta(ser.getCourse().getDegree().getGlossaryEntry().getWord(), new ArrayList<ViewStudyExaminationRegulationsInfo>(), null, null);
                    vdm.getSers().add(vseri);
                    ViewStudyExaminationRegulationsMeta vserm = new ViewStudyExaminationRegulationsMeta(ser.getCourse().getCompleteName(), new ArrayList<ViewDegreeMeta>());
                    vserm.getDegrees().add(vdm);
                    view_ser_meta_list.add(vserm);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        return view_ser_meta_list;
    }

    @Override
    public StudyExaminationRegulations readStudyExaminationRegulations(long ser_id) throws Exception {
        StudyExaminationRegulations ser;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            ser = em.find(StudyExaminationRegulations.class, ser_id);

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (ser == null) throw new Exception("StudyExaminationRegulations not found");
        return ser;
    }

    @Override
    public ViewStudyExaminationRegulations readViewStudyExaminationRegulations(long ser_id) throws Exception {
        ViewStudyExaminationRegulations view_ser;

        try {
            StudyExaminationRegulations ser;
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();
            ser = em.find(StudyExaminationRegulations.class, ser_id);
            em.getTransaction().commit();
            if (ser == null) throw new Exception("StudyExaminationRegulations not found");

            List<Faculty> faculty_list;
            em.getTransaction().begin();
            faculty_list = em.createQuery("SELECT x FROM Faculty x").getResultList();
            em.getTransaction().commit();
            if (ser == null) throw new Exception("Faculty list not found");

            Faculty faculty = null;
            for (Faculty f : faculty_list) {
                for (CourseOfStudies cos : f.getCourseOfStudies()) {
                    if (cos.getCompleteName() == ser.getCourse().getCompleteName()) {
                        faculty = f;
                        break;
                    }
                }
            }
            if (faculty == null) throw new Exception("Faculty not found");

            view_ser = new ViewStudyExaminationRegulations();
            view_ser.setId(ser.getId());
            view_ser.setShortName(ser.getTitle().substring(ser.getTitle().indexOf("(") + 1, ser.getTitle().indexOf(")")));
            view_ser.setTitle(ser.getTitle());
            view_ser.setValidityDate(ser.getValidityDate().toString());
            view_ser.setPreface(ser.getForeword());

            // ### CourseOfStudy ###
            ViewCourseOfStudy view_course = new ViewCourseOfStudy();
            view_course.setName(ser.getCourse().getCompleteName());
            view_course.setEtcs(ser.getCourse().getEcts());
            view_course.setSemesters(ser.getCourse().getSemester());

            // concat requirements to coma separated string
            List<String> requirement_list = new ArrayList<>();
            for (AdmissionRequirement ar : ser.getCourse().getRequirements()) requirement_list.add(ar.getValue());
            view_course.setRequirements(String.join(", ", requirement_list));
            view_course.setFacultyName(faculty.getCompleteName());
            // faculty short name is hiding somewhere -> workaround: take first letters (to upper case) of complete name
            String faculty_short_name = "";
            for (String s : faculty.getCompleteName().split(" ")) faculty_short_name += s.charAt(0);
            view_course.setFacultyShortName(faculty_short_name.toUpperCase());
            view_course.setDegreeName(ser.getCourse().getDegree().getGlossaryEntry().getWord());
            view_course.setDegreeAbbreviation(ser.getCourse().getDegree().getGlossaryEntry().getAbbreviation());
            view_ser.setCourseOfStudiy(view_course);

            // ### Paragraph ###
            List<ViewParagraph> view_paragraph_list = new ArrayList<>();
            for (Paragraph paragraph : ser.getParagraphs()) {
                ViewParagraph view_paragraph = new ViewParagraph();
                view_paragraph.setNumber(paragraph.getNumber());
                //view_paragraph.setSubtitle("");

                // paragraph sentences 2 paragraph subsection
                List<ViewSubsection> view_subsection_list = new ArrayList<>();
                List<String> sentences = new ArrayList<>();
                for (Sentence sentence : paragraph.getSentences()) {
                    sentences.add(sentence.getText());
                }
                ViewSubsection view_subsection_sentences = new ViewSubsection();
                view_subsection_sentences.setText(String.join("\n", sentences));
                if (view_subsection_sentences.getText().length() > 0) view_subsection_list.add(view_subsection_sentences);

                // subsections / subparagraph
                for (SubParagraph subsection : paragraph.getSubParagraphs()) {
                    ViewSubsection view_subsection = new ViewSubsection();
                    view_subsection.setNumber(subsection.getNumber());

                    // subsection sentences
                    List<String> view_sub_sentence_list = new ArrayList<>();
                    for (Sentence sentence : subsection.getSentences()) {
                        view_sub_sentence_list.add(sentence.getText());
                    }
                    view_subsection.setText(String.join("\n", view_sub_sentence_list));
                    view_subsection_list.add(view_subsection);
                }
                view_paragraph.setSubsections(view_subsection_list);
                view_paragraph_list.add(view_paragraph);
            }
            view_ser.setParagraphs(view_paragraph_list);

            // ### StudySections ###
            List<ViewStudySection> view_study_section_list = new ArrayList<>();

            for (StudySection study_section : ser.getStudySections()) {
                ViewStudySection view_study_section = new ViewStudySection();

                view_study_section.setCompleteName(study_section.getCompleteName());
                view_study_section.setFirstSemester(study_section.getFirstSemester());
                view_study_section.setLastSemester(study_section.getLastSemester());

                int sum_of_etcs = 0;
                int sum_of_semester_hours = 0;
                double sum_of_quantifiers = 0;

                List<ViewModuleType> view_module_type_list = new ArrayList<>();

                for (Module module : study_section.getModules()) {
                    ViewModuleType view_module_type = null;

                    for (ViewModuleType mt : view_module_type_list) {
                        if (mt.getTypeName() == module.getModuleType()) {
                            view_module_type = mt;
                            break;
                        }
                    }

                    ViewModule view_module = new ViewModule();
                    view_module.setCompleteName((module.getDetails() != null) ? module.getDetails().getWord() : module.getCompleteName());
                    view_module.setEcts(module.getEcts());
                    view_module.setQuantifier(module.getQuantifier());
                    view_module.setSemesterHours(module.getSemesterHours());
                    if (module.getCount() != null) view_module.setCount(module.getCount());

                    sum_of_etcs           += module.getEcts();
                    sum_of_semester_hours += module.getSemesterHours();
                    sum_of_quantifiers    += module.getQuantifier();

                    // course types
                    List<ViewCourseType> view_course_type_list = new ArrayList<>();
                    for (CourseTypeDeclaration ctd : module.getCourseType()) {
                        view_course_type_list.add(new ViewCourseType(ctd.getDetails().getWord(), ctd.getDetails().getAbbreviation()));
                    }
                    view_module.setCourseTypes(view_course_type_list);

                    // exam types
                    List<ViewExamType> view_exam_type_list = new ArrayList<>();
                    for (ExamType cet : module.getExamTypes()) {
                        view_exam_type_list.add(new ViewExamType(cet.getExamTypeDeclaration().getDetails().getWord(),
                                                                 cet.getExamTypeDeclaration().getDetails().getAbbreviation(),
                                                                 cet.getExamTypeDeclaration().getUnit(),
                                                                 cet.getLowerBound(), cet.getUpperBound()));
                    }
                    view_module.setExamTypes(view_exam_type_list);

                    // is module type already in view module type list?
                    if (view_module_type != null) {
                        view_module_type.getModules().add(view_module);
                    } else { // is module not in view module type list
                        ViewModuleType tmp_view_module_type = new ViewModuleType();
                        tmp_view_module_type.setTypeName(module.getModuleType());
                        tmp_view_module_type.setModules(new ArrayList<>());
                        tmp_view_module_type.getModules().add(view_module);
                        view_module_type_list.add(tmp_view_module_type);
                    }
                }
                view_study_section.setSumOfEcts(sum_of_etcs);
                view_study_section.setSumOfSemesterHours(sum_of_semester_hours);
                view_study_section.setSumOfQuantifiers(sum_of_quantifiers);
                view_study_section.setModuleTypes(view_module_type_list);
                view_study_section_list.add(view_study_section);
            }
            view_ser.setStudySections(view_study_section_list);

            // ### Footnote ###
            List<ViewFootnote> footnote_list = new ArrayList<>();
            int footnote_counter = 1;
            for (Footnote note : ser.getFootnotes()) {
                footnote_list.add(new ViewFootnote(footnote_counter, note.getText()));
                footnote_counter++;
            }
            view_ser.setFootnotes(footnote_list);

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
            view_ser.setGlossary(view_glossary);

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        return view_ser;
    }

}

package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.business.view.ViewCourseCatalogue;
import de.hs_coburg.mgse.business.view.ViewCoursesMeta;
import de.hs_coburg.mgse.persistence.model.ModuleHandbook;

import java.util.List;

public interface CourseCatalogueBusinessIf {
    List<ModuleHandbook> readCourseCatalogueList() throws Exception;
    List<ViewCoursesMeta> readViewCourseCatalogueList() throws Exception;

    ModuleHandbook readCourseCatalogue(long id) throws Exception;
    ViewCourseCatalogue readViewCourseCatalogue(long id) throws Exception;
}

package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.persistence.model.Module;
import de.hs_coburg.mgse.persistence.model.StudySection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ModuleTypeComparator implements Comparator<String>{
    private StudySection studySection;

    private List<String> moduleTypes;


    public ModuleTypeComparator(StudySection studySection) {
        this.studySection = studySection;
        this.moduleTypes = this.studySection.getModules().stream().map(Module::getModuleType).collect(Collectors.toList());
    }

    @Override
    public int compare(String s, String t1) {
        Integer idx1 = moduleTypes.indexOf(s);
        Integer idx2 = moduleTypes.indexOf(t1);
        if(idx1 < 0 || idx2 < 0){
            throw new RuntimeException("First: " + s + " | Second: " + t1 );
        }
        return idx1.compareTo(idx2);
    }
}

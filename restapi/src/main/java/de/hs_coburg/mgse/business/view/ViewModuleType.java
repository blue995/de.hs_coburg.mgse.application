package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewModuleType {

    private String typeName;
    private List<ViewModule> modules;

    public ViewModuleType() { }

    public ViewModuleType(String typeName, List<ViewModule> modules) {
        this.typeName = typeName;
        this.modules = modules;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<ViewModule> getModules() {
        return modules;
    }

    public void setModules(List<ViewModule> modules) {
        this.modules = modules;
    }
}

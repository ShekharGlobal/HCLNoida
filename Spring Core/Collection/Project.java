package com.coforge.collection;

public class Project {
    
    private String projectName;
    private String clientName;

    // Constructor
    public Project(String projectName, String clientName) {
        this.projectName = projectName;
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "Project [projectName=" + projectName + ", clientName=" + clientName + "]";
    }
}

package com.coforge.collection;

import java.util.List;

public class Employee {

    private int id;
    private String name;
    private List<Project> projects; // List-based dependency for projects

    // Default Constructor
    public Employee() {}

    // Setters for Setter Injection
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
        System.out.println("Assigned Projects:");
        for (Project project : projects) {
            System.out.println("- " + project);
        }
    }
}

package com.designpatterns.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Directory.
 */
class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    /**
     * Instantiates a new Directory.
     *
     * @param name the name
     */
    public Directory(String name) {
        this.name = name;
    }

    /**
     * Add.
     *
     * @param component the component
     */
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}

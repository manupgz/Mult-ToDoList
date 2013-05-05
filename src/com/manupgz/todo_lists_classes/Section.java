package com.manupgz.todo_lists_classes;

/**
 * Created with IntelliJ IDEA.
 * User: manuel
 * Date: 5/5/13
 * Time: 6:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Section {
    private Integer id;
    private String name;
    private String color;

    public Section() {
    }

    public Section(Integer id, String name, String color) {

        this.id = id;
        this.name = name;
        this.color = color;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

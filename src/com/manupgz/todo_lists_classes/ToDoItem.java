package com.manupgz.todo_lists_classes;

/**
 * Created with IntelliJ IDEA.
 * User: manuel
 * Date: 5/5/13
 * Time: 5:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class ToDoItem {
    private Integer id;
    private Integer sectionId;
    private Integer priority;
    private Integer position;
    private Boolean status;
    private String title;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ToDoItem() {
    }

    public ToDoItem(Integer id, Integer sectionId, Integer priority, Integer position, Boolean status, String title, String description) {
        this.id = id;
        this.sectionId = sectionId;
        this.priority = priority;
        this.position = position;
        this.status = status;
        this.title = title;
        this.description = description;
    }
}

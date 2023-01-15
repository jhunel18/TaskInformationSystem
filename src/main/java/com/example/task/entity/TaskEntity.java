package com.example.task.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbltasks")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private long id;

    @Column(length = 128, nullable = false, name = "title")
    private String title;

    @Column(length = 255, nullable = false, name = "description")
    private String description;

    @Column(length = 255, nullable = false, name = "completed")
    private String completed;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }
}

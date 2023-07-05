package com.example.demo.observer;


public class VideoData extends SubjectList {
    private Long id;
    private String name;
    private String description;

    public VideoData(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public VideoData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        Notify();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        Notify();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        Notify();
    }

    @Override
    public String toString() {
        return "VideoData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public void Notify() {
        NotifyForClient(this ,null);
    }
}

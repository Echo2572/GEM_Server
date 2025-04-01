package com.gem.entity;

public class Album {
    private int id;
    private String title;
    private String company;
    private int kind;  // 录音室专辑1 ;EP2 ;Single:3; Live4
    private String description;
    private String linguistic;
    private String publishTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinguistic() {
        return linguistic;
    }

    public void setLinguistic(String linguistic) {
        this.linguistic = linguistic;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }
}

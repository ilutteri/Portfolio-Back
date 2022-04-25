package com.ilutteri.portfolio.model;

import javax.persistence.*;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String title;
    private String imgURL;
    private String about;
    private String URL;
    private String gitHubURL;


    public Project() {
    }

    public Project(Long id, String title, String imgURL, String about, String URL, String gitHubURL) {
        this.id = id;
        this.title = title;
        this.imgURL = imgURL;
        this.about = about;
        this.URL = URL;
        this.gitHubURL = gitHubURL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getGitHubURL() {
        return gitHubURL;
    }

    public void setGitHubURL(String gitHubURL) {
        this.gitHubURL = gitHubURL;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", imgURL='" + imgURL + '\'' +
                ", about='" + about + '\'' +
                ", URL='" + URL + '\'' +
                ", gitHubURL='" + gitHubURL + '\'' +
                '}';
    }
}

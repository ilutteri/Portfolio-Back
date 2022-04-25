package com.ilutteri.portfolio.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Profile implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String title;
    private String bannerURL;
    private String profileURL;
    private String about;

    public Profile() {
    }

    public Profile(Long id, String name, String title, String bannerURL, String profileURL, String about) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.bannerURL = bannerURL;
        this.profileURL = profileURL;
        this.about = about;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBannerURL() {
        return bannerURL;
    }

    public void setBannerURL(String bannerURL) {
        this.bannerURL = bannerURL;
    }

    public String getProfileURL() {
        return profileURL;
    }

    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", bannerURL='" + bannerURL + '\'' +
                ", profileURL='" + profileURL + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}

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
    private String bannerUrl;
    private String profileUrl;
    private String about;

    public Profile() {
    }

    public Profile(Long id, String name, String title, String bannerURL, String profileURL, String about) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.bannerUrl = bannerURL;
        this.profileUrl = profileURL;
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
        return bannerUrl;
    }

    public void setBannerURL(String bannerURL) {
        this.bannerUrl = bannerURL;
    }

    public String getProfileURL() {
        return profileUrl;
    }

    public void setProfileURL(String profileURL) {
        this.profileUrl = profileURL;
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
                ", bannerURL='" + bannerUrl + '\'' +
                ", profileURL='" + profileUrl + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}

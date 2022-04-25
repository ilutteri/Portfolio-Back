package com.ilutteri.portfolio.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Experience implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String position;
    private String company;
    private String imgURL;
    private String mode;
    private String start;
    private String end;
    private String location;

    public Experience() {
    }

    public Experience(Long id, String position, String company, String imgURL, String mode, String start, String end, String location) {
        this.id = id;
        this.position = position;
        this.company = company;
        this.imgURL = imgURL;
        this.mode = mode;
        this.start = start;
        this.end = end;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgUrl(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", company='" + company + '\'' +
                ", imgURL='" + imgURL + '\'' +
                ", mode='" + mode + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}




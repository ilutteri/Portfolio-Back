package com.ilutteri.portfolio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class SkillType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String type;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Skill> list;


    public SkillType() {
    }

    public SkillType(Long id, String type, List<Skill> list) {
        this.id = id;
        this.type = type;
        this.list = list;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Skill> getList() {
        return list;
    }

    public void setList(List<Skill> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "SkillTypes{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", list=" + list +
                '}';
    }
}

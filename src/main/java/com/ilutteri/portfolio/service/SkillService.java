package com.ilutteri.portfolio.service;

import com.ilutteri.portfolio.model.Skill;
import com.ilutteri.portfolio.model.SkillType;
import com.ilutteri.portfolio.repo.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    private final SkillRepo skillRepo;

    @Autowired
    public SkillService(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }

    public Skill addSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    public List<Skill> findAllSkills(){
        return skillRepo.findAll();
    }

    public Skill updateSkill(Skill skill){
        return skillRepo.save(skill);
    }

    public void deleteSkill(Long id){
        skillRepo.deleteById(id);
    }





}

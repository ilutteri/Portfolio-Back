package com.ilutteri.portfolio.service;


import com.ilutteri.portfolio.exception.SkillTypeNotFoundException;
import com.ilutteri.portfolio.model.SkillType;
import com.ilutteri.portfolio.repo.SkillTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillTypeService {
    private final SkillTypeRepo skillTypeRepo;

    @Autowired
    public SkillTypeService(SkillTypeRepo skillTypeRepo){
        this.skillTypeRepo = skillTypeRepo;
    }

    public SkillType addSkillType(SkillType skillType){
        return skillTypeRepo.save(skillType);
    }

    public List<SkillType> findAllSkillTypes(){
        return skillTypeRepo.findAll();
    }

    public SkillType findSkillTypeById(Long id){
        return skillTypeRepo.findSkillTypeById(id)
                .orElseThrow(() -> new SkillTypeNotFoundException("No se encontró"));
    }

    public SkillType updateSkillType(SkillType skillType){
        return skillTypeRepo.save(skillType);
    }

    public void deleteSkillType(Long id) {
        skillTypeRepo.deleteById(id);
    }

}

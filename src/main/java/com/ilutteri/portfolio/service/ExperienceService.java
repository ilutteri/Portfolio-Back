package com.ilutteri.portfolio.service;

import com.ilutteri.portfolio.model.Experience;
import com.ilutteri.portfolio.repo.ExperienceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {
    private final ExperienceRepo experienceRepo;

    @Autowired
    public ExperienceService(ExperienceRepo experienceRepo) {this.experienceRepo = experienceRepo;}

    public Experience addExperience(Experience experience){
        return experienceRepo.save(experience);
    }

    public List<Experience> findAllExperiences() {
        return experienceRepo.findAll();}

    public Experience updateExperience(Experience experience){
        return experienceRepo.save(experience);
    }

    public void deleteExperience(Long id){
        experienceRepo.deleteById(id);
    }

}

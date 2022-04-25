package com.ilutteri.portfolio.service;


import com.ilutteri.portfolio.model.Education;
import com.ilutteri.portfolio.repo.EducationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
    private final EducationRepo educationRepo;

    @Autowired
    public EducationService(EducationRepo educationRepo) {this.educationRepo = educationRepo;}

    public Education addEducation(Education education){
        return educationRepo.save(education);
    }

    public List<Education> findAllEducations(){
        return educationRepo.findAll();
    }

    public Education updateEducation(Education education){
        return educationRepo.save(education);
    }

    public void deleteEducation(Long id){
        educationRepo.deleteById(id);
    }
}

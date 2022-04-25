package com.ilutteri.portfolio.service;


import com.ilutteri.portfolio.model.Project;
import com.ilutteri.portfolio.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepo projectRepo;

    @Autowired
    public ProjectService(ProjectRepo projectRepo) { this.projectRepo = projectRepo; }


    public Project addProject(Project project) {
        return projectRepo.save(project);
    }

    public List<Project> findAllProjects() {
        return projectRepo.findAll();}

    public Project updateProject (Project project){
        return projectRepo.save(project);
    }

    public void deleteById(Long id) {
        projectRepo.deleteById(id);
    }

}

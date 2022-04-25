package com.ilutteri.portfolio;

import com.ilutteri.portfolio.model.*;
import com.ilutteri.portfolio.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PortfolioResource {

    private final ProfileService profileService;
    private final ExperienceService experienceService;
    private final EducationService educationService;
    private final SkillTypeService skillTypeService;
    private final SkillService skillService;
    private final ProjectService projectService;


    public PortfolioResource(ProfileService profileService, ExperienceService experienceService, EducationService educationService, SkillTypeService skillTypeService, SkillService skillService, ProjectService projectService) {
        this.profileService = profileService;
        this.experienceService = experienceService;
        this.educationService = educationService;
        this.skillTypeService = skillTypeService;
        this.skillService = skillService;
        this.projectService = projectService;
    }

    /** PROFILE **/

    @GetMapping("/profile/get")
    public ResponseEntity<List<Profile>> getAllProfiles (){
        List<Profile> profiles = profileService.findAllProfiles();
        return new ResponseEntity<>(profiles, HttpStatus.OK);
    }

    @PostMapping("/profile/add")
    public ResponseEntity<Profile> addProfile(@RequestBody Profile profile){
        Profile newProfile = profileService.addProfile(profile);
        return new ResponseEntity<>(profile, HttpStatus.OK);
    }

    @PutMapping("/profile/update")
    public ResponseEntity<Profile> updateProfile(@RequestBody Profile profile){
        Profile updateProfile = profileService.updateProfile(profile);
        return new ResponseEntity<>(updateProfile, HttpStatus.OK);
    }

    @DeleteMapping("/profile/delete/{id}")
    public ResponseEntity<?> deleteProfile(@PathVariable("id") Long id){
        profileService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /** EXPERIENCE **/

    @GetMapping("/experience/get")
    public ResponseEntity<List<Experience>> getAllExperiences (){
        List<Experience> experiences = experienceService.findAllExperiences();
        return new ResponseEntity<>(experiences, HttpStatus.OK);
    }

    @PostMapping("/experience/add")
    public ResponseEntity<Experience> addProfile(@RequestBody Experience experience){
        Experience newExperience = experienceService.addExperience(experience);
        return new ResponseEntity<>(experience, HttpStatus.OK);
    }

    @PutMapping("/experience/update")
    public ResponseEntity<Experience> updateExperience(@RequestBody Experience experience){
        Experience updateExperience = experienceService.updateExperience(experience);
        return new ResponseEntity<>(updateExperience, HttpStatus.OK);
    }

    @DeleteMapping("/experience/delete/{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable("id") Long id){
        experienceService.deleteExperience(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

   /** EDUCATION **/

   @GetMapping("/education/get")
   public ResponseEntity<List<Education>> getAllEducations (){
       List<Education> educations = educationService.findAllEducations();
       return new ResponseEntity<>(educations, HttpStatus.OK);
   }

    @PostMapping("/education/add")
    public ResponseEntity<Education> addProfile(@RequestBody Education education){
        Education newEducation = educationService.addEducation(education);
        return new ResponseEntity<>(education, HttpStatus.OK);
    }

    @PutMapping("/education/update")
    public ResponseEntity<Education> updateEducation(@RequestBody Education education){
        Education updateEducation = educationService.updateEducation(education);
        return new ResponseEntity<>(updateEducation, HttpStatus.OK);
    }

    @DeleteMapping("/education/delete/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable("id") Long id){
        educationService.deleteEducation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /** SKILLS **/

    @GetMapping("/skillType/get")
    public ResponseEntity<List<SkillType>> getAllSkillTypes(){
        List<SkillType> skillTypes = skillTypeService.findAllSkillTypes();
        return new ResponseEntity<>(skillTypes, HttpStatus.OK);
    }

    @PostMapping("/skillType/add")
    public ResponseEntity<SkillType> addProfile(@RequestBody SkillType skillType){
        SkillType newSkillType = skillTypeService.addSkillType(skillType);
        return new ResponseEntity<>(skillType, HttpStatus.OK);
    }

    @PutMapping("/skillType/update")
    public ResponseEntity<SkillType> updateSkillType(@RequestBody SkillType skillType){
        SkillType updateSkillType = skillTypeService.updateSkillType(skillType);
        return new ResponseEntity<>(skillType, HttpStatus.OK);
    }

    @DeleteMapping("/skillType/delete/{id}")
    public ResponseEntity<?> deleteSkillType(@PathVariable("id") Long id){
        skillTypeService.deleteSkillType(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /** PROJECTS **/

    @GetMapping("/project/get")
    public ResponseEntity<List<Project>> getAllProjects(){
        List<Project> projects = projectService.findAllProjects();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @PostMapping("/project/add")
    public ResponseEntity<Project> addProfile(@RequestBody Project project){
        Project newProject = projectService.addProject(project);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }

    @PutMapping("/project/update")
    public ResponseEntity<Project> updateProject(@RequestBody Project project){
        Project updateProject = projectService.updateProject(project);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }

    @DeleteMapping("/project/delete/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable("id") Long id){
        projectService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}




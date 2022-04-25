package com.ilutteri.portfolio.service;

import com.ilutteri.portfolio.model.Profile;
import com.ilutteri.portfolio.repo.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    private final ProfileRepo profileRepo;

    @Autowired
    public ProfileService(ProfileRepo profileRepo) { this.profileRepo = profileRepo; }


    public Profile addProfile( Profile profile) {
        return profileRepo.save(profile);
    }

    public List<Profile> findAllProfiles() {
        return profileRepo.findAll();}

    public Profile updateProfile (Profile profile){
        return profileRepo.save(profile);
    }

    public void deleteById(Long id) {profileRepo.deleteById(id);}

}

package com.ilutteri.portfolio.repo;

import com.ilutteri.portfolio.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepo extends JpaRepository<Profile,Long> {

}

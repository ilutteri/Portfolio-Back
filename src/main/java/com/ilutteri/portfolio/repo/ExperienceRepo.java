package com.ilutteri.portfolio.repo;

import com.ilutteri.portfolio.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepo extends JpaRepository<Experience,Long> {
}

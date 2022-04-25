package com.ilutteri.portfolio.repo;

import com.ilutteri.portfolio.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepo extends JpaRepository<Education,Long> {
}

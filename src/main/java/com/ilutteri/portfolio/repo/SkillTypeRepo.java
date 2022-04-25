package com.ilutteri.portfolio.repo;

import com.ilutteri.portfolio.model.SkillType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SkillTypeRepo extends JpaRepository<SkillType,Long> {

    Optional<SkillType> findSkillTypeById(Long id);
}

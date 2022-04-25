package com.ilutteri.portfolio.repo;

import com.ilutteri.portfolio.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepo extends JpaRepository<Skill,Long> {
}

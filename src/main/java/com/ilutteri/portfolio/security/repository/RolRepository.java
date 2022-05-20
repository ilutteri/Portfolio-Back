package com.ilutteri.portfolio.security.repository;

import com.ilutteri.portfolio.security.entity.Rol;
import com.ilutteri.portfolio.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}

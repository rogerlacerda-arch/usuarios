package com.rogerlacerda.usuarios.infrastructure.repository;

import com.rogerLacerda.springSpring.infrasctructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}

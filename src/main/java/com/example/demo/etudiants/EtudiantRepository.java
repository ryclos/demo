package com.example.demo.etudiants;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface EtudiantRepository extends JpaRepository<EtudiantEntity, Long> {
    @Query("SELECT e FROM EtudiantEntity e WHERE e.id = ?1")
    public EtudiantEntity customGetEtudiant(Long id);

}

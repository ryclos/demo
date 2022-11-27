package com.example.demo.etudiants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EtudiantService {

    private final EtudiantRepository etudiantRepository;

    @Autowired
    public EtudiantService(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    public Optional<EtudiantEntity> getEtudiant(Long id){
        return this.etudiantRepository.findById(id);
    }

    public EtudiantEntity addEtudiant(EtudiantEntity etudiant) {
        this.etudiantRepository.save(etudiant);
        return etudiant;
    }
}

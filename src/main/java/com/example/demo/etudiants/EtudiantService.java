package com.example.demo.etudiants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtudiantService {

    private final EtudiantRepository etudiantRepository;

    @Autowired
    public EtudiantService(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    public EtudiantEntity getEtudiant(Long id){
        return this.etudiantRepository.getReferenceById(id);
    }

    public EtudiantEntity addEtudiant(EtudiantEntity etudiant) {
        this.etudiantRepository.save(etudiant);
        return etudiant;
    }
}

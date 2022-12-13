package com.example.demo.etudiants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "etudiant")
public class EtudiantController {

    private final EtudiantService etudiantService;

    @Autowired
    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(path = "{id}")
    public EtudiantEntity getEtudiant(
            @PathVariable("id") Long id
    ) {
        return this.etudiantService.getEtudiant(id);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping(path = "ajout")
    public EtudiantEntity addEtudiant(
            @RequestBody EtudiantEntity etudiantEntity
    ) {
        return this.etudiantService.addEtudiant(etudiantEntity);
    }

    @DeleteMapping(path = "{id}")
    public void deleteEtudiantById(
            @PathVariable("id") Long id
    ) {
        this.etudiantService.deleteEtudiant(id);
    }
}

package com.example.demo.etudiants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "etudiant")
public class EtudiantController {

    private final EtudiantService etudiantService;

    @Autowired
    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @GetMapping(path = "{id}")
    public EtudiantEntity getEtudiantService(
            @PathVariable("id") Long id
    ) {
        return this.etudiantService.getEtudiant(id);
    }

    @PostMapping(path = "ajout")
    public EtudiantEntity addEtudiant(
            @RequestBody EtudiantEntity etudiantEntity
    ) {
        return this.etudiantService.addEtudiant(etudiantEntity);
    }
}

package com.rabiiFirst.infoSysProj.controller;

import com.rabiiFirst.infoSysProj.model.Fournisseur;
import com.rabiiFirst.infoSysProj.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/fournisseur")
public class FournisseurController {
    @Autowired
    FournisseurService fournisseurService;

    @GetMapping("/getallfournisseur")
    public List<Fournisseur> getAllFournisseur() {
        return fournisseurService.getAllFournisseur();
    }

    @GetMapping("/{id}")
    public Optional<Fournisseur> getFournisseurById(@PathVariable int id) {
        return fournisseurService.getFournisseurById(id);
    }

    @PostMapping("/addfournisseur")
    public ResponseEntity<Object> addFournisseur(@RequestBody Fournisseur f) {
        return fournisseurService.addFournisseur(f);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteFournisseurById(@PathVariable int id) {
        return fournisseurService.deleteFournisseurById(id);
    }

    @DeleteMapping("/deleteallfournisseur")
    public ResponseEntity<Object> deleteAllFournisseur() {
        return fournisseurService.deleteAllFournisseur();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> updateFournisseurById(@PathVariable int id, @RequestBody Fournisseur f) {
        return fournisseurService.updateFournisseurById(id,f);
    }
}

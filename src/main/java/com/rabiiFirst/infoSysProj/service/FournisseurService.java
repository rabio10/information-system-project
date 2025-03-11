package com.rabiiFirst.infoSysProj.service;

import com.rabiiFirst.infoSysProj.model.Fournisseur;
import com.rabiiFirst.infoSysProj.repository.FournisseurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FournisseurService {
    @Autowired
    FournisseurRepo fournisseurRepo;


    public List<Fournisseur> getAllFournisseur() {
        return fournisseurRepo.findAll();
    }

    public Optional<Fournisseur> getFournisseurById(int id) {
        return fournisseurRepo.findById(id);
    }

    // TODO : we should know how to handle the classFournisseur from the request ,
    //  should be included in the request ?
    public ResponseEntity<Object> addFournisseur(Fournisseur f) {
        String error = "";
        try {
            Fournisseur fAdded = fournisseurRepo.save(f);
            return ResponseEntity.status(HttpStatus.CREATED).body(fAdded);
        } catch (Exception e) {
            error = e.getMessage();
            // TODO : so there's two options to return the error; either 500 + error msg ,
            //  or badRequest and a well structured error object.... we'll decide later
            //return ResponseEntity.badRequest().body(new ErrorResponse(error));
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
        }
    }

    public ResponseEntity<Object> deleteFournisseurById(int id) {
        try {
            fournisseurRepo.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("fournisseur deleted");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    public ResponseEntity<Object> deleteAllFournisseur() {
        try {
            fournisseurRepo.deleteAll();
            return ResponseEntity.status(HttpStatus.OK).body("all fournisseurs deleted");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    public ResponseEntity<Object> updateFournisseurById(int id, Fournisseur f) {
        // check if that fournisseur exists in database
        Optional<Fournisseur> fdb = fournisseurRepo.findById(id);
        if (fdb.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("fournisseur not found to be updated");
        } else {
            // fournisseur exists , update it's values
            // 1. get the content of the optional to an actual object
            Fournisseur fUpdate = fdb.get();
            // 2. update values (all of them)
            fUpdate.setNomFournisseur(f.getNomFournisseur());
            fUpdate.setEmailFournisseur(f.getEmailFournisseur());
            fUpdate.setAdresseFournisseur(f.getAdresseFournisseur());
            fUpdate.setClassFournisseur(f.getClassFournisseur());
            fUpdate.setTelephoneFournisseur(f.getTelephoneFournisseur());
            // 3. save to database
            try {
                fournisseurRepo.save(fUpdate);
                return ResponseEntity.status(HttpStatus.OK).body("fournisseur updated");
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
            }
        }

    }
}

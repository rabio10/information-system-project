package com.rabiiFirst.infoSysProj.service;

import com.rabiiFirst.infoSysProj.model.Client;
import com.rabiiFirst.infoSysProj.repository.ClientRepo;
import com.rabiiFirst.infoSysProj.utils.ErrorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepo clientRepo;

    public ResponseEntity<Object> addClient(Client client) {
        String error = "";
        try {
            Client cliAdded = clientRepo.save(client);
            return ResponseEntity.status(HttpStatus.CREATED).body(cliAdded);
        } catch (Exception e) {
            error = e.getMessage();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
        }
    }

    public List<Client> getAllClients() {
        return clientRepo.findAll();
    }

    public Optional<Client> getClientById(int id) {
        return clientRepo.findById(id);
    }

    public String deleteClientById(int id) {
        if (clientRepo.findById(id).isEmpty()) {
            return "Client not found";
        }
        clientRepo.deleteById(id);
        return "Client deleted";
    }

    public String deleteAllClients() {
        clientRepo.deleteAll();
        return "all clients deleted";
    }

    public ResponseEntity<Object> updateClientById(int id, Client c) {
        // check if that client exists in database
        Optional<Client> cdb = clientRepo.findById(id);
        if (cdb.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("client not found to be updated");
        } else {
            // client exists, update its values
            // 1. get the content of the optional to an actual object
            Client cUpdate = cdb.get();
            // 2. update values (all of them)
            cUpdate.setNomClient(c.getNomClient());
            cUpdate.setPrenomClient(c.getPrenomClient());
            cUpdate.setEmailClient(c.getEmailClient());
            cUpdate.setAdresseClient(c.getAdresseClient());
            cUpdate.setTelephoneClient(c.getTelephoneClient());
            cUpdate.setCodePostalClient( c.getCodePostalClient() );
            cUpdate.setVilleClient( c.getVilleClient() );
            // 3. save to database
            try {
                clientRepo.save(cUpdate);
                return ResponseEntity.status(HttpStatus.OK).body("client updated");
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
            }
        }
    }
}

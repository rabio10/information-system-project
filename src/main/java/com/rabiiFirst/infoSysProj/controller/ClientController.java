package com.rabiiFirst.infoSysProj.controller;

import com.rabiiFirst.infoSysProj.model.Client;
import com.rabiiFirst.infoSysProj.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @PostMapping("/addClient")
    public ResponseEntity<Object> addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @GetMapping("/getAllClients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Optional<Client> getClientById(@PathVariable int id) {
        return clientService.getClientById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteClientById(@PathVariable int id) {
        return clientService.deleteClientById(id);
    }

    @DeleteMapping("/deleteAllClients")
    public String deleteAllClients() {
        return clientService.deleteAllClients();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> updateClient(@PathVariable int id, @RequestBody Client client) {
        return clientService.updateClientById(id, client);
    }
}

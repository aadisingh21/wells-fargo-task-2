package com.example.services;

import com.example.entities.Client;
import com.example.repositories.ClientRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> getAllClients() {
        return repository.findAll();
    }

    public Optional<Client> getClientById(Long id) {
        return repository.findById(id);
    }

    public Client saveClient(Client client) {
        return repository.save(client);
    }

    public void deleteClient(Long id) {
        repository.deleteById(id);
    }
}

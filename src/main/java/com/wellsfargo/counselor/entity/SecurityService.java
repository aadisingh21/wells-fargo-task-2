package com.example.services;

import com.example.entities.Security;
import com.example.repositories.SecurityRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SecurityService {

    private final SecurityRepository repository;

    public SecurityService(SecurityRepository repository) {
        this.repository = repository;
    }

    public List<Security> getAllSecurities() {
        return repository.findAll();
    }

    public Optional<Security> getSecurityById(Long id) {
        return repository.findById(id);
    }

    public Security saveSecurity(Security security) {
        return repository.save(security);
    }

    public void deleteSecurity(Long id) {
        repository.deleteById(id);
    }
}

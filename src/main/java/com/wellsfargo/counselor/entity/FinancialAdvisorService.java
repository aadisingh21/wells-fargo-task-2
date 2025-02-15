package com.example.services;

import com.example.entities.FinancialAdvisor;
import com.example.repositories.FinancialAdvisorRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FinancialAdvisorService {

    private final FinancialAdvisorRepository repository;

    public FinancialAdvisorService(FinancialAdvisorRepository repository) {
        this.repository = repository;
    }

    public List<FinancialAdvisor> getAllAdvisors() {
        return repository.findAll();
    }

    public Optional<FinancialAdvisor> getAdvisorById(Long id) {
        return repository.findById(id);
    }

    public FinancialAdvisor saveAdvisor(FinancialAdvisor advisor) {
        return repository.save(advisor);
    }

    public void deleteAdvisor(Long id) {
        repository.deleteById(id);
    }
}

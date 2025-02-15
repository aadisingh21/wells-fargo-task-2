package com.example.services;

import com.example.entities.Portfolio;
import com.example.repositories.PortfolioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PortfolioService {

    private final PortfolioRepository repository;

    public PortfolioService(PortfolioRepository repository) {
        this.repository = repository;
    }

    public List<Portfolio> getAllPortfolios() {
        return repository.findAll();
    }

    public Optional<Portfolio> getPortfolioById(Long id) {
        return repository.findById(id);
    }

    public Portfolio savePortfolio(Portfolio portfolio) {
        return repository.save(portfolio);
    }

    public void deletePortfolio(Long id) {
        repository.deleteById(id);
    }
}

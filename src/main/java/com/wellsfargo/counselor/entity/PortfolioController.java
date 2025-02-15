package com.example.controllers;

import com.example.entities.Portfolio;
import com.example.services.PortfolioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/portfolios")
public class PortfolioController {

    private final PortfolioService service;

    public PortfolioController(PortfolioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Portfolio> getAllPortfolios() {
        return service.getAllPortfolios();
    }

    @GetMapping("/{id}")
    public Optional<Portfolio> getPortfolioById(@PathVariable Long id) {
        return service.getPortfolioById(id);
    }

    @PostMapping
    public Portfolio createPortfolio(@RequestBody Portfolio portfolio) {
        return service.savePortfolio(portfolio);
    }

    @DeleteMapping("/{id}")
    public void deletePortfolio(@PathVariable Long id) {
        service.deletePortfolio(id);
    }
}

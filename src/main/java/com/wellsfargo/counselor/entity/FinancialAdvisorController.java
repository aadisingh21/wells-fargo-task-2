package com.example.controllers;

import com.example.entities.FinancialAdvisor;
import com.example.services.FinancialAdvisorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/advisors")
public class FinancialAdvisorController {

    private final FinancialAdvisorService service;

    public FinancialAdvisorController(FinancialAdvisorService service) {
        this.service = service;
    }

    @GetMapping
    public List<FinancialAdvisor> getAllAdvisors() {
        return service.getAllAdvisors();
    }

    @GetMapping("/{id}")
    public Optional<FinancialAdvisor> getAdvisorById(@PathVariable Long id) {
        return service.getAdvisorById(id);
    }

    @PostMapping
    public FinancialAdvisor createAdvisor(@RequestBody FinancialAdvisor advisor) {
        return service.saveAdvisor(advisor);
    }

    @DeleteMapping("/{id}")
    public void deleteAdvisor(@PathVariable Long id) {
        service.deleteAdvisor(id);
    }
}

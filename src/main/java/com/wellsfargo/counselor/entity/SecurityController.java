package com.example.controllers;

import com.example.entities.Security;
import com.example.services.SecurityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/securities")
public class SecurityController {

    private final SecurityService service;

    public SecurityController(SecurityService service) {
        this.service = service;
    }

    @GetMapping
    public List<Security> getAllSecurities() {
        return service.getAllSecurities();
    }

    @GetMapping("/{id}")
    public Optional<Security> getSecurityById(@PathVariable Long id) {
        return service.getSecurityById(id);
    }

    @PostMapping
    public Security createSecurity(@RequestBody Security security) {
        return service.saveSecurity(security);
    }

    @DeleteMapping("/{id}")
    public void deleteSecurity(@PathVariable Long id) {
        service.deleteSecurity(id);
    }
}

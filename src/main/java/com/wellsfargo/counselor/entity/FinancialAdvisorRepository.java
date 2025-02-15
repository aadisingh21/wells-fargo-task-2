package com.example.repositories;

import com.example.entities.FinancialAdvisor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialAdvisorRepository extends JpaRepository<FinancialAdvisor, Long> {
}

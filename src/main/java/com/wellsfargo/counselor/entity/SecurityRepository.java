package com.example.repositories;

import com.example.entities.Security;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityRepository extends JpaRepository<Security, Long> {
}

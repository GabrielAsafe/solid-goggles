package com.microservices.microservices.repository;

import com.microservices.microservices.model.Limits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LimitsRepository extends JpaRepository<Limits, Long> {
}

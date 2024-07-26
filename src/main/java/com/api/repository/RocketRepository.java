package com.api.repository;

import com.api.model.RocketJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RocketRepository extends JpaRepository<RocketJpa, Long> {
}

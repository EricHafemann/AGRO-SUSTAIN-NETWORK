package com.agrotag.network.infrastructure.persistence.jpa;

import com.agrotag.network.domain.entities.LeitorSensor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataLeitorSensorRepository extends JpaRepository<LeitorSensor, Long> {
    List<LeitorSensor> findBySensorId(Long id);
}

package com.agrotag.network.domain.repositories;

import com.agrotag.network.domain.entities.LeitorSensor;

import java.util.List;
import java.util.Optional;

public interface LeitorSensorRepository {

    Optional<LeitorSensor> findById (Long id);
    Optional<LeitorSensor> save(LeitorSensor leitorSensor);
    void update(LeitorSensor leitorSensor);
    void deleteById(Long id);
    boolean existsById(Long id);
    List<LeitorSensor> findAll ();
    List<LeitorSensor> findBySensorId (Long id);
}

package com.agrotag.network.infrastructure.persistence.impl;

import com.agrotag.network.domain.entities.LeitorSensor;
import com.agrotag.network.domain.repositories.LeitorSensorRepository;
import com.agrotag.network.infrastructure.persistence.jpa.SpringDataLeitorSensorRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LeitorSensorRepositoryImpl implements LeitorSensorRepository {

    private final SpringDataLeitorSensorRepository springDataRepository;

    public LeitorSensorRepositoryImpl(SpringDataLeitorSensorRepository springDataRepository) {
        this.springDataRepository = springDataRepository;
    }

    @Override
    public Optional<LeitorSensor> findById(Long id) {
        return springDataRepository.findById(id);
    }

    @Override
    public Optional<LeitorSensor> save(LeitorSensor leitorSensor) {
        return Optional.of(springDataRepository.save(leitorSensor));
    }

    @Override
    public void update(LeitorSensor leitorSensor) {
        springDataRepository.save(leitorSensor);
    }

    @Override
    public void deleteById(Long id) {
        springDataRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return springDataRepository.existsById(id);
    }

    @Override
    public List<LeitorSensor> findAll() {
        return springDataRepository.findAll();
    }

    @Override
    public List<LeitorSensor> findBySensorId(Long id) {
        return springDataRepository.findBySensorId(id);
    }
}
package com.rocketseat.planner.activity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

/**
 * Interface que representa o repositório de atividades (Activity).
 * Estende JpaRepository para fornecer operações CRUD padrão e consultas específicas.
 */
public interface ActivityRepository extends JpaRepository<Activity, UUID> {

    /**
     * Encontra todas as atividades associadas a uma determinada viagem.
     *
     * @param tripId O identificador único da viagem.
     * @return Uma lista de atividades associadas à viagem especificada.
     */
    List<Activity> findByTripId(UUID tripId);
}
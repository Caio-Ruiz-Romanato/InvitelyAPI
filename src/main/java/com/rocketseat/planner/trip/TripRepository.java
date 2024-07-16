package com.rocketseat.planner.trip;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TripRepository é uma interface que estende JpaRepository para fornecer
 * operações CRUD para a entidade Trip.
 *
 * Esta interface permite a realização de operações como salvar, deletar,
 * atualizar e buscar viagens no banco de dados, utilizando UUID como
 * identificador único.
 */
public interface TripRepository extends JpaRepository<Trip, UUID> {

}
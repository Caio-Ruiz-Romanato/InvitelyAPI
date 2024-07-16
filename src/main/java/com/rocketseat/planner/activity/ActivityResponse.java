package com.rocketseat.planner.activity;

import java.util.UUID;

/**
 * Classe que representa a resposta contendo o identificador de uma atividade.
 *
 * @param activityId O identificador único da atividade.
 */
public record ActivityResponse(UUID activityId) {

    /**
     * Construtor que garante que o campo activityId não seja nulo.
     *
     * @param activityId O identificador único da atividade.
     */
    public ActivityResponse {
        if (activityId == null) {
            throw new IllegalArgumentException("O campo activityId não pode ser nulo.");
        }
    }
}

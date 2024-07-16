package com.rocketseat.planner.activity;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Classe que representa os dados de uma Atividade (Activity).
 *
 * @param id        Identificador único da atividade.
 * @param title     Título da atividade.
 * @param occurs_at Data e hora em que a atividade ocorre.
 */
public record ActivityData(UUID id, String title, LocalDateTime occurs_at) {

    /**
     * Construtor que garante que nenhum campo seja nulo.
     * Pass-Jornada
     * @param id        Identificador único da atividade.
     * @param title     Título da atividade.
     * @param occurs_at Data e hora em que a atividade ocorre.
     */
    public ActivityData {
        if (id == null || title == null || occurs_at == null) {
            throw new IllegalArgumentException("Os campos id, title e occurs_at não podem ser nulos.");
        }
    }
}
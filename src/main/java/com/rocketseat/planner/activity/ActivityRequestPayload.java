package com.rocketseat.planner.activity;

/**
 * Classe que representa o payload da requisição para criar ou atualizar uma atividade.
 *
 * @param title     O título da atividade.
 * @param occurs_at A data e hora em que a atividade ocorre, no formato de string.
 */
public record ActivityRequestPayload(String title, String occurs_at) {

    /**
     * Construtor que garante que nenhum campo seja nulo ou vazio.
     *
     * @param title     O título da atividade.
     * @param occurs_at A data e hora em que a atividade ocorre, no formato de string.
     */
    public ActivityRequestPayload {
        if (title == null || title.isBlank() || occurs_at == null || occurs_at.isBlank()) {
            throw new IllegalArgumentException("Os campos title e occurs_at não podem ser nulos ou vazios.");
        }
    }
}
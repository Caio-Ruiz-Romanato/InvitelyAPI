package com.rocketseat.planner.trip;

import java.util.List;

/**
 * TripRequestPayload é um registro que representa os dados necessários
 * para criar ou atualizar uma viagem.
 *
 * @param destination       Destino da viagem.
 * @param starts_at         Data e hora de início da viagem no formato ISO.
 * @param ends_at           Data e hora de término da viagem no formato ISO.
 * @param emails_to_invite  Lista de emails dos participantes a serem convidados.
 * @param owner_email       Email do dono da viagem.
 * @param owner_name        Nome do dono da viagem.
 */
public record TripRequestPayload(
        String destination,
        String starts_at,
        String ends_at,
        List<String> emails_to_invite,
        String owner_email,
        String owner_name) {
}

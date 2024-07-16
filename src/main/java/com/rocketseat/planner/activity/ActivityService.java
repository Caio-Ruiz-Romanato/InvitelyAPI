package com.rocketseat.planner.activity;

import com.rocketseat.planner.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Serviço que gerencia as operações relacionadas a atividades (Activity).
 */
@Service
public class ActivityService {

    @Autowired
    private ActivityRepository repository;

    /**
     * Registra uma nova atividade no repositório.
     *
     * @param payload Os dados da atividade a ser registrada.
     * @param trip    A viagem associada à atividade.
     * @return Uma resposta contendo o identificador da atividade registrada.
     */
    public ActivityResponse registerActivity(ActivityRequestPayload payload, Trip trip) {
        // Cria uma nova atividade a partir do payload e da viagem associada
        Activity newActivity = new Activity(payload.title(), payload.occurs_at(), trip);

        // Salva a nova atividade no repositório
        this.repository.save(newActivity);

        // Retorna uma resposta com o identificador da atividade registrada
        return new ActivityResponse(newActivity.getId());
    }

    /**
     * Recupera todas as atividades associadas a um identificador de viagem.
     *
     * @param tripId O identificador único da viagem.
     * @return Uma lista de dados das atividades associadas à viagem especificada.
     */
    public List<ActivityData> getAllActivitiesFromId(UUID tripId) {
        // Recupera as atividades associadas ao tripId e as mapeia para ActivityData
        return this.repository.findByTripId(tripId).stream()
                .map(activity -> new ActivityData(activity.getId(), activity.getTitle(), activity.getOccursAt()))
                .toList();
    }
}

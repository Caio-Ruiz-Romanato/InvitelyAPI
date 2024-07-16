package com.rocketseat.planner.activity;

import com.rocketseat.planner.trip.Trip;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * Classe que representa uma Atividade (Activity) associada a uma Viagem (Trip).
 */
@Entity
@Table(name = "activities")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Activity {

    /**
     * Identificador único da atividade, gerado automaticamente.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    /**
     * Data e hora em que a atividade ocorre.
     */
    @Column(name = "occurs_at", nullable = false)
    private LocalDateTime occursAt;

    /**
     * Título da atividade.
     */
    @Column(nullable = false)
    private String title;

    /**
     * A viagem associada a esta atividade.
     */
    @ManyToOne
    @JoinColumn(name = "trip_id", nullable = false)
    private Trip trip;

    /**
     * Construtor personalizado para criar uma atividade com um título, data e hora, e uma viagem associada.
     *
     * @param title     O título da atividade.
     * @param occursAt  A data e hora em que a atividade ocorre, no formato ISO_DATE_TIME.
     * @param trip      A viagem associada a esta atividade.
     */
    public Activity(String title, String occursAt, Trip trip) {
        this.title = title;
        this.occursAt = LocalDateTime.parse(occursAt, DateTimeFormatter.ISO_DATE_TIME);
        this.trip = trip;
    }
}
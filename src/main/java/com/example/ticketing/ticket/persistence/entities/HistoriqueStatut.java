package com.example.ticketing.ticket.persistence.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HistoriqueStatut {
    @Id
    private Long id;
    private String ancienStatut;
    private String nouveauStatut;
    private LocalDateTime date;
    @ManyToOne
    private Utilisateur modifiePar;
    @ManyToOne
    private Ticket ticket;


}

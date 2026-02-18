package com.example.ticketing.ticket.persistence.entities;


import com.example.ticketing.ticket.persistence.enums.TicketStatut;
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
    @Enumerated(EnumType.STRING)
    private TicketStatut ancienStatut;
    @Enumerated(EnumType.STRING)
    private TicketStatut nouveauStatut;
    private LocalDateTime date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modifie_par_id")
    private Utilisateur modifiePar;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}

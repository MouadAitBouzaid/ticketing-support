package com.example.ticketing.ticket.persistence.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UUID;


import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Commentaire {
    @Id
    private Long id;
    private String contenu;
    private LocalDateTime dateCreation;
    @ManyToOne
    private Utilisateur auteur;
    @ManyToOne
    private Ticket ticket;
}

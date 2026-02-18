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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "auteur_id", nullable = false)
    private Utilisateur auteur;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticket_id", nullable = false)
    private Ticket ticket;
    @PrePersist
    public void onCreate() {
        this.dateCreation = LocalDateTime.now();
    }
}

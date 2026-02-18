package com.example.ticketing.ticket.persistence.entities;

import com.example.ticketing.ticket.persistence.enums.TicketPriorite;
import com.example.ticketing.ticket.persistence.enums.TicketStatut;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    @Enumerated(EnumType.STRING)
    private TicketStatut statut;
    @Enumerated(EnumType.STRING)
    private TicketPriorite priorite;
    @ManyToOne
    @JoinColumn(name = "created_by_id", nullable = false)
    private Utilisateur createdBy;
    @ManyToOne
    @JoinColumn(name = "assigned_to_id", nullable = true)
    private Utilisateur assignedTo;
    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Commentaire> commentaires;
    @OneToMany(mappedBy = "ticket")
    private List<HistoriqueStatut> historiques;
    private LocalDateTime dateCreation;
    private LocalDateTime dateDerniereMaj;
    @PrePersist
    public void onCreate(){
        this.dateCreation = LocalDateTime.now();
        this.dateDerniereMaj = LocalDateTime.now();
    }
    @PreUpdate
    public void onUdpdate() {
        this.dateDerniereMaj = LocalDateTime.now();
    }
}

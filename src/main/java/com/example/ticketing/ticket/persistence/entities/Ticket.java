package com.example.ticketing.ticket.persistence.entities;

import com.example.ticketing.ticket.persistence.enums.TicketPriorite;
import com.example.ticketing.ticket.persistence.enums.TicketStatut;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    private Long id;
    private String titre;
    private String description;
    @Enumerated(EnumType.STRING)
    private TicketStatut statut;
    @Enumerated(EnumType.STRING)
    private TicketPriorite priorite;
    @JoinColumn
    @Nullable
    @ManyToOne
    private Utilisateur createdBy;
    @JoinColumn
    @Nullable
    @ManyToOne
    private Utilisateur assignedTo;
    @OneToMany(mappedBy = "ticket")
    private List<Commentaire> commentaires;
    @OneToMany(mappedBy = "ticket")
    private List<HistoriqueStatut> historiques;

    @PrePersist
    public void onCreate(){
       LocalDateTime now = LocalDateTime.now();
    }
    @PreUpdate
    public void onUdpdate() {
        LocalDateTime  now = LocalDateTime.now();
    }
}

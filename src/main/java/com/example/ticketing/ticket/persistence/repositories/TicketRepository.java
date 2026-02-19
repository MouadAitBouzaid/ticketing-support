package com.example.ticketing.ticket.persistence.repositories;

import com.example.ticketing.ticket.persistence.entities.Ticket;
import com.example.ticketing.ticket.persistence.entities.Utilisateur;
import com.example.ticketing.ticket.persistence.enums.TicketPriorite;
import com.example.ticketing.ticket.persistence.enums.TicketStatut;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    public List<Ticket> findByStatut(TicketStatut ticketStatut);
    public List<Ticket> findByAssinedTo(Utilisateur assignedTo);
    public List<Ticket> findByPriority(TicketPriorite ticketPriorite);
    public List<Ticket> findByPriorityAndStatut(TicketPriorite ticketPriorite, TicketStatut ticketStatut);

}

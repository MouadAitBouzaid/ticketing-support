package com.example.ticketing.ticket.persistence.repositories;

import com.example.ticketing.ticket.persistence.entities.Ticket;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Optional<Ticket> findByStatut();

}

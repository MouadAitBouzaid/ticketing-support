package com.example.ticketing.ticket.persistence.repositories;

import com.example.ticketing.ticket.persistence.entities.Ticket;
import com.example.ticketing.ticket.persistence.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository <Utilisateur, Long>{
    Optional<Utilisateur> findByEmail(Long aLong);

}

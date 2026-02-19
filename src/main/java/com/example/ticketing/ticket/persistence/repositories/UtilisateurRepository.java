package com.example.ticketing.ticket.persistence.repositories;

import com.example.ticketing.ticket.persistence.entities.Ticket;
import com.example.ticketing.ticket.persistence.entities.Utilisateur;
import com.example.ticketing.ticket.persistence.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository <Utilisateur, Long>{
    public Utilisateur findByEmail(Utilisateur utilisateur);
    public boolean ifEmailExist(Utilisateur utilisateur);
    public Utilisateur findByRole(UserRole userRole);

}

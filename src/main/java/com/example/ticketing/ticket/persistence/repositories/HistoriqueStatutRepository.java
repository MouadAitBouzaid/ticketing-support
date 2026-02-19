package com.example.ticketing.ticket.persistence.repositories;

import com.example.ticketing.ticket.persistence.entities.HistoriqueStatut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriqueStatutRepository extends JpaRepository<HistoriqueStatut, Long> {


}

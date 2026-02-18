package com.example.ticketing.ticket.persistence.entities;

import com.example.ticketing.ticket.persistence.enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Email
    @Column(unique = true, nullable = false)
    private String email;
    private String motDePasse;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    private boolean actif;
}

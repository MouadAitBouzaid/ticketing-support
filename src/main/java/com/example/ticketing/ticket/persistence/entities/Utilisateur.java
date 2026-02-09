package com.example.ticketing.ticket.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {
    @Id
    private String id;
    @Email
    private String email;
    private String motDePasse;
    private String role;
    private boolean actif;
    //test auth github
}

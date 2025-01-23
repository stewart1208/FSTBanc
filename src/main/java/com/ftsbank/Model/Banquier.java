package com.ftsbank.Model;

import jakarta.persistence.*;
import jakarta.ejb.Stateless;

@Stateless
public class Banquier {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public void creerCompte(Compte compte) {
        // Logique pour créer un compte
        System.out.println("Compte créé : " + compte);
    }

    public void consulterCompte(Long numeroCompte) {
        // Logique pour consulter un compte
        System.out.println("Consultation du compte numéro : " + numeroCompte);
    }

    public void creerClient(Client client) {
        // Logique pour créer un client
        System.out.println("Client créé : " + client);
    }

    public void ajouterClient(Client client) {
        // Logique pour ajouter un client
        System.out.println("Client ajouté : " + client);
    }

    public void supprimerClient(Long clientId) {
        // Logique pour supprimer un client
        System.out.println("Client supprimé : " + clientId);
    }

    //Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

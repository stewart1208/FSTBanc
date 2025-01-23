package com.ftsbank.Model;


import com.ftsbank.Interface.Observer;

import jakarta.persistence.*;

@Entity
public class Compte implements Observer {
    @Id
    @GeneratedValue
    private Long numeroCompte;
    private double sold;
    private String typeCompte;

    public Compte() {
    }
    
    public Compte(Long numeroCompte, double sold, String typeCompte) {
        this.numeroCompte = numeroCompte;
        this.sold = sold;
        this.typeCompte = typeCompte;
    }
    public void update(String message) {
        System.out.println("Notification for account " + numeroCompte + ": " + message);
    }
    public void notify(String message) {
        System.out.println("Notification: " + message);
    }

    public Long getNumeroCompte() {
        return numeroCompte;
    }
    public void setNumeroCompte(Long numeroCompte) {
        this.numeroCompte = numeroCompte;
    }
    public double getSold() {
        return sold;
    }
    public void setSold(double sold) {
        this.sold = sold;
    }
    public String getTypeCompte() {
        return typeCompte;
    }
    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

}


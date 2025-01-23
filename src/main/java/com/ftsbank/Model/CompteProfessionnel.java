package com.ftsbank.Model;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("PARTICULIER")
public class CompteProfessionnel extends Compte {
    @ManyToOne
    private Client client;

    public CompteProfessionnel(Long numeroCompte, double sold, String typeCompte, Client client) {
        super(numeroCompte, sold, typeCompte);
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
}

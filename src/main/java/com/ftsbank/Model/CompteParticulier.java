package com.ftsbank.Model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("PARTICULIER")
public class CompteParticulier extends Compte {
    
    @ManyToMany
    @JoinTable(
        name = "compte_client",
        joinColumns = @JoinColumn(name = "compte_id"),
        inverseJoinColumns = @JoinColumn(name = "client_id")
    )
    private List<Client> clients = new ArrayList<>();

    public CompteParticulier(Long numeroCompte, double sold, String typeCompte, Client client) {
        super(numeroCompte, sold, typeCompte);
        clients.add(client);
    }

    public void addClientParticulier(Client client) {
        if (!clients.contains(client)) {
            clients.add(client);
        }
    }

    public void removeClientParticulier(Client client, Long numCompte) {
        clients.remove(client);
    }

    public List<Client> getClients() {
        return clients;
    }
    public void setClients(Client clients) {
        List<Client> client = new ArrayList<>();
        client.add(clients);
    }
    
}
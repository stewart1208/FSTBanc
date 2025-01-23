package com.ftsbank.Controller;
import com.ftsbank.Model.Client;
import com.ftsbank.Model.Compte;
import com.ftsbank.Model.CompteParticulier;

public class CompteController {
    public void addClientParticulier(CompteParticulier compte , Client client) {
        compte.getClients().add(client);
    }
    public void removeClientParticulier(Client client,CompteParticulier compte) {
        compte.getClients().remove(client);
    }
    public void retrait(Compte compte , double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant du retrait doit être positif.");
        }
        if (compte.getSold() < montant) {
            throw new IllegalArgumentException("Solde insuffisant pour effectuer le retrait.");
        }
        compte.setSold(compte.getSold()-montant);
        System.out.println("Retrait de  : " + montant);
        System.out.println("Solde : " +compte.getSold());
    }
    public void Attache(Compte compte) {
        System.out.println("Numero de Compte: " + compte.getNumeroCompte());
        System.out.println("Solde: " + compte.getSold());
        System.out.println("Type de Compte: " + compte.getTypeCompte());
    }
    public void Detache(Compte compte) {
        System.out.println("Détachement du compte numéro: " + compte.getNumeroCompte());
    }
}

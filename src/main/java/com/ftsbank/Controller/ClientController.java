package com.ftsbank.Controller;
import com.ftsbank.Model.Client;
import com.ftsbank.Model.Compte;
public class ClientController {
    public void update(Client client,String name, String typeClient) {
        if (name != null && !name.trim().isEmpty()) {
            client.setName(name);
        }
        if (typeClient != null && !typeClient.trim().isEmpty()) {
            client.setTypeClient(typeClient);
        }
    }
    public void consulterCom(Client client) {
        if (client.getComptes().isEmpty()) {
            System.out.println("Aucun compte associé à ce client.");
            return;
        }
        for (Compte compte : client.getComptes()) {
            System.out.println("Compte ID: " + compte.getNumeroCompte());
            System.out.println("Solde: " + compte.getSold());
        }
    }
    public void effectuerVirement(Compte source, Compte destination, double montant) {
        if (source == null || destination == null) {
            System.out.println("Les comptes source ou destination sont invalides.");
            return;
        }
        if (source.getSold() >= montant) {
            source.setSold(source.getSold() - montant);
            destination.setSold(destination.getSold() + montant);
            System.out.println("Virement effectué avec succès.");
        } else {
            System.out.println("Solde insuffisant pour effectuer le virement.");
        }
    }
    public void effectuerRetrait(Compte compte, double montant) {
        if (compte == null) {
            System.out.println("Le compte spécifié est invalide.");
            return;
        }
        if (compte.getSold() >= montant) {
            compte.setSold(compte.getSold() - montant);
            System.out.println("Retrait effectué avec succès.");
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }
    public void imprimerReleve(Client client) {
        System.out.println("Relevé de compte pour le client: " + client.getName());
        for (Compte compte : client.getComptes()) {
            System.out.println("Compte ID: " + compte.getNumeroCompte());
            System.out.println("Solde: " + compte.getSold());
        }
    }
    public void ajouterCompte(Client client,Compte compte) {
        if (compte != null && !client.getComptes().contains(compte)) {
            client.getComptes().add(compte);
        }
    }
}

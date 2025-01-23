package com.ftsbank;

import com.ftsbank.Model.*;
import com.ftsbank.Interface.*;


import com.ftsbank.Controller.*;

public class Main {
    public static void main(String[] args) {
        CompteFactory fabriqueParticulier = new FabriqueParticulier();
        CompteFactory fabriqueProfessionnel = new FabriqueProfessionnel();
        ClientController clientController = new ClientController();
        CompteController compteController = new CompteController();
        ReleveController releveController = new ReleveController();
        Client client = new Client("Mohammed Bezzeghoud", "Particulier");
        Client client2 = new Client("Rafik ElBachir ", "Particulier");

        Compte compteParticulier = fabriqueParticulier.creerCompte(1L, 5000L, "Epargne", client);
        Compte compteParticulier2 = fabriqueParticulier.creerCompte(3L, 13500L, "Epargne", client2);
        Compte compteProfessionnel = fabriqueProfessionnel.creerCompte(2L, 15000L, "Courant", client);
        // Attachement des comptes au client 
        clientController.ajouterCompte(client2,compteParticulier2);
        clientController.ajouterCompte(client,compteParticulier);
        clientController.ajouterCompte(client,compteProfessionnel);

        // Affichage des comptes du client
        System.out.println("### Consultation des comptes du client 1");
        clientController.consulterCom(client);
        System.out.println("### Consultation des comptes du client 2");
        clientController.consulterCom(client2);
        // Opérations sur les comptes
        System.out.println("\n### Retrait sur le compte particulier ###");
        //compteParticulier.retrait(1200);
        compteController.retrait(compteParticulier,1200);
        System.out.println("\n### Virement du compte professionnel vers le particulier ###");
        //client.effectuerVirement(compteProfessionnel, compteParticulier, 2000);
        clientController.effectuerVirement(compteProfessionnel, compteParticulier, 2000);
        // Génération de relevés
        System.out.println("\n### Génération de relevés ###");
        releveController.setCompte(compteProfessionnel);
        releveController.csv();
        releveController.pdf();
        releveController.setCompte(compteParticulier);
        releveController.csv();
        releveController.pdf();
        // Affichage du relevé global
        System.out.println("\n### Impression du relevé global du client ###");
        clientController.imprimerReleve(client);
    }
}

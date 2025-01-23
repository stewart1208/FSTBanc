package com.ftsbank.Model;

import com.ftsbank.Interface.CompteFactory;

public class FabriqueParticulier implements CompteFactory {

    @Override
    public Compte creerCompte(Long Id,Long sold, String type, Client client) {
        return new CompteParticulier(Id, sold, type, client);
    }
}
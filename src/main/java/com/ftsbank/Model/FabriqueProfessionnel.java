package com.ftsbank.Model;

import jakarta.ejb.Stateless;
import com.ftsbank.Interface.CompteFactory;

@Stateless
public class FabriqueProfessionnel implements CompteFactory {
    @Override
    public Compte creerCompte(Long Id,Long sold, String type, Client client) {
        return new CompteProfessionnel(Id,sold, type, client);
    }
}

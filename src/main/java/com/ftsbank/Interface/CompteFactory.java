package com.ftsbank.Interface;

import com.ftsbank.Model.Client;
import com.ftsbank.Model.Compte;

public interface CompteFactory {
    Compte creerCompte(Long Id,Long sold, String type, Client client);
}

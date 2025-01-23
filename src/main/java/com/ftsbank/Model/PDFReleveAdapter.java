package com.ftsbank.Model;

import jakarta.ejb.Stateless;
import com.ftsbank.Interface.ReleveTarget;

@Stateless
public class PDFReleveAdapter implements ReleveTarget {

    @Override
    public void genererReleve(Compte compte) {
        String filename = "releve_" + compte.getNumeroCompte() + ".pdf";
        System.out.println("Génération d'un PDF fictif pour : " + filename);
        // Insérer ici la logique réelle avec une bibliothèque de génération PDF.
    }
}

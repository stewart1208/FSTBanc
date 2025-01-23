package com.ftsbank.Model;

import jakarta.ejb.Stateless;
import com.ftsbank.Interface.ReleveTarget;
import java.io.FileWriter;
import java.io.IOException;

@Stateless
public class CSVReleveAdapter implements ReleveTarget {

    @Override
    public void genererReleve(Compte compte) {
        String filename = "releve_" + compte.getNumeroCompte() + ".csv";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.append("Compte ID,Solde,Type de Compte\n");
            writer.append(compte.getNumeroCompte() + "," + compte.getSold() + "," + compte.getTypeCompte() + "\n");
            System.out.println("Relevé CSV généré avec succès : " + filename);
        } catch (IOException e) {
            System.err.println("Erreur lors de la génération du relevé CSV : " + e.getMessage());
        }
    }
}

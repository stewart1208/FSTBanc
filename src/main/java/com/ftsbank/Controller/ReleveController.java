package com.ftsbank.Controller;

import com.ftsbank.Model.CSVReleveAdapter;
import com.ftsbank.Model.Compte;
import com.ftsbank.Model.PDFReleveAdapter;

public class ReleveController {
    Compte compte ;
    CSVReleveAdapter csvReleve = new CSVReleveAdapter() ;
    PDFReleveAdapter pdfReleve = new PDFReleveAdapter() ;
    public void setCompte(Compte compte) {
        this.compte = compte;
    }
    public void csv(){
        csvReleve.genererReleve(compte);
    }
    public void pdf(){
        pdfReleve.genererReleve(compte);
    }
    
}

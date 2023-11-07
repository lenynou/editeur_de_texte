package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument {


    public CommandeMajuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : majuscules;debut;fin");
            return;
        }
        int debut = Integer.parseInt(parameters[1]); //index debut
        int fin = Integer.parseInt(parameters[2]); //index fin
        this.document.majuscules(debut, fin);
        super.executer();
    }

}
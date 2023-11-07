package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : remplacer;debut;fin;texte");
            return;
        }
        int debut = Integer.parseInt(parameters[1]); //index debut
        int fin = Integer.parseInt(parameters[2]); //index fin
        String texte = parameters[3]; //texte
        this.document.ajouter(texte);
        super.executer();
    }

}

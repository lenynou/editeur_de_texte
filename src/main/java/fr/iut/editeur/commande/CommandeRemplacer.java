package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;
/**
 * Permet de creer la methode remplacer
 */
public class CommandeRemplacer extends CommandeDocument {

    /**
     * Creer une class du type CommandeRemplacer
     * @param document le document sur lequel on va executer la commande
     * @param parameters les parametre de la commande
     */
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;debut;fin;texte");
            return;
        }
        int debut = Integer.parseInt(parameters[1]); //index debut
        int fin = Integer.parseInt(parameters[2]); //index fin
        String texte = parameters[3]; //texte
        this.document.remplacer(debut, fin , texte);
        super.executer();
    }

}

package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Permet de definir ce que fait la methode remplacer
     * @param start l'index auquel commence le remplacement
     * @param end l'index auquel fini le remplacement
     * @param remplacement le texte qui va remplacer le texte actuel
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }
    public void majuscules(int start, int end) {
        String maj = texte.substring(start, end);
        maj = maj.toUpperCase();
        remplacer(start, end, maj);
    }
    public void inserer(int start, String texte){
        String fin = this.texte.substring(start);
        effacer(start,  this.texte.length());
        ajouter(texte);
        ajouter(fin);
    }
    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }
    
    public void clear(){
        effacer(0, texte.length());
    }


    @Override
    public String toString() {
        return this.texte;
    }


}

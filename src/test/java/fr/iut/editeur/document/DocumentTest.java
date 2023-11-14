package fr.iut.editeur.document;

import junit.framework.TestCase;

public class DocumentTest extends TestCase {


    public void testRemplacer() {

        Document doc = new Document();
        doc.setTexte("oui euh moi c'est");
        doc.remplacer(0, 3, "exemple");

        assertEquals("exemple euh moi c'est", doc.getTexte());

    }

    public void testMajuscules() {
        Document doc = new Document();
        doc.setTexte("oui euh moi c'est");
        doc.majuscules(0,3);
        assertEquals("OUI euh moi c'est", doc.getTexte());
    }

    public void testInserer() {
        Document doc = new Document();
        doc.setTexte("oui euh moi c'est");
        doc.inserer(3, "non");
        assertEquals("ouinon euh moi c'est", doc.getTexte());
    }

    public void testEffacer() {
        Document doc = new Document();
        doc.setTexte("oui euh moi c'est");
        doc.effacer(4, 8);
        assertEquals("oui moi c'est", doc.getTexte());
    }
}

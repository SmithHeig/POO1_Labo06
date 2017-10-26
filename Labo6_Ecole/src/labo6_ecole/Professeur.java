/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo6_ecole;

/**
 *
 * @author James
 */
public class Professeur extends Personne {

    private String abreviation;

    Professeur(String nom, String prenom, String abreviation) {
        super(nom, prenom);
        this.abreviation = abreviation;
    }

    public String toString() {
        return super.toString() + " (" + abreviation + ")";
    }

    public String horaire() {
        return "lol xD mdr tu crois que j'ai créé ca ?";
    }
}

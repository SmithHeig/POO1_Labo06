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
public class Etudiant extends Personne {

    private int matricule;

    Etudiant(String nom, String prenom, int matricule) {
        super(nom, prenom);
        this.matricule = matricule;
    }

    public String toString() {
        return super.toString() + " " + matricule;
    }
}

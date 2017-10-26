/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo6_ecole;

/**
 *
 * @author Adrien Allemand
 */
public class Groupe {

    private int numero;
    private String orientation;
    private int trimestre;
    private Etudiant[] etudiants;
    private Lecon[] lecons;

    Groupe(int numero, String orientation, int trimestre, Etudiant... etudiants) {
        if (etudiants.length == 0) {
            throw new RuntimeException("You shall not pass... Any student!");
        }
        this.numero = numero;
        this.orientation = orientation;
        this.trimestre = trimestre;
        this.etudiants = etudiants;
    }

    public String horaire() {
        return null;
    }

    public String nom() {
        return orientation + trimestre + "-" + numero;
    }

    public int nombreEtudiants() {
        return etudiants.length;
    }

    public void definirLecon(Lecon... lecons) {
        if (lecons.length == 0) {
            throw new RuntimeException("You shall not pass... Any lecons!");
        }
        this.lecons = lecons; //FAUX manque plein de test
    }
}

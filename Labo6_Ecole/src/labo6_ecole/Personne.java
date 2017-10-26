/**
 * @brief Class représentant une personne
 * @authors Adrien Alleman, James Smith
 * @date 25.10.2017
 * @file Personne.java
 */
package labo6_ecole;

/**
 *
 * @author James
 */
public class Personne {

    private String nom;
    private String prenom;

    Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return nom + " " + prenom;
    }
}

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
public class Labo6_Ecole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Prof */
        Professeur ClaudeEvequoz = new Professeur("Evequoz", "Claude");
        Professeur PierDonini = new Professeur("Donini", "Pier");
        Professeur[] professeurs = {PierDonini,ClaudeEvequoz};
        
        /* Lecons */
        Lecon POO1_1 = new Lecon("POO1", 3, 3, 2, "G02", PierDonini);
        Lecon POO1_2 = new Lecon("POO1", 3, 6, 2, "H01", PierDonini);
        Lecon POO1_3 = new Lecon("POO1", 4, 3, 2, "G03", PierDonini);
        Lecon PLP_1 = new Lecon("PLP", 3, 8, 2, "H01", ClaudeEvequoz);        
        Lecon PLP_2 = new Lecon("PLP", 4, 9, 3, "H01", ClaudeEvequoz);
        Lecon TIC = new Lecon("TIC", 2, 10, 1, "F06");
        
        /* Etudiant */
        Etudiant JohnLenon = new Etudiant("Lenon", "John", 1234);
        /** to continue **/
        
    }

}

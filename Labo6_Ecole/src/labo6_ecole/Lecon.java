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
public class Lecon {
   private String matiere;
   private int jourSemaine;
   private int periodeDebut;
   private int duree;
   private String salle;
   
   Lecon(String matiere, int jourSemaine, int periodeDebut, int duree, String salle){
       this.matiere = matiere;
       this.jourSemaine = jourSemaine;
       this.periodeDebut = periodeDebut;
       this.duree = duree;
       this.salle = salle;
   }
   
   String horaire(){
       return null;
   }
}

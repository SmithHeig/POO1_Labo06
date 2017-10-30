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
public class Horaire {
    private Lecon[] lecons;
    
    Horaire(Lecon[] lecons){
        this.lecons = lecons;
    }
    
    public String toString(){
        final int NB_LECON_JOUR = 11;
        final int NB_JOUR = 5;
        String print = "";
        int[][] formatHoraire = new int[NB_JOUR][NB_LECON_JOUR];
        //Mise sous forme de tableau à 2D
        for(int i = 0; i < lecons.length; ++i){
            for(int j = 0; j < lecons[i].getDuree();++j){
                if(j == 0){
                    formatHoraire[lecons[i].getJourSemaine()][lecons[i].getPeriodeDebut()] = i;
                } else {
                    formatHoraire[lecons[i].getJourSemaine()][lecons[i].getPeriodeDebut() + j] = -1;
                }
            }
        }
        
        
        //Affichage
        print += "     |Lun          |Mar          |Mer          |Jeu          |Ven          |\n";
        for(int i = 0; i < NB_LECON_JOUR; ++i){
            print += "     ";
            print += printPeriode(i);
            for(int j = 0; j < NB_JOUR; ++j){
                if(formatHoraire[i][j] > 0){
                    print += "|-------------|\n";
                    print += "|" + lecons[formatHoraire[i][j]].toString()+"|\n";
                } else{
                    if(formatHoraire[i][j] == 0){
                        print += "|-------------|\n";
                    } else {
                        print += "|             |\n";
                    }
                    print += "|             |\n";
                }
            }
        }
        print += "     |-------------|-------------|-------------|-------------|-------------|";
        return null;
    }
    
    /*private void sort(){
        Lecon temp;
        for(int i = 0 ; i < lecons.length; ++i){
            for(int j = 0; j < lecons.length - i; ++j){
                if(lecons[j].getPeriodeDebut()>= lecons[j+1].getPeriodeDebut()){
                    if(lecons[j].getPeriodeDebut()!= lecons[j+1].getPeriodeDebut()|| lecons[j].getJourSemaine() > lecons[j+1].getJourSemaine()){
                        temp = lecons[j];
                        lecons[j] = lecons[j+1];
                        lecons[j+1] = temp;
                    }
                }
            }
        }
    }*/
    
    private String printPeriode(int periode){
        switch(periode){
            case 0:
                return " 8:30";
            case 1:
                return " 9:15";
            case 2:
                return "10:25";
            case 3:
                return "11:15";
            case 4:
                return "12:00";
            case 5:
                return "13:15";
            case 6:
                return "14:00";
            case 7:
                return "14:55";
            case 8:
                return "15:45";
            case 9:
                return "16:35";
            case 10:
                return "17:20";
            default:
                throw new RuntimeException("Wrong number of periode");
        }
    }
}

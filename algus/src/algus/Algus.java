/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algus;

/**
 *
 * @author ketuo
 */
public class Algus {
    public static void ilmakommentaar(int temperatuur){
        if(temperatuur>0){System.out.println("sulab");}
        else{System.out.println("jäätab");
        }
    }
    public static void toatemperatuur(int tuba){
        if(tuba < 35){System.out.println("pane kütet juurde");}
        else {
            if(tuba > 47){
               System.out.println("võta kütet maha"); }
            else{
               System.out.println("piisavalt soe");
            }
        }
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello,Web");
        ilmakommentaar(3);
        toatemperatuur(38);
    }
    
}
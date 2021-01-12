/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package speedcliker_gharib_bousquet;
import java.util.Random;
/**
 *
 * @author inesg
 */
public class Bouton {

    boolean etreAllume; // definie l'état du bouton
    //String couleur;
    //String couleur_vide;

    public Bouton(){ // constructeur de bouton

    etreAllume = false; 
     //couleur="R";
     //couleur_vide ="G";
    }

    public void Alummer_bouton(){// renvoie vrai si le bouton est allumer 
    etreAllume = true;
    
    }

    public void Eteindre_bouton(){ // renvoie vrai si le bouton est eteint
    etreAllume =false; 
   
    
    }
    
    //public String lirecouleurbouton(){
        //return couleur;
        
    //}
 }


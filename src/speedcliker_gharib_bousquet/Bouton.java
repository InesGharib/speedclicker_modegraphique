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

    boolean etreAllume = false; // definie l'état du bouton
    int x;
    int y;
 
    
    public Bouton(int x, int y) { // à permis de debeuguer le code lorsque le bouton ne s'allumer pas quand on débutait la partie
        this.x = x;
        this.y= y;
    }

    public void Alummer_bouton(){// renvoie vrai si le bouton est allumer 
    etreAllume = true;
    
    }

    public void Eteindre_bouton(){ // renvoie vrai si le bouton est eteint
    etreAllume =false; 
   
    
    }
    
 }


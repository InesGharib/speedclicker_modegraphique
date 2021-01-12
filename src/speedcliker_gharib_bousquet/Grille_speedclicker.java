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
public class Grille_speedclicker {

        Bouton [][] grilleDeBoutons; // correspond à notre grille de jeu qui est composée de bouton 

    public Grille_speedclicker() { // constructeur de notre grille
    grilleDeBoutons = new Bouton[6][6]; // grille de 36 boutons 
        for (int i=0; i< 6; i++) {
            for (int j=0; j< 6; j++) {
                grilleDeBoutons[i][j] = new Bouton (); // permet de placer un bouton dans chaque case de grille 
                }
        }
    }
 
    public void allumer_BoutonAleatoire() { // methode qui permet d'allumer un bouton choisit aléatoirement en rose
    int x;
    int y;
    Random generateur = new Random();
    x = generateur.nextInt(6);
    y = generateur.nextInt(6);
    System.out.println("x = " + x + " et y = " + y); // affiche les coordonnées du bouton allumé
    grilleDeBoutons[x][y].Alummer_bouton();
    }
    
    //public void eteindre_bouton(){ // permet d'éteindre le bouton sur lequel le joueur à cliquer 
    
    //grilleDeBoutons[x][y].Eteindre_bouton();

    //}


    public void afficherGrilleSurConsole() { //permet d'afficher la grille sur la console le bouton allumé est representé par R et les boutons éteint sont G 
    for(int i = 0 ; i < 6 ; i++){
        for(int j = 0 ; j < 6 ; j++){
            if (grilleDeBoutons[i][j].etreAllume == true){ // si un des boutons de la case est allumé alors il s'affichera comme R dans la grille 
                System.out.print("R");
            }
            else{
            System.out.print("G");
            }    
                
            }
            System.out.println(); //affiche la grille sur la console 

        }
    }
}



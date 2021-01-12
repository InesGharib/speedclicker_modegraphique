/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedcliker_gharib_bousquet;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author inesg
 */
public class Partie_speedclicker {

    int Compteur = 0;
    Grille_speedclicker GrilleDeJeu = new Grille_speedclicker();
    Partie_speedclicker une_partie;
    boolean ArretduJeu = false;
    
    public void temps() {
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask() { // permet de mettre en place le timer et de donner un temps impartie de 30 secondes
            public void run() {
                une_partie.FinduJeu(); // indique la fin du jeu 
            }
        }, 30000);

        timer.schedule(new TimerTask() {
            long TempsImpartie = 30000; // long permet de stocker la variable du temps en milisecondes qui est de grand taille
            long startTime = 0;
            boolean AvertirleJoueur = false;

            public void run() {

                if (startTime == 0) {
                    startTime = System.currentTimeMillis();
                }

                long currentTime = System.currentTimeMillis(); // donne le temps actuel en milisecondes 
                long TempsRestant = TempsImpartie - (currentTime - startTime);

                if (TempsRestant <= 10000 && !AvertirleJoueur) {
                    System.out.println("💣 Plus que 10 secondes !");
                    AvertirleJoueur = true; // permet d'avertir le joueur qu'une seule fois au bout de 10 secondes
                }
            }
         ;
        }, 0, 1000);

    }
    public void debut_partie(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pseudo du joueur : ");
        Joueur J1 = new Joueur(sc.nextLine());
        
        une_partie.GrilleDeJeu.allumer_BoutonAleatoire(); 
        une_partie.GrilleDeJeu.afficherGrilleSurConsole();
    }
    public void deroulementPartie() {
        
        while (true) { // permet d'afficher la grille jusqu'à ce que le temps soit écoulé 
            une_partie.GrilleDeJeu.allumer_BoutonAleatoire(); // donne les coordonées du bouton allumé
            une_partie.GrilleDeJeu.afficherGrilleSurConsole();// affiche correctement la grille sur la console
            une_partie.CliquerBouton();

            if (une_partie.TimerAtteint()) { //indique la fin de la partie
                System.out.println("⏰ Temps imparti écoulé : la partie est terminée !");
                break;
            }
        }
    }

    public boolean CliquerBouton() {
        int colonne = 0;
        int ligne = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle est la ligne du bouton à éteindre ?");
        ligne = sc.nextInt() - 1;
        while (ligne > 6 || colonne < 0) {
            System.out.println("Erreur; Saisiez une autre ligne");
            ligne = sc.nextInt() - 1;
        }

        System.out.println("Quelle est sa colonne ?");
        colonne = sc.nextInt() - 1;

        while (colonne > 6 || ligne < 0) {
            System.out.println("Erreur : veuillez saisir une colonne valide :");
            colonne = sc.nextInt() - 1;

        }

        if (GrilleDeJeu.grilleDeBoutons[ligne][colonne].etreAllume == true) {
            GrilleDeJeu.grilleDeBoutons[ligne][colonne].Eteindre_bouton();
            Compteur = Compteur + 1;
            System.out.println("Le bouton a bien été cliqué! " + "vous avez cliqué : " + Compteur + " boutons");

            return true;
        } else {
            Compteur = Compteur - 1; // pénalité si on clique le mauvais bouton 
            System.out.println("Le bouton n'a pas  été cliqué!" + "vous avez cliqué : " + Compteur + " boutons");
            return false;
        }

    }

    
    public void FinduJeu() {
        ArretduJeu = true;
    }

    public boolean TimerAtteint() {
        return ArretduJeu;
    }

}

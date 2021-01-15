/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedcliker_gharib_bousquet;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author igharib
 */
public class BoutonGraphique extends JButton {
   
    Bouton BoutonAssociee;
    ImageIcon img_boutoneteind = new javax.swing.ImageIcon(getClass().getResource("/images/boutoneteind.png"));
    ImageIcon img_boutonallume = new javax.swing.ImageIcon(getClass().getResource("/images/boutonallume.png")); // changer l'image
            
            
               
 public BoutonGraphique(Bouton unbouton) { // quoi mettre comme paramètre 
        BoutonAssociee = unbouton ;
        
    } 
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
          setIcon(img_boutoneteind); // crée les différents boutons en mode graphique
           if (BoutonAssociee.etreAllume == true){ 
                setIcon(img_boutonallume);
                }
            else {
              
               setIcon(img_boutoneteind);  
               
                }
        
     
}
}




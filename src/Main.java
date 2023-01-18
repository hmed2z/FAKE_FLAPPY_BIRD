/**
 * Classe Main exécutable par la machine virtuelle
 * Création de la fenêtre du jeu (JFrame) dans le main
 */

import javax.swing.* ;

public class Main {

    public static void main(String [] args) {
        //Création d'instances de chaque classe
        Etat etat = new Etat() ;
        Affichage affichage = new Affichage(etat);
        Control control = new Control(etat,affichage) ;

        //Création de la fenêtre sous forme de JFrame
        JFrame flappy = new JFrame("Flappy Bird By Ahmed") ;
        flappy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flappy.add(affichage);
        flappy.pack();
        flappy.setVisible(true);
    }

}
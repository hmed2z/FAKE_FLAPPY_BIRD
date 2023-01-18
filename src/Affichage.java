/**
 * Classe Affichage s'occupant de la Vue du jeu
 */

import java.awt.*;
import javax.swing.* ;
import java.util.ArrayList;

public class Affichage extends JPanel {

    public static Etat etat ;

    /** Constructeur Affichage intégrant une instance de la classe Etat et définissant les dimensions de la fenêtre */
    public Affichage(Etat etat) {
        this.etat = etat ;
        setPreferredSize(new Dimension(etat.getLargeurEcran(),etat.getHauteurEcran())) ; //Définition des dimensions de la fenêtre JFrame créée dans le Main
    }

    /** methode paint héritée de JPanel visant à dessiner les composants de la fenêtre dont l'ovale */
    @Override
    public void paint (Graphics g) {
        super.paint(g) ; //la méthode s'appelle elle-même afin qu'elle puisse être mise à jour lors du clic de souris
        g.drawOval(etat.getX() , etat.getY() , etat.getLargeurOval() , etat.getHauteurOval()) ;
    }

}
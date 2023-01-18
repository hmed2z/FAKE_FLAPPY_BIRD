/**
 * Classe Control s'occupant de la partie contrôleur du jeu
 */

//import java.awt.event.* ;
import java.awt.event.MouseEvent ;
import java.awt.event.MouseListener ;

public class Control implements MouseListener {
    /** Création d'instances des classes Etat et Affichage afin de les lier au contrôleur */
    public static Etat etat ;
    public static Affichage affichage ;

    /** Constructeur de Control pour intégrer les instances de Etat et Affichage ainsi que la déclaration du mouseListener */
    public Control (Etat etat,Affichage affichage){
        this.etat = etat ;
        this.affichage = affichage ;
        affichage.addMouseListener(this); //ajout du mouseListener dans l'instace d'affichage afin de pouvoir exécuter les actions de la souris
    }

    /** méthode mouseClicked implémentée de mouseListener visant à définir les actions à effectuer lorsqu'on clique sur la souris */
    @Override
    public void mouseClicked (MouseEvent e) {
        etat.jump(); //augmentation de la hauteur de l'ovale selon SAUT
        affichage.repaint(); //réaffichage de la fenêtre après chaque clic
    }

    //implémentée de mouseListener mais non-utilisée
    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

}
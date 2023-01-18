/**
 * Classe Etat abritant toutes les variables et constantes nécessaires au code source
 * ainsi que leurs getters
 */

public class Etat {

    //Déclaration de toutes les variables et constantes nécessaires au fonctionnement du jeu
    public static final int LARGEUR_ECRAN = 1000 ;
    public static final int HAUTEUR_ECRAN = 600 ;
    public static final int LARGEUR_OVAL = 50 ;
    public static final int HAUTEUR_OVAL = 100 ;
    public static int X = 500 ;
    public static int Y = 300 ;
    public static final int SAUT = 20 ;

    /** Constructeur Etat important même s'il est vide */
    public Etat () {}

    /** retourne LARGEUR_ECRAN */
    int getLargeurEcran () {
        return LARGEUR_ECRAN ;
    }

    /** retourne HAUTEUR_ECRAN */
    int getHauteurEcran () {
        return HAUTEUR_ECRAN ;
    }

    /** retourne LARGEUR_OVAL */
    int getLargeurOval () {
        return LARGEUR_OVAL ;
    }

    /** retourne HAUTEUR_OVAL */
    int getHauteurOval () {
        return HAUTEUR_OVAL ;
    }

    /** retourne l'abcisse X de la position de l'ovale */
    int getX () {
        return X ;
    }

    /** retourne l'ordonnée Y de la position de l'ovale */
    int getY () {
        return Y ;
    }

    //non-utilisée pour l'instant
    int getSaut () {
        return SAUT ;
    }

    /** méthode jump servant à "hausser" la position de l'ovale de quelques pixels */
    public void jump () {
        Y = Y - SAUT ;
    }

}

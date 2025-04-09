package ui;

import javax.swing.*;

/**
 * Fenêtre principale de l'application avec onglets pour ajouter et rechercher des objets.
 */
public class FenetrePrincipale extends JFrame {
    public FenetrePrincipale() {
        setTitle("Gestion Objets Volés");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Centrer la fenêtre à l'écran

        JTabbedPane onglets = new JTabbedPane();
        onglets.addTab("Ajout d'objets", new PanneauAjoutObjet());
        onglets.addTab("Recherche d'Objet", new PanneauRechercheObjet());

        add(onglets);
    }
}
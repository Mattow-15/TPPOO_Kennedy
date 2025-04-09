package ui;

import dao.ObjetDAO;
import model.Objet;

import javax.swing.*;
import java.awt.*;

/**
 * Panneau permettant de rechercher un objet par son numéro de série.
 */
public class PanneauRechercheObjet extends JPanel {
    public PanneauRechercheObjet() {
        setLayout(new BorderLayout());

        JPanel haut = new JPanel();
        JTextField champNumero = new JTextField(20);
        JButton boutonRechercher = new JButton("Rechercher");

        haut.add(new JLabel("Numéro de série :"));
        haut.add(champNumero);
        haut.add(boutonRechercher);

        JTextArea zoneResultat = new JTextArea();
        zoneResultat.setEditable(false);

        add(haut, BorderLayout.NORTH);
        add(new JScrollPane(zoneResultat), BorderLayout.CENTER);

        // Action lors de la recherche
        boutonRechercher.addActionListener(e -> {
            String numero = champNumero.getText().trim();
            Objet resultat = ObjetDAO.rechercherParNumeroSerie(numero);
            if (resultat != null) {
                zoneResultat.setText("Objet trouvé :\n" + resultat);
            } else {
                zoneResultat.setText("Aucun objet trouvé pour ce numéro.");
            }
        });
    }
}
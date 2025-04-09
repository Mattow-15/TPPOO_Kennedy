package ui;

import dao.ObjetDAO;
import model.Objet;

import javax.swing.*;
import java.awt.*;

/**
 * Panneau pour saisir un nouvel objet et l'enregistrer dans la base.
 */
public class PanneauAjoutObjet extends JPanel {
    public PanneauAjoutObjet() {
        setLayout(new GridLayout(6, 2, 10, 10)); // Grille de 6 lignes et 2 colonnes

        // Champs de saisie
        JTextField champNom = new JTextField();
        JTextField champType = new JTextField();
        JTextField champNumeroSerie = new JTextField();
        JCheckBox caseVole = new JCheckBox("Objet volé");

        JButton boutonEnregistrer = new JButton("Enregistrer");
        JLabel etiquetteStatut = new JLabel();

        // Ajout des composants au panneau
        add(new JLabel("Nom de l'objet :"));
        add(champNom);
        add(new JLabel("Type de l'objet :"));
        add(champType);
        add(new JLabel("Numéro de série :"));
        add(champNumeroSerie);
        add(new JLabel(""));
        add(caseVole);
        add(new JLabel(""));
        add(boutonEnregistrer);
        add(new JLabel(""));
        add(etiquetteStatut);

        // Action lors du clic sur "Enregistrer"
        boutonEnregistrer.addActionListener(e -> {
            Objet obj = new Objet(champNom.getText(), champType.getText(),
                                  champNumeroSerie.getText(), caseVole.isSelected());
            ObjetDAO.sauvegarderObjet(obj);
            etiquetteStatut.setText("Objet enregistré avec succès !");
        });
    }
}
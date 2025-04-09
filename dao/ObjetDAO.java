package dao;

import model.Objet;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe de gestion de la persistance des objets dans un fichier texte.
 */
public class ObjetDAO {
    private static final String FICHIER = "objets.txt"; // Fichier de stockage

    // Méthode pour sauvegarder un objet dans le fichier
    public static void sauvegarderObjet(Objet objet) {
        try (FileWriter fw = new FileWriter(FICHIER, true)) {
            fw.write(objet.getNom() + ";" + objet.getType() + ";" + objet.getNumeroSerie() + ";" + objet.isEstVole() + "\n");
        } catch (IOException e) {
            e.printStackTrace(); // Affiche l'erreur s'il y a un problème
        }
    }

    // Méthode pour charger tous les objets du fichier
    public static List<Objet> chargerObjets() {
        List<Objet> objets = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FICHIER))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                String[] parties = ligne.split(";");
                if (parties.length == 4) {
                    objets.add(new Objet(parties[0], parties[1], parties[2], Boolean.parseBoolean(parties[3])));
                }
            }
        } catch (IOException e) {
            // Ignorer les erreurs si le fichier n'existe pas
        }
        return objets;
    }

    // Méthode pour rechercher un objet par numéro de série
    public static Objet rechercherParNumeroSerie(String numero) {
        for (Objet obj : chargerObjets()) {
            if (obj.getNumeroSerie().equalsIgnoreCase(numero)) {
                return obj;
            }
        }
        return null;
    }
}
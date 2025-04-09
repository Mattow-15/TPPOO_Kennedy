package model;

/**
 * Classe représentant un objet (ex : téléphone, ordinateur) avec ses caractéristiques.
 */
public class Objet {
    private String nom;
    private String type;
    private String numeroSerie;
    private boolean estVole;

    public Objet(String nom, String type, String numeroSerie, boolean estVole) {
        this.nom = nom;
        this.type = type;
        this.numeroSerie = numeroSerie;
        this.estVole = estVole;
    }

    // Méthode pour obtenir le nom de l'objet
    public String getNom() { return nom; }

    // Méthode pour obtenir le type de l'objet (ex: "Téléphone", "PC")
    public String getType() { return type; }

    // Méthode pour obtenir le numéro de série
    public String getNumeroSerie() { return numeroSerie; }

    // Méthode pour savoir si l'objet est volé
    public boolean isEstVole() { return estVole; }

    // Représentation textuelle de l'objet
    @Override
    public String toString() {
        return nom + " (" + type + ") - N° Série: " + numeroSerie + (estVole ? " [VOLÉ]" : " [OK]");
    }
}
import ui.FenetrePrincipale;

/**
 * Classe principale - Point d'entrée de l'application.
 */
public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new FenetrePrincipale().setVisible(true);
        });
    }
}
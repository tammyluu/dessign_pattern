package org.example;
import java.util.Map;

public class Main {
    /**
     * Point d'entrée de l'application.
     * @param args Arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {
        // Données de configuration simulées
        Map<String, String> simulatedConfig = Map.of(
                "db.host", "localhost",
                "db.port", "5432",
                "app.name", "MyApplication"
        );

        // Récupérer l'instance du Singleton
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Charger les configurations
        configManager.loadConfigurations(simulatedConfig);

        System.out.println("Host: " + configManager.getConfiguration("db.host"));
        System.out.println("Port: " + configManager.getConfiguration("db.port"));
        System.out.println("App Name: " + configManager.getConfiguration("app.name"));

        // Vérification de l'unicité de l'instance
        ConfigurationManager anotherInstance = ConfigurationManager.getInstance();
        System.out.println("Les instances sont les mêmes: " + (configManager == anotherInstance)); // true

        // Test pour empêcher une modification après le chargement
        try {
            configManager.loadConfigurations(Map.of("new.key", "newValue"));
        } catch (IllegalStateException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}




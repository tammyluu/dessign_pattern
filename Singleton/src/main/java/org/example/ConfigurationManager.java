package org.example;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe Singleton pour gérer les configurations globales d'une application.
 * Cette classe permet de charger une configuration depuis un dictionnaire,
 * de récupérer une configuration par clé et d'empêcher toute modification après le chargement.
 */

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configurations;
    private boolean isLoaded;

    // Constructeur privé pour empêcher l'instanciation directe
    private ConfigurationManager() {
        configurations = new HashMap<>();
        isLoaded = false;
    }

    /**
     * Retourne l'instance unique de la classe.
     * @return L'instance unique de ConfigurationManager.
     */

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }
    /**
     * Charge les configurations depuis un dictionnaire simulé.
     * Cette méthode ne peut être appelée qu'une seule fois. Si elle est appelée à nouveau,
     * une exception est levée.
     * @param config Un dictionnaire contenant les configurations à charger.
     * @throws IllegalStateException Si les configurations ont déjà été chargées.
     */

    public void loadConfigurations(Map<String, String> config) {
        if (!isLoaded) {
            configurations.putAll(config);
            configurations = Collections.unmodifiableMap(configurations); // Rendre les configurations immuables
            isLoaded = true;
        } else {
            throw new IllegalStateException("Les configurations ont déjà été chargées et ne peuvent pas être modifiées.");
        }
    }

    /**
     * Récupère la valeur d'une configuration à partir de sa clé.
     * @param key La clé de la configuration.
     * @return La valeur associée à la clé, ou null si la clé n'existe pas.
     */

    public String getConfiguration(String key) {
        return configurations.get(key);
    }

    /**
     * Vérifie si une clé existe dans les configurations.
     * @param key La clé à vérifier.
     * @return true si la clé existe, false sinon.
     */
    public boolean containsKey(String key) {
        return configurations.containsKey(key);
    }

}

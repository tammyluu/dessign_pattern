package org.example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Observateur qui écrit les notifications dans un fichier.
 */
public class FileObserver implements Observer {
    private final String filePath;

    public FileObserver(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void update(String event) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write("FileObserver: " + event);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erreur d'écriture dans le fichier : " + e.getMessage());
        }
    }
}

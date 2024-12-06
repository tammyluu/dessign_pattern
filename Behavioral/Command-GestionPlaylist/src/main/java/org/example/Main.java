package org.example;

public class Main {
    public static void main(String[] args) {
       PlayList playlist = new PlayList();
       PlayListControl manager = new PlayListControl();

        Song song1 = new Song("Bohemian Rhapsody", "Queen");
        Song song2 = new Song("Imagine", "John Lennon");
        Song song3 = new Song("Hotel California", "Eagles");


        Command addSong1 = new AddSongCommand(playlist, song1);
        Command addSong2 = new AddSongCommand(playlist, song2);
        Command addSong3 = new AddSongCommand(playlist, song3);

        manager.executeCommand(addSong1);
        manager.executeCommand(addSong2);
        manager.executeCommand(addSong3);

        playlist.showPlaylist();


        Command removeSong2 = new RemoveSongCommand( song2,playlist);
        manager.executeCommand(removeSong2);

        playlist.showPlaylist();

        // Annuler la dernière commande (remise de la chanson supprimée)
        manager.undoLastCommand();

        playlist.showPlaylist();
    }


}
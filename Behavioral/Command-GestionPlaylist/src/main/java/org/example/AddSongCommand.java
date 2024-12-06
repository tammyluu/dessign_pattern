package org.example;

public class AddSongCommand implements Command {
    private PlayList playlist;
    private Song song;

    public AddSongCommand(PlayList playlist, Song song) {
        this.playlist = playlist;
        this.song = song;

    }

    @Override
    public void execute() {
        playlist.addSong(song);

    }

    @Override
    public void undo() {
        playlist.removeSong(song);

    }
}

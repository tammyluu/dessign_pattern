package org.example;

public class RemoveSongCommand implements Command {
    private Song song;
    private PlayList playlist;

    public RemoveSongCommand(Song song, PlayList playlist) {
        this.song = song;
        this.playlist = playlist;
    }
    @Override
    public void execute() {
        playlist.removeSong(song);

    }

    @Override
    public void undo() {
        playlist.addSong(song);

    }
}

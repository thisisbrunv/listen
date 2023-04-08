package com.example.listen;

public class PlaylistMaisTocadas extends Playlist {

    private int numeroVezes;

    public PlaylistMaisTocadas(String nome) {
        super(nome);
        this.numeroVezes = 0;
    }

    public int getNumeroVezes() {
        return numeroVezes;
    }

    public void setNumeroVezes(int numeroVezes) {
        this.numeroVezes = numeroVezes;
    }

}

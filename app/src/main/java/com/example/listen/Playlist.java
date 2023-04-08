package com.example.listen;

import java.util.ArrayList;

public class Playlist {

    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void addMusica(Musica musica) {
        musicas.add(musica);
    }

    public void removeMusica(Musica musica) {
        musicas.remove(musica);
    }

}

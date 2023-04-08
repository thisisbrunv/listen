package com.example.listen;

import java.util.ArrayList;

public class Artista {

    private String nome;
    private List<Album> albuns;

    public Artista(String nome) {
        this.nome = nome;
        this.albuns = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }

    public void addAlbum(Album album) {
        albuns.add(album);
    }

    public void removeAlbum(Album album) {
        albuns.remove(album);
    }

}

package com.example.listen;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private String capa;
    private String ano;
    private String genero;
    private Artista artista;
    private List<Musica> musicas;

    public Album(String nome, String capa, String ano, String genero, Artista artista, List<Musica> musicas) {
        this.nome = nome;
        this.capa = capa;
        this.ano = ano;
        this.genero = genero;
        this.artista = artista;
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public String getCapa() {
        return capa;
    }

    public String getAno() {
        return ano;
    }

    public String getGenero() {
        return genero;
    }

    public Artista getArtista() {
        return artista;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }
}
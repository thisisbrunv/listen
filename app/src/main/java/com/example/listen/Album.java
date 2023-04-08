package com.example.listen;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String nome;
    private String capa;
    private String ano;
    private String genero;
    private List<Musica> musicas;

    public Album(String nome, String capa, String ano, String genero) {
        this.nome = nome;
        this.capa = capa;
        this.ano = ano;
        this.genero = genero;
        this.musicas = new ArrayList<>();
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

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void addMusica(Musica musica) {
        musicas.add(musica

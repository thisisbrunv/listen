package com.example.listen;

public class Musica {

    private String nome;
    private String audio;
    private String emocao;
    private int counterMusica;

    public Musica(String nome, String audio, String emocao) {
        this.nome = nome;
        this.audio = audio;
        this.emocao = emocao;
        this.counterMusica = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getAudio() {
        return audio;
    }

    public String getEmocao() {
        return emocao;
    }

    public int getCounterMusica() {
        return counterMusica;
    }

    public void setCounterMusica(int counterMusica) {
        this.counterMusica = counterMusica;
    }

    public void incrementCounterMusica() {
        this.counterMusica++;
    }

}

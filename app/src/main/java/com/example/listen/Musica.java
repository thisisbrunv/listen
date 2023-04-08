package com.example.listen;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

import java.util.ArrayList;
import java.util.List;

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

    public List<Musica> getMusicasArmazenadas(Context context) {

        List<Musica> musicas = new ArrayList<>();

        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        String[] projection = { MediaStore.Audio.Media._ID, MediaStore.Audio.Media.TITLE, MediaStore.Audio.Media.ARTIST, MediaStore.Audio.Media.DATA };
        String sortOrder = MediaStore.Audio.Media.TITLE + " ASC";

        Cursor cursor = contentResolver.query(uri, projection, null, null, sortOrder);

        if (cursor != null && cursor.moveToFirst()) {
            int idColumn = cursor.getColumnIndex(MediaStore.Audio.Media._ID);
            int titleColumn = cursor.getColumnIndex(MediaStore.Audio.Media.TITLE);
            int artistColumn = cursor.getColumnIndex(MediaStore.Audio.Media.ARTIST);
            int dataColumn = cursor.getColumnIndex(MediaStore.Audio.Media.DATA);

            do {
                String id = cursor.getString(idColumn);
                String nome = cursor.getString(titleColumn);
                String artista = cursor.getString(artistColumn);
                String caminho = cursor.getString(dataColumn);
                String emocao = "desconhecida"; // emoção desconhecida para músicas armazenadas localmente
                Musica musica = new Musica(nome, caminho, emocao);
                musicas.add(musica);
            } while (cursor.moveToNext());
        }

        if (cursor != null) {
            cursor.close();
        }

        return musicas;

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

package com.example.listen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listaMusicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMusicas = findViewById(R.id.lista_musicas);

        List<Musica> musicas = getMusicasArmazenadas(this);

        MusicaAdapter adapter = new MusicaAdapter(this, musicas);
        listaMusicas.setAdapter(adapter);

    }

    /*
    VERIFICAR SE FOI GARANTIDO A PERMISSÃO AOS ARQUIVOS

    if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
            != PackageManager.PERMISSION_GRANTED) {
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                REQUEST_READ_EXTERNAL_STORAGE);
    }

     */

}
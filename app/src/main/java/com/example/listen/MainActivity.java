package com.example.listen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listaMusicas;
    private static final int PERMISSION_REQUEST_CODE = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMusicas = findViewById(R.id.lista_musicas);

        List<Musica> musicas = getMusicasArmazenadas(this);

        MusicaAdapter adapter = new MusicaAdapter(this, musicas);
        listaMusicas.setAdapter(adapter);



    }


}
package com.example.listen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MusicaAdapter extends ArrayAdapter<Musica> {

    private LayoutInflater inflater;

    public MusicaAdapter(Context context, List<Musica> musicas) {
        super(context, R.layout.item_musica, musicas);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_musica, parent, false);
            holder = new ViewHolder();
            holder.nomeMusica = convertView.findViewById(R.id.nome_musica);
            holder.nomeArtista = convertView.findViewById(R.id.nome_artista);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Musica musica = getItem(position);
        holder.nomeMusica.setText(musica.getNome());
        holder.nomeArtista.setText(musica.getArtista());
        return convertView;
    }

    private static class ViewHolder {
        TextView nomeMusica;
        TextView nomeArtista;
    }

}

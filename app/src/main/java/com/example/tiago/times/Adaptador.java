package com.example.tiago.times;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by CASSIUS on 23/04/2017.
 */

class Adaptador extends ArrayAdapter<String> {
    private final Activity contexto;
    private final ArrayList<String> jogadores;

    public Adaptador(Activity contexto, ArrayList<String> jogadores) {
        super(contexto, R.layout.lista_titular, jogadores);

        this.contexto = contexto;
        this.jogadores = jogadores;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = contexto.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.lista_titular, null,true);

        String jogador = (String) getItem(position);

        TextView nomeJogador = (TextView) rowView.findViewById(R.id.nome);


        nomeJogador.setText(jogador);


        return rowView;

    };
}

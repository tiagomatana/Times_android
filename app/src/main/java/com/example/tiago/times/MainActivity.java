package com.example.tiago.times;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private String[] comboBox = new String[]{"","Internacional","Grêmio", "Novo Hamburgo"};
    private String[] inter = {
            "Danilo",
            "William",
            "Ortiz",
            "Cuesta",
            "Uendel",
            "Dourado",
            "Edenilson",
            "Anselmo",
            "D'Alessandro",
            "Nico Lopez",
            "Brenner"
    };
    private String[] gremio = {
            "Grohe",
            "Léo Moura",
            "Marcelo Oliveira",
            "Kannemann",
            "Geromel",
            "Maicom",
            "Ramiro",
            "Jaílson",
            "Douglas",
            "G.Fernandez",
            "Luan"

    };

    private String[] nh = {
            "Matheus",
            "Léo",
            "Júlio Santos",
            "Pablo",
            "Assis",
            "Preto",
            "Jardel",
            "Juninho",
            "Amaral",
            "Branquinho",
            "João Paulo"

    };
    private String[] limpa = {};

    ImageView logo;
    Spinner times;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView) findViewById(R.id.logo);
        logo.setImageResource(R.drawable.gauchao);
        lista = (ListView) findViewById(R.id.titulares);
        times = (Spinner) findViewById(R.id.times);
        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, comboBox);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        times.setAdapter(adapter);

        times.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        logo.setImageResource(R.drawable.inter);
                        lista.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, inter));
                        break;
                    case 2:
                        logo.setImageResource(R.drawable.gremio);
                        lista.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, gremio));
                        break;
                    case 3:
                        logo.setImageResource(R.drawable.nh);
                        lista.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, nh));
                        break;
                    default:
                        logo.setImageResource(R.drawable.gauchao);
                        lista.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, limpa));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        

    }



}

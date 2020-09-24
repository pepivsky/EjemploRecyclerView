package com.example.ejemplorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ejemplorecyclerview.adapter.AdapterDatos;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instancia
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        AdapterDatos adapterDatos = new AdapterDatos(crearlistaDatos()); //se crea  un adaptador con la lista de los datos
        recyclerView.setAdapter(adapterDatos); // se le pasa el adaptador al recyclerView
    }

    //llena la lista con 50 elementos
    public ArrayList<String> crearlistaDatos() {
        ArrayList<String> listaDatos = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            listaDatos.add("Elon Musk " + i);
        }
        return listaDatos;
    }
}
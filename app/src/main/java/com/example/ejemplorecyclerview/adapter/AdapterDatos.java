package com.example.ejemplorecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejemplorecyclerview.R;

import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {

    ArrayList<String> listaDatos; //lista con los elementos

    public AdapterDatos(ArrayList<String> listaDatos) {
        this.listaDatos = listaDatos;
    }

    //Metodo que enlaza este adaptador con el item_list
    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false); //infla nuestro view item_list
        return new ViewHolderDatos(view);
    }

    //metodo que se encarga de establecer la comunicacion entre el adaptador y el viewHolder
    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        String datoActual = listaDatos.get(position); //aqui podriamos pasarle un objeto de una clase
        holder.tvNombre.setText(datoActual); //aqui asignamos valores de la lista a nuestros views
    }

    //metodo que regresa el tamano de nuestra lista
    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    //En este metodo se instancian los views que tenems en el item_list
    public static class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView tvNombre;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvNombre);
        }
    }
}

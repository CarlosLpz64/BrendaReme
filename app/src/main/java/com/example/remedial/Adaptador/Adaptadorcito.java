package com.example.remedial.Adaptador;

import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.remedial.Modelos.Opciones;
import com.example.remedial.R;

import java.util.List;

public class Adaptadorcito extends RecyclerView.Adapter<Adaptadorcito.ViewHolder> {
    //CREAR LA LISTA
    List<Opciones> Lista;

    public Adaptadorcito(List<Opciones> lista) {
        Lista = lista;
    }

    @NonNull
    @Override
    public Adaptadorcito.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_itemcito,
                null,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptadorcito.ViewHolder holder, int position) {
        Opciones opc = Lista.get(position);
        holder.llenar(opc);

    }

    @Override
    public int getItemCount() {
        return Lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        //dar de alta

        ImageView img1;
        ImageView img2;
        TextView textito;
        Intent Inte;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //ES DEL DISEÑO ITEM
            img1=itemView.findViewById(R.id.imageView);
            img2=itemView.findViewById(R.id.imageView2);
            textito=itemView.findViewById(R.id.textView3);

            img2.setOnClickListener(this);
        }

        public void llenar(Opciones opc) {
           textito.setText(opc.getNombre());
           Inte=opc.getAccion();
           img1.setImageResource(opc.getImagencita());

        }
        @Override
        public void onClick(View v) {
            itemView.getContext().startActivity(Inte);
        }
    }
}


package com.example.parcial3pdm.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parcial3pdm.R;
import com.example.parcial3pdm.database.entity.combo;

import java.util.List;

public class comoAdapter extends RecyclerView.Adapter<comoAdapter.comboViewHolder>{
    List<combo> listaCombo;

    public comoAdapter(List<combo> listaCombo){
        this.listaCombo = listaCombo;
    }

    @NonNull
    @Override
    public comboViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.combo_item,parent,false);
        return new comboViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull comboViewHolder holder, int position) {
        combo Combo = listaCombo.get(position);
        holder.entrada.setText(Combo.getEntrada());
        holder.platoFuerte.setText(Combo.getPlatoFuerte());
        holder.postre.setText(Combo.getPostre());
        holder.precio.setText(String.valueOf(Combo.getPrecio()));
    }

    @Override
    public int getItemCount() {
        return listaCombo.size();
    }

    public class comboViewHolder extends RecyclerView.ViewHolder {
        TextView entrada, platoFuerte,postre,precio;
        public comboViewHolder(@NonNull View itemView) {
            super(itemView);
            entrada = itemView.findViewById(R.id.entrada1);
            platoFuerte = itemView.findViewById(R.id.platoFuerte1);
            postre = itemView.findViewById(R.id.postre1);
            precio = itemView.findViewById(R.id.precio1);
        }
    }
}

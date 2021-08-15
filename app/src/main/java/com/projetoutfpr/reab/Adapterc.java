package com.projetoutfpr.reab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapterc extends RecyclerView.Adapter<Adapterc.MyViewHolderc> {
    private List<Morfologia> morfologia;
    public Adapterc(List<Morfologia>listaMorfologia){this.morfologia = listaMorfologia;}
    @NonNull
    @Override
    public MyViewHolderc onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listac_layout,parent,false);
        return new MyViewHolderc(itemLista);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolderc holder, int position) {
        Morfologia morfologiaa = morfologia.get(position);
        holder.textMorfo.setText(morfologiaa.getMorfo());
        holder.imageMorfo.setImageResource(morfologiaa.getImagem());
    }
    @Override
    public int getItemCount() { return morfologia.size(); }

    public class MyViewHolderc extends RecyclerView.ViewHolder{
        private TextView textMorfo;
        private ImageView imageMorfo;
        public MyViewHolderc(@NonNull View itemView) {
            super(itemView);
            textMorfo = itemView.findViewById(R.id.textMorfo);
            imageMorfo = itemView.findViewById(R.id.imageMorfo);
        }
    }
}

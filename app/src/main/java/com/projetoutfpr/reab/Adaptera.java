package com.projetoutfpr.reab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptera extends RecyclerView.Adapter<Adaptera.MyViewHoldera> {
    private List<ListaPlantas> listaP;
    public Adaptera(List<ListaPlantas>lista){
        this.listaP = lista;
    }
    @NonNull
    @Override
    public MyViewHoldera onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listaa_layout,parent,false);
        return new MyViewHoldera(itemLista);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHoldera holder, int position) {
        ListaPlantas listaPlantas = listaP.get(position);
        holder.lista_sp.setText(listaPlantas.getEspecie());
        holder.lista_gr.setText(listaPlantas.getGenero());
        holder.lista_fa.setText(listaPlantas.getFamilia());
    }
    @Override
    public int getItemCount() {
        return listaP.size();
    }
    public class MyViewHoldera extends RecyclerView.ViewHolder{
        TextView lista_sp;
        TextView lista_gr;
        TextView lista_fa;
        public MyViewHoldera(@NonNull View itemView) {
            super(itemView);
            lista_sp = itemView.findViewById(R.id.lista_sp);
            lista_gr = itemView.findViewById(R.id.lista_gr);
            lista_fa = itemView.findViewById(R.id.lista_fa);
        }
    }
}

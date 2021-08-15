package com.projetoutfpr.reab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapterb extends RecyclerView.Adapter<Adapterb.MyViewHolderb> {
    private List<Imagem> imagemList;
    public Adapterb(List<Imagem>lista){this.imagemList = lista;}
    @NonNull
    @Override
    public MyViewHolderb onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listab_layout,parent,false);
        return new MyViewHolderb(itemLista);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolderb holder, int position) {
        Imagem imagem = imagemList.get(position);
        holder.lista_spb.setText(imagem.getNome());
        holder.lista_lo.setText(imagem.getLocalidade());
        holder.lista_co.setText(imagem.getComentario());
        holder.lista_im.setImageResource(imagem.getImagem());
    }
    @Override
    public int getItemCount() { return imagemList.size(); }
    public class MyViewHolderb extends RecyclerView.ViewHolder{
        private TextView lista_spb;
        private TextView lista_lo;
        private TextView lista_co;
        private ImageView lista_im;
        public MyViewHolderb(@NonNull View itemView) {
            super(itemView);
            lista_spb = itemView.findViewById(R.id.lista_spb);
            lista_lo = itemView.findViewById(R.id.lista_lo);
            lista_co = itemView.findViewById(R.id.lista_co);
            lista_im = itemView.findViewById(R.id.lista_im);
        }
    }
}

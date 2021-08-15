package com.projetoutfpr.reab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ArieActivity extends AppCompatActivity {
    private Button buttono;
    private RecyclerView lista_card;
    private List<Imagem> imagemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arie);

        buttono = findViewById(R.id.buttono);
        buttono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ArieActivity.this,ListaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        /*Imagem i = new Imagem("Anemia phyllitidis","","",R.drawable.anemiap);
        this.imagemList.add(i);
        i = new Imagem("Ctenitis paranaensis","","",R.drawable.ctenitisp);
        this.imagemList.add(i);
        i = new Imagem("Ctenitis submarginalis","","",R.drawable.ctenitiss);
        this.imagemList.add(i);
        lista_card = findViewById(R.id.lista_card);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this);
        lista_card.setLayoutManager(layoutManager1);
        Adapterb adapterb = new Adapterb(imagemList);
        lista_card.setAdapter(adapterb);*/
    }
}
package com.projetoutfpr.reab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class ListaActivity extends AppCompatActivity {
    private Button buttonm;
    private Button buttona;
    private RecyclerView recyclera;
    private RecyclerView lista_card;
    private RecyclerView lista_morfo;
    private List<Imagem> imagemList = new ArrayList<>();
    private List<ListaPlantas> listaP = new ArrayList<>();
    private List<Morfologia> morfologia = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        ListaPlantas listaPlantas = new ListaPlantas("Adiantopsis radiata","Pteridaceae ","SUBSTRATO Terrícola; RIZOMA Ereto; FRONDE Monomorfa; FOLHA FORMA 2-palmatissecta; NERVURA Livres");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Adiantum curvatum","Pteridaceae","SUBSTRATO Terrícola; RIZOMA Longo-reptante; FRONDE Monomorfa; FOLHA Pedada deltoide; NERVURA Livres");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Adiantum latifolium","Pteridaceae","SUBSTRATO Terrícola; RIZOMA Longo-reptante; FRONDE Monomorfa; FOLHA 2-pinada-pinatissecta; NERVURA Livres");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Adiantum raddianum","Pteridaceae ","SUBSTRATO Terrícola; RIZOMA Reptante; FRONDE Monomorfa; FOLHA FORMA 3-pinada deltóide; NERVURA Anastomosada");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Anemia phyllitidis","Anemiaceae","SUBSTRATO Terrícola; RIZOMA Subereto; FRONDE Hemidimorfa; FOLHA 1-pinada; NERVURA Anastomosada");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Christella dentata","Thelypteridaceae","SUBSTRATO Terrícola; RIZOMA Curto-reptante; FRONDE Monomorfa; FOLHA FORMA 1-pinado-pinatissecta; NERVURA Livres");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Ctenitis paranaensis","Dryopteridaceae","SUBSTRATO Terrícola; RIZOMA Ascendente; FRONDE Monomorfa; FOLHA 1-pinatissecta; NERVURA Livres");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Ctenitis submarginalis","Dryopteridaceae","SUBSTRATO Terrícola; RIZOMA Ascendente; FRONDE Monomorfa; FOLHA FORMA 1-pinatissecta; NERVURA Livres");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Doryopteris concolor","Pteridaceae ","SUBSTRATO Terrícola; RIZOMA Ereto; FRONDE Monomorfa; FOLHA FORMA Pedatipartida; NERVURA Livres");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Doryopteris nobilis","Pteridaceae ","SUBSTRATO Terrícola; RIZOMA Curto; FRONDE Dimorfa; FOLHA FORMA Palmatipartida; NERVURA Anastomosada");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Doryopteris pentagona","Pteridaceae ","SUBSTRATO Terrícola; RIZOMA Subereto; FRONDE Dimorfa; FOLHA FORMA Palmatipartida; NERVURA Anastomosada");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Lygodium volubile","Lygodiaceae","SUBSTRATO Liana; RIZOMA Longo-reptante; FRONDE Monomorfa; FOLHA FORMA 2-pinada-pinatissecta; NERVURA Livres");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Macrothelypteris torresiana","Thelypteridaceae","SUBSTRATO Terrícola; RIZOMA Curto-reptante; FRONDE Monomorfa; FOLHA FORMA 2-pinada-pinatífida; NERVURA Livres");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Pleopeltis minima","Polypodiaceae","SUBSTRATO Epífita; RIZOMA Longo-reptante; FRONDE Monomorfa; FOLHA FORMA 1 pinada-pinatissecta lanceolada ; NERVURA Anastomosada");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Pleopeltis pleopeltifolia ","Polypodiaceae","SUBSTRATO Epífita; RIZOMA Curto-reptante; FRONDE Monomorfa; FOLHA FORMA 1-pinada-pinatissecta lanceolada ; NERVURA Anastomosada");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Psilotum nudum","Psilotaceae ","SUBSTRATO Terrícola; RIZOMA Reptante; FRONDE Monomorfa; FOLHA FORMA composta por escamas lineares; NERVURA Ausentes");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Pteridium arachnoideum ","Dennstaedtiaceae","SUBSTRATO Terrícola; RIZOMA Longo-reptante; FRONDE Monomorfa; FOLHA FORMA 3-pinada lanceolada ; NERVURA Livres");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Pteris ensiformis","Pteridaceae ","SUBSTRATO Terrícola; RIZOMA Prostrado; FRONDE Dimorfa; FOLHA FORMA Bipinatissecta; NERVURA Livres");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Pteris denticulata","Pteridaceae ","SUBSTRATO Terrícola; RIZOMA Ereto; FRONDE Monomorfa; FOLHA FORMA 1-bipinatissecta; NERVURA Livres");
        this.listaP.add(listaPlantas);
        listaPlantas = new ListaPlantas("Salvinia auriculata","Salviniaceae","SUBSTRATO Aquática; RIZOMA Curto-reptante; FOLHA FORMA Oblonga; NERVURA Anastomosada");
        this.listaP.add(listaPlantas);
        recyclera = findViewById(R.id.recyclera);
        Adaptera adaptera = new Adaptera(listaP);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclera.setLayoutManager(layoutManager);
        recyclera.setHasFixedSize(true);
        recyclera.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclera.setAdapter(adaptera);

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

        Morfologia m = new Morfologia("MORFOLOGIA Arraste para a esquerda.",R.drawable.reappinicio);
        this.morfologia.add(m);
        m = new Morfologia("ANTERA basifixa",R.drawable.anterabasifixa);
        this.morfologia.add(m);
        m = new Morfologia("ANTERA dorsifixa",R.drawable.anteradorsifixa);
        this.morfologia.add(m);
        m = new Morfologia("ANTERA poricida",R.drawable.anteraporicida);
        this.morfologia.add(m);
        m = new Morfologia("ANTERA rimosa",R.drawable.anterariomosa);
        this.morfologia.add(m);
        m = new Morfologia("ANTERA valvar",R.drawable.anteravalvar);
        this.morfologia.add(m);

        m = new Morfologia("CARACTERÍSTICA áfila",R.drawable.caracteristicaafila);
        this.morfologia.add(m);
        m = new Morfologia("CARACTERÍSTICA ascídias",R.drawable.caracteristicaascidia);
        this.morfologia.add(m);
        m = new Morfologia("CARACTERÍSTICA espinho",R.drawable.caracteristicaespinho);
        this.morfologia.add(m);
        m = new Morfologia("CARACTERÍSTICA filódio",R.drawable.caracteristicafilodio);
        this.morfologia.add(m);
        m = new Morfologia("CARACTERÍSTICA folha acicular",R.drawable.caracteristicafolhaacicular);
        this.morfologia.add(m);
        m = new Morfologia("CARACTERÍSTICA folha coletora",R.drawable.caracteristicafolhacoletora);
        this.morfologia.add(m);
        m = new Morfologia("CARACTERÍSTICA folha suculenta",R.drawable.caracteristicasuculenta);
        this.morfologia.add(m);
        m = new Morfologia("CARACTERÍSTICA gavinha foliar",R.drawable.caracteristicagavinha);
        this.morfologia.add(m);
        m = new Morfologia("CARACTERÍSTICA pulvino",R.drawable.carcteristicapulvino);
        this.morfologia.add(m);

        m = new Morfologia("CAULE adventício",R.drawable.cauleadventicio);
        this.morfologia.add(m);
        m = new Morfologia("CAULE bulbo",R.drawable.caulebulbo);
        this.morfologia.add(m);
        m = new Morfologia("CAULE cladódio",R.drawable.caulecladodio);
        this.morfologia.add(m);
        m = new Morfologia("CAULE colmo",R.drawable.caulecolmo);
        this.morfologia.add(m);
        m = new Morfologia("CAULE cormo",R.drawable.caulecormo);
        this.morfologia.add(m);
        m = new Morfologia("CAULE estipe",R.drawable.cauleestipe);
        this.morfologia.add(m);
        m = new Morfologia("CAULE filocládio",R.drawable.caulefilocladio);
        this.morfologia.add(m);
        m = new Morfologia("CAULE fuste",R.drawable.caulefuste);
        this.morfologia.add(m);
        m = new Morfologia("CAULE haste",R.drawable.haste);
        this.morfologia.add(m);
        m = new Morfologia("CAULE liana",R.drawable.cauleliana);
        this.morfologia.add(m);
        m = new Morfologia("CAULE monopodial",R.drawable.caulemonopodial);
        this.morfologia.add(m);
        m = new Morfologia("CAULE roseta",R.drawable.cauleroseta);
        this.morfologia.add(m);
        m = new Morfologia("CAULE sarmento",R.drawable.caulesarmento);
        this.morfologia.add(m);
        m = new Morfologia("CAULE simpodial",R.drawable.caulesimpodial);
        this.morfologia.add(m);
        m = new Morfologia("CAULE tubera",R.drawable.cauletubera);
        this.morfologia.add(m);

        m = new Morfologia("ESPORÂNGIO",R.drawable.esporangio);
        this.morfologia.add(m);
        m = new Morfologia("ESPORÂNGIO CRASSIESPORÂNGIO",R.drawable.crassiespor);
        this.morfologia.add(m);
        m = new Morfologia("ESPORÂNGIO ESPOROCARPO",R.drawable.esporocarpo);
        this.morfologia.add(m);
        m = new Morfologia("ESPORÂNGIO LEPTOSPORÂNGIO",R.drawable.leptosporangio);
        this.morfologia.add(m);
        m = new Morfologia("ESPORÂNGIO pedicelado",R.drawable.esporangiopedicelado);
        this.morfologia.add(m);
        m = new Morfologia("ESPORÂNGIO séssil",R.drawable.esporangiosessil);
        this.morfologia.add(m);
        m = new Morfologia("ESPORÂNGIO SINÂNGIO",R.drawable.sinangio);
        this.morfologia.add(m);

        m = new Morfologia("ESTRÓBILO",R.drawable.estrobilo);
        this.morfologia.add(m);

        m = new Morfologia("FILOTAXIA alterna",R.drawable.filotaxiaalterna);
        this.morfologia.add(m);
        m = new Morfologia("FILOTAXIA dística",R.drawable.filotaxiadistica);
        this.morfologia.add(m);
        m = new Morfologia("FILOTAXIA espiralada",R.drawable.filotaxiaespiralada);
        this.morfologia.add(m);
        m = new Morfologia("FILOTAXIA oposta",R.drawable.filotaxiaoposta);
        this.morfologia.add(m);
        m = new Morfologia("FILOTAXIA trística",R.drawable.filotaxiatristica);
        this.morfologia.add(m);
        m = new Morfologia("FILOTAXIA verticilada",R.drawable.filoaxiaverticilada);
        this.morfologia.add(m);

        m = new Morfologia("FLOR acíclica",R.drawable.floraciclica);
        this.morfologia.add(m);
        m = new Morfologia("FLOR campanulada",R.drawable.florcampanulada);
        this.morfologia.add(m);
        m = new Morfologia("FLOR cíclica",R.drawable.floraciclica);
        this.morfologia.add(m);
        m = new Morfologia("FLOR digitaliforme",R.drawable.flordigitaliforme);
        this.morfologia.add(m);
        m = new Morfologia("FLOR epígina conato",R.drawable.florepiginaconato);
        this.morfologia.add(m);
        m = new Morfologia("FLOR epígina parialmente conato",R.drawable.florepiginaparcialconato);
        this.morfologia.add(m);
        m = new Morfologia("FLOR hemicíclica",R.drawable.florhemiciclica);
        this.morfologia.add(m);
        m = new Morfologia("FLOR hipocrateriforme",R.drawable.florhipocrateriforme);
        this.morfologia.add(m);
        m = new Morfologia("FLOR hipógina cônico",R.drawable.florhipoginaconico);
        this.morfologia.add(m);
        m = new Morfologia("FLOR hipógina discóide",R.drawable.florhipoginadiscoide);
        this.morfologia.add(m);
        m = new Morfologia("FLOR infundibuliforme",R.drawable.florinfundibuliforme);
        this.morfologia.add(m);
        m = new Morfologia("FLOR labiada",R.drawable.florpersonada);
        this.morfologia.add(m);
        m = new Morfologia("FLOR ligulada",R.drawable.florligulada);
        this.morfologia.add(m);
        m = new Morfologia("FLOR perígena livre",R.drawable.florperiginalivre);
        this.morfologia.add(m);
        m = new Morfologia("FLOR personada",R.drawable.florligu);
        this.morfologia.add(m);
        m = new Morfologia("FLOR rotada",R.drawable.florrotada);
        this.morfologia.add(m);
        m = new Morfologia("FLOR tubulosa",R.drawable.flortubulosa);
        this.morfologia.add(m);
        m = new Morfologia("FLOR urceolada",R.drawable.florurceolada);
        this.morfologia.add(m);

        m = new Morfologia("FOLHA ÁPICE acuminado",R.drawable.acuminado);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA ÁPICE agudo",R.drawable.agudo);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA ÁPICE arredondado",R.drawable.arrredondado);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA ÁPICE atenuado",R.drawable.atenuado);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA ÁPICE cirroso",R.drawable.cirroso);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA ÁPICE cuneado",R.drawable.cuneado);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA ÁPICE cuspidado",R.drawable.cuspidado);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA ÁPICE emarginado",R.drawable.emarginado);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA ÁPICE mucronado",R.drawable.mucrodado);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA ÁPICE obtuso",R.drawable.obtuso);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA ÁPICE retuso",R.drawable.retuso);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA ÁPICE truncado",R.drawable.truncado);
        this.morfologia.add(m);

        m = new Morfologia("FOLHA BASE aguda",R.drawable.aguda);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA BASE arredondada",R.drawable.arredondada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA BASE assimétrica",R.drawable.assimetrica);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA BASE atenuada",R.drawable.atenuada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA BASE cordada",R.drawable.cordada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA BASE cuneada",R.drawable.cuneada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA BASE decorrente",R.drawable.decorrente);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA BASE hastada",R.drawable.hastada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA BASE obtusa",R.drawable.obtusa);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA BASE sagitada",R.drawable.sagitada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA BASE subcordada",R.drawable.subcordada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA BASE truncada",R.drawable.truncada);
        this.morfologia.add(m);

        m = new Morfologia("FOLHA FORMA deltoide",R.drawable.deltoide);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA elíptica",R.drawable.eliptica);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA estreito-elíptica",R.drawable.estreitoeliptica);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA estreito-obtriangular",R.drawable.estreitoobtriangular);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA estreito-triangular",R.drawable.triangular);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA imparipinada",R.drawable.imparipinada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA lanceolada",R.drawable.lanceolada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA largo-eliptica",R.drawable.largoeliptica);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA linear",R.drawable.linear);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA obdeltóide",R.drawable.obdeltoide);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA oblanceolada",R.drawable.oblanceolada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA oblonga",R.drawable.oblonga);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA obovada",R.drawable.obovada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA ovada",R.drawable.ovada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA palmaticomposta",R.drawable.palmaticomposta);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA palmatífida",R.drawable.palmatifida);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA palmatinérvea",R.drawable.palmatinervea);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA palmatipartida",R.drawable.palmatipartida);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA palmatissecta",R.drawable.palmatissecta);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA paripinada",R.drawable.paripinada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA pedaticomposta",R.drawable.pedaticomposta);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA pedatífida",R.drawable.pedatifida);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA pedatinérvea",R.drawable.pedatinervea);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA pedatinérvea",R.drawable.pedatinervea);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA pedatipartida",R.drawable.pedatipartida);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA pedatissecta",R.drawable.pedatissecta);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA pedatissecta",R.drawable.pedatissecta);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA pinaticomposta",R.drawable.pinaticomposta);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA pinatífida",R.drawable.pinatifida);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA pinatipartida",R.drawable.pinatipartida);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA pinatissecta",R.drawable.pinatissecta);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA romboide",R.drawable.romboide);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA sinuada",R.drawable.sinuada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA FORMA trulada",R.drawable.trulada);
        this.morfologia.add(m);

        m = new Morfologia("FOLHA MARGEM crenada",R.drawable.crenada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA MARGEM crespa",R.drawable.crespa);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA MARGEM denteada",R.drawable.denteada);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA MARGEM erosa",R.drawable.erosa);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA MARGEM inteira",R.drawable.inteira);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA MARGEM repanda",R.drawable.repanda);
        this.morfologia.add(m);
        m = new Morfologia("FOLHA MARGEM serreada",R.drawable.serreada);
        this.morfologia.add(m);

        m = new Morfologia("FRONDE dimorfa",R.drawable.frondemonomorfa);
        this.morfologia.add(m);
        m = new Morfologia("FRONDE hemidimorfa",R.drawable.frondehemidimorfa);
        this.morfologia.add(m);
        m = new Morfologia("FRONDE monomorfa",R.drawable.frondedimorfa);
        this.morfologia.add(m);

        m = new Morfologia("FRUTO cariopse",R.drawable.frutocariopse);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO carnoso baga",R.drawable.frutocarnosobaga);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO carnoso drupa",R.drawable.frutocarnosodrupa);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO carnoso folículo",R.drawable.frutocarnosofoliculo);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO carnoso hesperídio",R.drawable.frutocarnosohesperidio);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO carnoso luculânio",R.drawable.frutocarnosonuculanio);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO carnoso pomo",R.drawable.frutocarnosopomo);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO seco deiscente cápsula loculicida",R.drawable.frutoloculicida);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO seco deiscente cápsula poricida",R.drawable.frutoporicida);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO seco deiscente cápsula septicida",R.drawable.frutosepticida);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO seco deiscente cápsula septifraga",R.drawable.frutoseptifraga);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO seco deiscente cerácio",R.drawable.frutoceracio);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO seco deiscente folículo",R.drawable.frutofoliculo);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO seco deiscente legume",R.drawable.frutolegume);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO seco deiscente pixídio",R.drawable.frutopixidio);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO seco deiscente síliqua",R.drawable.frutosiliqua);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO seco indeiscente aquênio",R.drawable.frutoaquenio);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO seco indeiscente lomento",R.drawable.frutolomento);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO seco indeiscente sâmara",R.drawable.frutosamara);
        this.morfologia.add(m);
        m = new Morfologia("FRUTO seco indeiscente samarídeo",R.drawable.frutolomento);
        this.morfologia.add(m);

        m = new Morfologia("GINECEU apocárpico acíclico",R.drawable.gineceuapocarpicoaciclico);
        this.morfologia.add(m);
        m = new Morfologia("GINECEU apocárpico cíclico",R.drawable.gineceuapocarpicociclico);
        this.morfologia.add(m);
        m = new Morfologia("GINECEU sincárpico",R.drawable.gineceusincarpico);
        this.morfologia.add(m);
        m = new Morfologia("GINECEU sincárpico um estilete",R.drawable.gineceusincarpicoumestilete);
        this.morfologia.add(m);
        m = new Morfologia("GINECEU unicarpelar",R.drawable.gineceuunicarpelar);
        this.morfologia.add(m);

        m = new Morfologia("INDÚSIO ausente",R.drawable.indusioausente);
        this.morfologia.add(m);
        m = new Morfologia("INDÚSIO pseudoindúsio",R.drawable.indusiopseudoindusio);
        this.morfologia.add(m);
        m = new Morfologia("INDÚSIO verdadeiro",R.drawable.indusioverdadeiro);
        this.morfologia.add(m);

        m = new Morfologia("INFLORECÊNCIA amento",R.drawable.inflorecenciaamento);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA bóstrix",R.drawable.inflorecenciabostrix);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA capítulo",R.drawable.inflorecenciacapitulo);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA cíncino",R.drawable.inflorecenciacincino);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA corimbo",R.drawable.inflorecenciacorimbo);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA dicásio",R.drawable.inflorecenciadicasio);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA drepânio",R.drawable.inflorecenciadrepanio);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA espádice",R.drawable.inflorecenciaespadice);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA espiga",R.drawable.inflorecenciaespiga);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA panicula",R.drawable.inflorecenciapanicula);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA pleiocásio",R.drawable.inflorecenciapleiocasio);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA pleiotirso",R.drawable.inflorecenciapleiotirso);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA racemo",R.drawable.inflorecenciaracemo);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA ripídio",R.drawable.inflorecenciaripidio);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA sicônio",R.drawable.inflorecenciasiconio);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA tirso",R.drawable.inflorecenciatirso);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA umbela",R.drawable.inflorecenciaumbela);
        this.morfologia.add(m);
        m = new Morfologia("INFLORECÊNCIA verticilaster",R.drawable.inflorecenciaverticilaster);
        this.morfologia.add(m);

        m = new Morfologia("NERVURA acródroma",R.drawable.nervuracrodroma);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA actninódroma",R.drawable.nervuraactinodromab);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA actninódroma",R.drawable.nervuraactinodroma);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA anastomosada",R.drawable.nervuraareolada);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA anastomosada reticulódroma",R.drawable.nervurreticulodroma);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA broquidódroma",R.drawable.nervurabroquidodroma);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA campilódroma",R.drawable.nervuracampilodroma);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA camptódroma",R.drawable.neruracamptodroma);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA cladódroma",R.drawable.nervuracladodroma);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA hifódroma",R.drawable.nervurahifodroma);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA livre",R.drawable.nervuralivre);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA livre craspedódroma",R.drawable.nervuracraspedodroma);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA eucamptódroma",R.drawable.nervuraeucamptodroma);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA palmactinódroma",R.drawable.nervurpalmactinodroma);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA paralelinérvea",R.drawable.nervuraparalelodroma);
        this.morfologia.add(m);
        m = new Morfologia("NERVURA pedatinérvea",R.drawable.nervurapedatinervea);
        this.morfologia.add(m);

        m = new Morfologia("PLACENTAÇÃO axial",R.drawable.pacentacaoaxial);
        this.morfologia.add(m);
        m = new Morfologia("PLACENTAÇÃO axial intrusiva",R.drawable.pacentacaoaxialintrusiva);
        this.morfologia.add(m);
        m = new Morfologia("PLACENTAÇÃO basilar",R.drawable.placentacaobasilar);
        this.morfologia.add(m);
        m = new Morfologia("PLACENTAÇÃO central livre",R.drawable.placentacaocentrallivre);
        this.morfologia.add(m);
        m = new Morfologia("PLACENTAÇÃO parietal",R.drawable.placentacaoparietal);
        this.morfologia.add(m);
        m = new Morfologia("PLACENTAÇÃO parietal intrusiva",R.drawable.pacentacaoparientalintrusiva);
        this.morfologia.add(m);

        m = new Morfologia("PREFLORAÇÃO alterna",R.drawable.perfloracaoalterna);
        this.morfologia.add(m);
        m = new Morfologia("PREFLORAÇÃO carenal",R.drawable.perfloracaocarenal);
        this.morfologia.add(m);
        m = new Morfologia("PREFLORAÇÃO coclear",R.drawable.perfloracaocloquear);
        this.morfologia.add(m);
        m = new Morfologia("PREFLORAÇÃO contorta",R.drawable.perfloracaocontorta);
        this.morfologia.add(m);
        m = new Morfologia("PREFLORAÇÃO induplicada",R.drawable.perfloracaoinduplicada);
        this.morfologia.add(m);
        m = new Morfologia("PREFLORAÇÃO quincuncial",R.drawable.perfloracaoquincuclial);
        this.morfologia.add(m);
        m = new Morfologia("PREFLORAÇÃO valvar",R.drawable.perfloracaovalvar);
        this.morfologia.add(m);
        m = new Morfologia("PREFLORAÇÃO vexilar",R.drawable.perfloracaovexilar);
        this.morfologia.add(m);

        m = new Morfologia("PREFOLIAÇÃO circinada",R.drawable.prefoliacaocircinada);
        this.morfologia.add(m);
        m = new Morfologia("PREFOLIAÇÃO conduplicada",R.drawable.prefoliacaoconduplicada);
        this.morfologia.add(m);
        m = new Morfologia("PREFOLIAÇÃO convoluta",R.drawable.prefoliacaoconvoluta);
        this.morfologia.add(m);
        m = new Morfologia("PREFOLIAÇÃO involuta",R.drawable.prefoliacaoinvoluta);
        this.morfologia.add(m);
        m = new Morfologia("PREFOLIAÇÃO plicada",R.drawable.prefoliacaoplicada);
        this.morfologia.add(m);
        m = new Morfologia("PREFOLIAÇÃO revoluta",R.drawable.prefoliacaorevoluta);
        this.morfologia.add(m);
        m = new Morfologia("PREFOLIAÇÃO supervoluta",R.drawable.prefoliacaosupervoluta);
        this.morfologia.add(m);

        m = new Morfologia("RAIZ adventícias",R.drawable.raizadventicia);
        this.morfologia.add(m);
        m = new Morfologia("RAIZ adventícia tuberas",R.drawable.raizadventiciatuberas);
        this.morfologia.add(m);
        m = new Morfologia("RAIZ axial",R.drawable.raizaxial);
        this.morfologia.add(m);
        m = new Morfologia("RAIZ escora",R.drawable.raizescora);
        this.morfologia.add(m);
        m = new Morfologia("RAIZ fasciculada",R.drawable.raizfasciculada);
        this.morfologia.add(m);
        m = new Morfologia("RAIZ fasciculada tuberosa",R.drawable.rfasciculadatuberosa);
        this.morfologia.add(m);
        m = new Morfologia("RAIZ grampiforme",R.drawable.raizgrampiforme);
        this.morfologia.add(m);
        m = new Morfologia("RAIZ haustório",R.drawable.raizhastorio);
        this.morfologia.add(m);
        m = new Morfologia("RAIZ laterais tuberosas",R.drawable.raizlateraistuberas);
        this.morfologia.add(m);
        m = new Morfologia("RAIZ origem internodal",R.drawable.raizorigeminternodal);
        this.morfologia.add(m);
        m = new Morfologia("RAIZ origem nodal",R.drawable.raizorigemnodal);
        this.morfologia.add(m);
        m = new Morfologia("RAIZ pivotante",R.drawable.raizpivotante);
        this.morfologia.add(m);
        m = new Morfologia("RAIZ pneumatóforo",R.drawable.raizpeneumatoforo);
        this.morfologia.add(m);
        m = new Morfologia("RAIZ principal tuberosa",R.drawable.raizprincipaltuberosa);
        this.morfologia.add(m);

        m = new Morfologia("RIZOMA ereto",R.drawable.rizomaereto);
        this.morfologia.add(m);
        m = new Morfologia("RIZOMA prostado",R.drawable.rizomaprostado);
        this.morfologia.add(m);
        m = new Morfologia("RIZOMA reptante",R.drawable.rizomareptante);
        this.morfologia.add(m);
        m = new Morfologia("RIZOMA subereto",R.drawable.rizomasubereto);
        this.morfologia.add(m);

        m = new Morfologia("SUBSTRATO aquática",R.drawable.aquatica);
        this.morfologia.add(m);
        m = new Morfologia("SUBSTRATO epífita",R.drawable.epifita);
        this.morfologia.add(m);
        m = new Morfologia("SUBSTRATO hemiepífita",R.drawable.hemiepifita);
        this.morfologia.add(m);
        m = new Morfologia("SUBSTRATO hemiparasita",R.drawable.hemiparasita);
        this.morfologia.add(m);
        m = new Morfologia("SUBSTRATO liana",R.drawable.rupicola);
        this.morfologia.add(m);
        m = new Morfologia("SUBSTRATO parasita",R.drawable.parasita);
        this.morfologia.add(m);
        m = new Morfologia("SUBSTRATO terrícola",R.drawable.terricola);
        this.morfologia.add(m);

        lista_morfo = findViewById(R.id.lista_morfo);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this);
        layoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        lista_morfo.setLayoutManager(layoutManager2);
        Adapterc adapterc = new Adapterc(morfologia);
        lista_morfo.setAdapter(adapterc);
        buttonm = findViewById(R.id.buttonm);
        buttonm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        buttona = findViewById(R.id.buttona);
        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaActivity.this,ArieActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
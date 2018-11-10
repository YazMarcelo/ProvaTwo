package com.broovie.equipe.provatwo.atividades.Exercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.broovie.equipe.provatwo.R;
import com.broovie.equipe.provatwo.adapters.ProdutoExe2Adapter;
import com.broovie.equipe.provatwo.entidades.ProdutoExe2;
import com.broovie.equipe.provatwo.entidades.VendaExe2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exercicio2Activity extends AppCompatActivity {

    public EditText txtDescricao;
    public EditText txtQdt;
    public List<VendaExe2> lista = new ArrayList<>();
    public ListView minhaLista;
    public HashMap<Integer,ProdutoExe2> cardapio = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);

        txtDescricao = findViewById(R.id.txt_id_produto);
        txtQdt = findViewById(R.id.txt_qtd_produto);
        minhaLista = findViewById(R.id.lst_cardapio);

        cardapio.put(101,new ProdutoExe2("Cachorro Quente", 1.10, 101));
        cardapio.put(102,new ProdutoExe2("Bauru Simples", 1.10, 102));
        cardapio.put(103,new ProdutoExe2("Bauru c/ Ovo", 1.10, 103));
        cardapio.put(104,new ProdutoExe2("Hamburger", 1.10, 104));
        cardapio.put(105,new ProdutoExe2("Cheeseburger", 1.10, 105));
        cardapio.put(100,new ProdutoExe2("Cheeseburger", 1.10, 100));

    }


    public void calcularCardapio(View view) {

        ProdutoExe2 pe2 = cardapio.get(Integer.parseInt(txtDescricao.getText().toString()));


        Double precoFinal;
        int qtdTotal;

        qtdTotal = Integer.parseInt(txtQdt.getText().toString());
        precoFinal = qtdTotal * pe2.getPreco();

        VendaExe2 pessoa = new VendaExe2();

        pessoa.setNomeProduto(pe2.getDescricao());
        pessoa.setPreco(precoFinal);
        pessoa.setQtd(qtdTotal);

        lista.add(pessoa);

        //SAIDA

        ProdutoExe2Adapter peAdapter = new ProdutoExe2Adapter(this, lista);
        minhaLista.setAdapter(peAdapter);
    }
}

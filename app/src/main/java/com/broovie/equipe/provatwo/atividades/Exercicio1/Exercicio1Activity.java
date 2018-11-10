package com.broovie.equipe.provatwo.atividades.Exercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.broovie.equipe.provatwo.R;
import com.broovie.equipe.provatwo.entidades.VendaExe1;

public class Exercicio1Activity extends AppCompatActivity {

    EditText nomeCliente;
    EditText qtdPorcas;
    EditText qtdParafusos;
    EditText qtdArruelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);

        nomeCliente = findViewById(R.id.txt_nome_cliente);
        qtdPorcas = findViewById(R.id.txt_qtd_porcas);
        qtdParafusos = findViewById(R.id.txt_qtd_parafusos);
        qtdArruelas = findViewById(R.id.txt_qtd_arruelas);
    }


    public void comprar(View view) {
        VendaExe1 ve = new VendaExe1(nomeCliente.getText().toString(),
                Integer.parseInt(qtdPorcas.getText().toString()),
                Integer.parseInt(qtdParafusos.getText().toString()),
                Integer.parseInt(qtdArruelas.getText().toString()));

        Intent it = new Intent(Exercicio1Activity.this, FinalVendaActivity.class);
        
    }
}

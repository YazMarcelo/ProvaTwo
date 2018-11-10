package com.broovie.equipe.provatwo.atividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.broovie.equipe.provatwo.R;
import com.broovie.equipe.provatwo.atividades.Exercicio1.Exercicio1Activity;
import com.broovie.equipe.provatwo.atividades.Exercicio2.Exercicio2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamarTela(View view) {
        Intent it = null;
        switch (view.getId()){
            case R.id.btn_exe_1:
                it = new Intent(MainActivity.this,Exercicio1Activity.class);
                startActivity(it);
                break;
            case R.id.btn_exe_2:
                it = new Intent(MainActivity.this,Exercicio2Activity.class);
                startActivity(it);
                break;
            case R.id.btn_exe_3:
                it = new Intent(MainActivity.this,Exercicio1Activity.class);
                startActivity(it);
                break;

        }
    }
}

package com.broovie.equipe.provatwo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.broovie.equipe.provatwo.R;
import com.broovie.equipe.provatwo.entidades.ProdutoExe2;
import com.broovie.equipe.provatwo.entidades.VendaExe2;

import java.util.List;

public class ProdutoExe2Adapter extends BaseAdapter {

    Context context;
    List<VendaExe2> colecao;
    LayoutInflater inflter;

    public ProdutoExe2Adapter(final Context applicationContext,
                         final List<VendaExe2> colecao) {
        this.context = applicationContext;
        this.colecao = colecao;

    }


    @Override
    public int getCount() {
        return this.colecao != null ? this.colecao.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return this.colecao.get(position);
    }

    private VendaExe2 parsetItem(int i){
        return this.colecao.get(i);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // inflate the layout for each list row
        //'Infla' o layout(pega a referencia) para ser trabalhada
        //no método
        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.item_produto_exe2,
                            viewGroup, false);
        }

        // pega o objeto corrente da lista
        VendaExe2 ve2 = parsetItem(i);

        //Neste ponto vc ira popular os dados do seu layout,
        //utilizando JAVA.

        TextView campoNome, campoValor, campoQtd;

        //CASO não queria declarar um campo
        //((TextView)view.findViewById(R.id.txtItemNome)).setText(pessoa.getNome());

        campoNome = view.findViewById(R.id.txt_nome_produto);
        campoValor = view.findViewById(R.id.txt_preco);
        campoQtd = view.findViewById(R.id.txt_qtd);

        campoNome.setText(ve2.getNomeProduto());
        campoQtd.setText(ve2.getQtd() + "");
        campoValor.setText(ve2.getPreco().toString());

        return view;
    }
}

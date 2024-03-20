package br.com.etecia.listacoelhos;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListaCoelhosAdapter {
    List<Coelhos> lstCoelhos;
    Context myContext;

    public ListaCoelhosAdapter(List<Coelhos> lstCoelhos, Context myContext) {
        this.lstCoelhos = lstCoelhos;
        this.myContext = myContext;
    }



}



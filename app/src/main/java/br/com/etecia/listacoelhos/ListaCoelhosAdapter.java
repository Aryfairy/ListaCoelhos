package br.com.etecia.listacoelhos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListaCoelhosAdapter extends RecyclerView.Adapter<ListaCoelhosAdapter.ViewHolder> {
    private List<Coelhos> lstCoelhos;
    private Context myContext;

    public ListaCoelhosAdapter(Context myContext, List<Coelhos> lstCoelhos) {
        this.myContext = myContext;
        this.lstCoelhos = lstCoelhos;
    }

    @Override
    public ListaCoelhosAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(myContext).inflate(R.layout.modelo_coelho, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListaCoelhosAdapter.ViewHolder holder, int position) {
        Coelhos coelho = lstCoelhos.get(position);
        holder.txtNomeCoelho.setText(coelho.getNome());
        holder.imgCoelhos.setImageResource(coelho.getImage());
        holder.cardCoelhos.setOnClickListener(view -> Toast.makeText(myContext, "rabbit", Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return lstCoelhos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNomeCoelho;
        ImageView imgCoelhos;
        CardView cardCoelhos;

        public ViewHolder(View itemView) {
            super(itemView);
            txtNomeCoelho = itemView.findViewById(R.id.id_lblNomeCoelho);
            imgCoelhos = itemView.findViewById(R.id.id_imgCoelho);
            cardCoelhos = itemView.findViewById(R.id.id_CardView);
        }
    }
}

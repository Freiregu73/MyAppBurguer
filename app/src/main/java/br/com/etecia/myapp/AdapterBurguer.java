package br.com.etecia.myapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterBurguer extends RecyclerView.Adapter<AdapterBurguer.ViewHolder> {

    private Context context;
    private List<Burguers> lstBurguer;

    public AdapterBurguer(Context context, List<Burguers> lstBurguer) {
        this.context = context;
        this.lstBurguer = lstBurguer;
    }

    @NonNull
    @Override
    public AdapterBurguer.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBurguer.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CardView modeloCardBurguer;
        ImageView modeloImgBurguer;
        TextView modeloTituloBurguer;
        TextView modeloDescricaoBurguer;
        TextView modeloPrecoBurguer;

        public ViewHolder(@NonNull View itemView, CardView modeloCardBurguer, ImageView modeloImgBurguer, TextView modeloTituloBurguer, TextView modeloDescricaoBurguer, TextView modeloPrecoBurguer) {
            super(itemView);
            this.modeloCardBurguer = modeloCardBurguer;
            this.modeloImgBurguer = modeloImgBurguer;
            this.modeloTituloBurguer = modeloTituloBurguer;
            this.modeloDescricaoBurguer = modeloDescricaoBurguer;
            this.modeloPrecoBurguer = modeloPrecoBurguer;
        }
    }

}

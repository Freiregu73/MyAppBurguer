package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
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
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.modelo_hamburguer,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBurguer.ViewHolder holder, int position) {

        holder.modeloTituloBurguer.setText(lstBurguer.get(position).getTitulo());
        holder.modeloImgBurguer.setImageResource(lstBurguer.get(position).getImgBurguer());


    }

    @Override
    public int getItemCount() {
        return lstBurguer.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView modeloImgBurguer;
        TextView modeloTituloBurguer;
        TextView modeloDescricaoBurguer;
        TextView modeloPrecoBurguer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            modeloImgBurguer = itemView.findViewById(R.id.modeloImgBurguer);
            modeloTituloBurguer = itemView.findViewById(R.id.modeloTituloBurguer);
        }
    }

}

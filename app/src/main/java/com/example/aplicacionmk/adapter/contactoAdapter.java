package com.example.aplicacionmk.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.aplicacionmk.Clases.Contacto;
import com.example.aplicacionmk.R;

import java.util.List;

public class contactoAdapter extends RecyclerView.Adapter<contactoAdapter.ViewHolder> {

    private List<Contacto> contactos;
    private LayoutInflater mInflater;
    private Context context;

    public contactoAdapter(List<Contacto> itemList, Context context){

        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.contactos = itemList;
    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    @Override
    public contactoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType ) {
        View view = mInflater.inflate(R.layout.adapter_contacto, null);
        return new contactoAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final contactoAdapter.ViewHolder holder, final int position) {
        holder.bindData(contactos.get(position));
    }

    public void setItems (List<Contacto> items) {
        contactos = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView  nombreProducto, nombreUsuario, Estado;

        ViewHolder(View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.imagenGrande);
            nombreProducto = itemView.findViewById(R.id.nombrePrenda);
            nombreUsuario = itemView.findViewById(R.id.nombreUsuario);
            Estado = itemView.findViewById(R.id.estadoPrenda);
        }

        void bindData(final Contacto item) {
            imageView.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            nombreProducto.setText(item.getNombreProducto());
            nombreUsuario.setText(item.getNombreUsuario());
            Estado.setText(item.getEstado());
        }
    }

}

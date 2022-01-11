package com.jonr.loginsqlite.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jonr.loginsqlite.Menulistview;
import com.jonr.loginsqlite.R;
import com.jonr.loginsqlite.model.Menu;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {
    private List<Menu>menus;

    public RecyclerAdapter(List<Menu> menus) {
        this.menus = menus;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_menulistview,parent,false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {
        Menu menu = menus.get(position);
        holder.imagItem.setImageResource(menu.getImgResource());
        holder.menuNombre.setText(menu.getNombre());
        holder.menuDescripcion.setText(menu.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder{
        private ImageView imagItem;
        private TextView menuNombre;
        private TextView menuDescripcion;

        public RecyclerHolder(@NonNull View itemView){
            super(itemView);
            imagItem=itemView.findViewById(R.id.imagItem);
            menuNombre=itemView.findViewById(R.id.menuNombre);
            menuDescripcion=itemView.findViewById(R.id.menuDescripcion);



        }

    }
}

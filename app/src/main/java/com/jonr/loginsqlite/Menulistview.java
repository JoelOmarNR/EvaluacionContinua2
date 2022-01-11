package com.jonr.loginsqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jonr.loginsqlite.adapter.RecyclerAdapter;
import com.jonr.loginsqlite.model.Menu;

import java.util.ArrayList;
import java.util.List;

public class Menulistview extends AppCompatActivity {
    private RecyclerView rvLista;
    private RecyclerAdapter adapter;
    private List<Menu>menus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulistview);

        initViews();
        initValues();
    }
    private void initViews(){
        rvLista=findViewById(R.id.rvLista);
    }
    private void initValues(){
        LinearLayoutManager manager=new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);
        menus=getMenus();
        adapter=new RecyclerAdapter(menus);
        rvLista.setAdapter(adapter);

    }
    private List <Menu>getMenus(){
        List<Menu>menus=new ArrayList<>();
        menus.add(new Menu("Arroz con Pollo","Excelente oferta para hoy",R.drawable.arrozpollo));
        menus.add(new Menu("Arroz Chaufa","Excelente oferta para hoy",R.drawable.chaufa));
        menus.add(new Menu("Cebiche","Excelente oferta para hoy",R.drawable.cevichemixto));
        menus.add(new Menu("Lomo Saltado","Excelente oferta para hoy",R.drawable.saltadodelomo));
        menus.add(new Menu("Arroz con pato","Excelente oferta para hoy",R.drawable.arrozpato));
        menus.add(new Menu("Bisteck","Excelente oferta para hoy",R.drawable.platobisteck));
        menus.add(new Menu("Pollo a la Brasa","Excelente oferta para hoy",R.drawable.alabrasapollo));

        return menus;
    }
}
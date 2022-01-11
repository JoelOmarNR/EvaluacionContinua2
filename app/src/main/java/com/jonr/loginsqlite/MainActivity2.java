package com.jonr.loginsqlite;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    private Toolbar toolbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toolbar1=findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar1);


    }

    public void irAMenulistview(View vista){
        Intent miIntent = new Intent(this, Menulistview.class);
        startActivity(miIntent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.menuFragmento1:getSupportFragmentManager().beginTransaction().replace(R.id.frame1,new Fragmento1()).commit();
                return true ;
            case R.id.menuFragmento2:getSupportFragmentManager().beginTransaction().replace(R.id.frame1,new Fragmento2()).commit();
                return true ;
            case R.id.menuFragmento3:getSupportFragmentManager().beginTransaction().replace(R.id.frame1,new Fragmento3()).commit();
                return true ;
        }
        return super.onOptionsItemSelected(item);
    }

}
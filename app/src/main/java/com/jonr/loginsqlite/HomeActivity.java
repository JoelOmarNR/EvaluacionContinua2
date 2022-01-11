package com.jonr.loginsqlite;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;

import com.jonr.loginsqlite.content.Products;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void irActividad2(View vista){
        Intent miIntent = new Intent(this, MainActivity2.class);
        startActivity(miIntent);

    }



}
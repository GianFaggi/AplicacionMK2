package com.example.aplicacionmk.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.aplicacionmk.Clases.Contacto;
import com.example.aplicacionmk.R;
import com.example.aplicacionmk.adapter.contactoAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<Contacto> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new Contacto("#775447", "Cardigan Harry", "Mica", "Terminado"));
        elements.add(new Contacto("#607d8b", "Buso Multicolor", "Gian", "Proceso"));
        elements.add(new Contacto("#009688", "Polera cuello alto", "Mica", "Proximo"));

        contactoAdapter listAdapter = new contactoAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}
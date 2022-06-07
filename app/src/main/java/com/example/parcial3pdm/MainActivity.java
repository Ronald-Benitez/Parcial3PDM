package com.example.parcial3pdm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.parcial3pdm.activities.addCombo;
import com.example.parcial3pdm.adapter.comoAdapter;
import com.example.parcial3pdm.database.AppDataBase;
import com.example.parcial3pdm.database.entity.combo;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button agregar;
    RecyclerView recycler;
    List<combo> listaCombo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        agregar = findViewById(R.id.agregar);
        recycler = findViewById(R.id.recycle);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        AppDataBase db = AppDataBase.getInstance(this);
        listaCombo = db.ComboDao().getAll();

        comoAdapter adapter = new comoAdapter(listaCombo);
        recycler.setAdapter(adapter);

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new android.content.Intent(getApplicationContext(), addCombo.class));
            }
        });


    }
}
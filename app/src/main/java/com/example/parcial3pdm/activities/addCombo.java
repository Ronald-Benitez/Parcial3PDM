package com.example.parcial3pdm.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.parcial3pdm.MainActivity;
import com.example.parcial3pdm.R;
import com.example.parcial3pdm.database.AppDataBase;
import com.example.parcial3pdm.database.entity.combo;

public class addCombo extends AppCompatActivity {
    Button button;
    EditText entrada, platoFuerte,postre,precio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_combo);
        button = findViewById(R.id.button);
        entrada = findViewById(R.id.entrada);
        platoFuerte = findViewById(R.id.platoFuerte);
        postre = findViewById(R.id.postre);
        precio = findViewById(R.id.precio);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String entradaS = entrada.getText().toString();
                String plato = platoFuerte.getText().toString();
                String postreS = postre.getText().toString();
                float precioS = Float.parseFloat(precio.getText().toString());

                if(entradaS!=""&&plato!=""&&postreS!="") {

                    combo Combo = new combo(entradaS, plato, postreS, precioS);
                    AppDataBase db = AppDataBase.getInstance(getApplicationContext());
                    db.ComboDao().insert(Combo);

                    Toast.makeText(addCombo.this, "Combo agregado", Toast.LENGTH_SHORT).show();

                    startActivity(new android.content.Intent(getApplicationContext(), MainActivity.class));
                }else{
                    Toast.makeText(addCombo.this, "No debe dejar campos vacios", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
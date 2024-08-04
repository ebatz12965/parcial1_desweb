package com.example.parcial_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private Button btnRegistrar, btnListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        examen_desweb conn=new examen_desweb(this, "db_persona", null, 1);


        /*btnRegistrar = findViewById(R.id.btnregistar);
        btnListar = findViewById(R.id.btnlistar);*/
    }

    public void onClick(View view){
        Intent intent = null;
        intent = new Intent(this, RegistrarPersonaActivity.class);
        if(intent!=null){
            startActivity(intent);
        }
    }

    public void onClick1(View view){
        Intent intent = null;
        intent = new Intent(this, ListarPersonaActivity.class);
        if(intent!=null){
            startActivity(intent);
        }
    }
}
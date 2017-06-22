package com.example.administrador.a01_holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txSaludar;//Mas barato mantener una referencia que buscar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//transformado un xml en un arbol de objetos java

        Log.i(this.getClass().getName(), "onCreate: ");

        //Justo despues del setcontentview, hay un arbol de objetos UI asociado a la actividad

        txSaludar =(TextView) findViewById(R.id.tx_Saludo);//Busca en el arbol de objetos

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                procesar();

                //Invocar una actividad
            }
        });


    }

    public void procesar(){
        txSaludar.setText("procesado");
    }

    public void siguiente(){
    }
}

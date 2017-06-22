package com.example.profesormanana.a10_fragmentos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.Serializable;

/**
 * Created by profesormanana on 3/6/16.
 */
public class DetalleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        CorreoElectronico item = (CorreoElectronico) getIntent().getSerializableExtra(DetalleCorreoFragment.DATO_CORREO_ELECTONICO);

        final DetalleCorreoFragment fragmentoDetalle = (DetalleCorreoFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetalle);

        fragmentoDetalle.actualizarDetalle(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

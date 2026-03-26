package com.example.prueba01_rodriguezjhon;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import com.example.prueba01_ana_manobanda.R;

public class MainActivity extends AppCompatActivity {

    EditText txtNombreAPMC, txtApellidoAPMC, txtpNumerOAPMC, txtsNumeroAPMC;
    TextView txtMultiplicacionAPMC, txtPotenciaAPMC, txtFactorialAPMC;
    Button btnSiguienteAPMC, btnMostraRAPMC;

    String nombre = "", apellido = "";
    int pnumero = 0, snumero = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombreAPMC = findViewById(R.id.txtNombreAPMC);
        txtApellidoAPMC = findViewById(R.id.txtApellidoAPMC);
        txtNumero1APMC = findViewById(R.id.txtpNumero1APMC);
        txtsNumero2APMC = findViewById(R.id.txtsNumero2APMC);

        txtMultiplicacionAPMC = findViewById(R.id.txtMultiplicacionAPMC);
        txtPotenciaAPMC = findViewById(R.id.txtPotenciaAPMC);
        txtFactorialAPMC = findViewById(R.id.txtFactorialAPMC);

        buttonSiguiente= findViewById(R.id.btnSiguiente);
        btnMostrar = findViewById(R.id.btnMostrar);

        txtpNumero1APMC.setEnabled(false);
        txtsNumero2APMC.setEnabled(false);
        txtNombreAPMC.setEnabled(false);
        txtApellidoAPMC.setEnabled(false);

        txtMultiplicacionAPMC.setEnabled(false);
        txtPotenciaAPMC.setEnabled(false);


        txtFactorialAPMC.setEnabled(false);


        buttonSiguiente.setEnabled(false);

        buttonSiguiente.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, loginapmc.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (getIntent().hasExtra("nombre")) {

            nombre = getIntent().getStringExtra("nombre");
            apellido = getIntent().getStringExtra("apellido");
            pnumero = getIntent().getIntExtra("pnumero",0);
            snumero = getIntent().getIntExtra("snumero",0);

            btnMostrarRRJW.setEnabled(true);

            btnMostrarRRJW.setOnClickListener(v -> {

                txtNombreRRJW.setText(nombre);
                txtApellidoRRJW.setText(apellido);
                txtpNumeroRRJW.setText(String.valueOf(pnumero));
                txtsNumeroRRJW.setText(String.valueOf(snumero));




            });
        }
    }
}
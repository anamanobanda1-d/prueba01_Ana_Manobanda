package com.example.prueba01_ana_manobanda;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;


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


        txtPotenciaAPMC = findViewById(R.id.txtPotenciaAPMC);
        txtFactorialAPMC = findViewById(R.id.txtFactorialAPMC);

        txtsNumeroAPMC.setEnabled(false);
        txtsNumeroAPMC.setEnabled(false);
        txtNombreAPMC.setEnabled(false);
        txtApellidoAPMC.setEnabled(false);

        txtMultiplicacionAPMC.setEnabled(false);
        txtPotenciaAPMC.setEnabled(false);


        txtFactorialAPMC.setEnabled(false);







}
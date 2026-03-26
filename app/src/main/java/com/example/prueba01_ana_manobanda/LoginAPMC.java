package com.example.prueba01_ana_manobanda;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginAPMC extends MainActivity {
    EditText txtNombreAPMC, txtApellidoAPMC, txtpNumeroAPMC, txtsNumeroRRJW;

    String nombre = "", apellido = "";
    int pnumero = 0, snumero = 0;
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginapmc);



        txtsNumeroAPMC.setEnabled(false);
        txtpNumeroAPMC.setEnabled(false);

        txtNombreAPMC.setEnabled(false);
        txtApellidoAPMC.setEnabled(false);


        if (getIntent().hasExtra("nombre")) {

            nombre = getIntent().getStringExtra("nombre");
            apellido = getIntent().getStringExtra("apellido");
            pnumero = getIntent().getIntExtra("pnumero", 0);
            snumero = getIntent().getIntExtra("snumero", 0);

            txtNombreAPMC.setText(nombre);
            txtApellidoAPMC.setText(apellido);

            txtpNumeroAPMC.setText(String.valueOf(pnumero));
            txtsNumeroAPMC.setText(String.valueOf(snumero));


            txtNombreAPMC.setEnabled(true);
            txtApellidoAPMC.setEnabled(true);
        }

    }

}



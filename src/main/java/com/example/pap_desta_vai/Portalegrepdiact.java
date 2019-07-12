package com.example.pap_desta_vai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.pap_desta_vai.Bragancamenuact;
import com.example.pap_desta_vai.R;
import com.example.pap_desta_vai.cdbact;

public class Portalegrepdiact extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdiportalegre);

        ImageButton voltarbtn = (ImageButton) findViewById(R.id.voltarbtn);
        ImageButton jdpbtn = (ImageButton) findViewById(R.id.jdpbtn);

        voltarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Portalegrepdiact.this, Portalegremenuact.class);
                startActivity(intent);
            }
        });

        jdpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Portalegrepdiact.this, Castelobrancojdpact.class);
                startActivity(intent);
            }
        });

    }



}
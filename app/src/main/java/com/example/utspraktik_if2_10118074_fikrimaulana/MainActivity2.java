package com.example.utspraktik_if2_10118074_fikrimaulana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


    public class MainActivity2 extends AppCompatActivity {
        TextView tx_nik, tx_nama, tx_tgl_lahir, tx_jk, tx_hubungan;
        Button btn_ubah;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            tx_nik=(TextView)findViewById(R.id.nik);
            tx_nama=(TextView)findViewById(R.id.nama);
            tx_tgl_lahir=(TextView)findViewById(R.id.tgl_lahir);
            tx_jk=(TextView)findViewById(R.id.kelamin);
            tx_hubungan=(TextView)findViewById(R.id.Hubungan);

            Intent i = getIntent();
            tx_nik.setText(i.getExtras().getString("Nik"));
            tx_nama.setText(i.getExtras().getString("Nama"));
            tx_tgl_lahir.setText(i.getExtras().getString("Tgl_lahir"));
            tx_jk.setText(i.getExtras().getString("Jk"));
            tx_hubungan.setText(i.getExtras().getString("Hub"));

            btn_ubah=(Button)findViewById(R.id.ubah);
            btn_ubah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                }
            });

        }
    }
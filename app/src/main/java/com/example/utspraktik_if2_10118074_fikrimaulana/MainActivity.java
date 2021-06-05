package com.example.utspraktik_if2_10118074_fikrimaulana;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;



public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

        EditText edt_nik, edt_nama, edt_tgl_lahir;
        RadioButton radiocowo, radiocewe, rortu, rnikah, ranak, rlainnya;
        Button btn_simpan;
        String nik, nama, tgl_lahir, jkelamin, hub;
        RadioGroup rg, rg2;
        String tempJK, temp2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            edt_nik=(EditText)findViewById(R.id.nik);
            edt_nama=(EditText)findViewById(R.id.nama);
            edt_tgl_lahir=(EditText)findViewById(R.id.tgl_lahir);

            radiocowo=(RadioButton)findViewById(R.id.laki);
            radiocowo.setOnClickListener(null);
            radiocewe=(RadioButton)findViewById(R.id.perempuan);
            radiocewe.setOnClickListener(null);
            rg=(RadioGroup)findViewById(R.id.ri);
            rg.setOnCheckedChangeListener(this::onCheckedChanged);

            rortu=(RadioButton)findViewById(R.id.ortu);
            rnikah=(RadioButton)findViewById(R.id.nikah);
            ranak=(RadioButton)findViewById(R.id.anak);
            rlainnya=(RadioButton)findViewById(R.id.lainnya);
            rg2=(RadioGroup)findViewById(R.id.ri2) ;
            rg2.setOnCheckedChangeListener(this::onCheckedChanged2);




            btn_simpan=(Button)findViewById(R.id.simpan);
            btn_simpan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    nik=edt_nik.getText().toString();
                    nama=edt_nama.getText().toString();
                    tgl_lahir=edt_tgl_lahir.getText().toString();
                    jkelamin=tempJK.toString();
                    hub=temp2.toString();



                    Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                    i.putExtra("Nik", nik);
                    i.putExtra("Nama", nama);
                    i.putExtra("Tgl_lahir", tgl_lahir);
                    i.putExtra("Jk", jkelamin);
                    i.putExtra("Hub", hub);
                    startActivity(i);

                }
            });
        }

        public void onCheckedChanged(RadioGroup arg0, int arg1) {
            if(radiocowo.isChecked()){
                tempJK = "Pria";
            }
            if(radiocewe.isChecked()){
                tempJK = "Wanita";
            }
        }

        public void onCheckedChanged2(RadioGroup arg0, int arg1) {

            if(rortu.isChecked()){
                temp2 = "Orang Tua";
            }
            if(rnikah.isChecked()){
                temp2 = "Suami/Istri";
            }
            if(ranak.isChecked()){
                temp2 = "Anak";
            }
            if(rlainnya.isChecked()){
                temp2 = "Hubungan Lainnya";
            }
        }
    }

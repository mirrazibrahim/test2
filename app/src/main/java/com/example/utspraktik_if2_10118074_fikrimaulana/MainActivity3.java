package com.example.utspraktik_if2_10118074_fikrimaulana;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


    public class MainActivity3{
        public void showDialog(Activity activity, String msg){
            final Dialog dialog = new Dialog(activity);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.activity_main3);

            TextView text = (TextView) dialog.findViewById(R.id.pesan);
            text.setText(msg);

            Button dialogButton = (Button) dialog.findViewById(R.id.ok);
            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });

            dialog.show();

        }
    }
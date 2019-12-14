package com.example.android.aryadutagroup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Join extends AppCompatActivity {
        private Button btAlert;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_join);
            btAlert = (Button) findViewById(R.id.signup);
            btAlert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showDialog();
                }
            });
        }

        private void showDialog(){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                    this);

            // set title dialog
            alertDialogBuilder.setTitle("Aryaduta Group");

            // set pesan dari dialog
            alertDialogBuilder
                    .setMessage("Thank you! Your request has been processed, we will contact you shortly")
                    .setIcon(R.mipmap.ic_launcher)
                    .setCancelable(false)
                    .setPositiveButton("Ok",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // jika tombol ini diklik, akan menutup dialog
                            // dan tidak terjadi apa2
                            dialog.cancel();
                        }
                    });

            // membuat alert dialog dari builder
            AlertDialog alertDialog = alertDialogBuilder.create();

            // menampilkan alert dialog
            alertDialog.show();


        }
    private String Join (String name, String mobile, String mail){

        String priceMessage
                = getString(R.string.join_name, name)
                + ("\nJumlah Tiket : " + name);
        priceMessage += "\nPrice Total $" + mobile;
        priceMessage += "\nPrice Total $" + mail;

        return priceMessage;
    }
    /**
     * This method displays the given quantity value on the screen.
     */

}
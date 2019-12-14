package com.example.android.aryadutagroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView hotels = (TextView) findViewById(R.id.gambarhotels);

        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelIntent = new Intent(MainActivity.this, InfoHotels.class);
                startActivity(hotelIntent);
            }
        });


        TextView joinn = (TextView) findViewById(R.id.join);
        joinn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent joinIntent = new Intent(MainActivity.this, Join.class);
                startActivity(joinIntent);
            }
        });

        ImageView intent1 = (ImageView) findViewById(R.id.mail);
        intent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        TextView intent = (TextView) findViewById(R.id.pesan);
        intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        ImageView intent2 = (ImageView) findViewById(R.id.phone);
        intent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String nomor = "+62 21 23521234" ;
                Intent panggil = new Intent(Intent. ACTION_DIAL);
                panggil.setData(Uri. fromParts("tel",nomor,null));
                startActivity(panggil);
            }
        });

        TextView intent3 = (TextView) findViewById(R.id.kontak);
        intent3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String nomor = "+62 21 23521234" ;
                Intent panggil = new Intent(Intent. ACTION_DIAL);
                panggil.setData(Uri. fromParts("tel",nomor,null));
                startActivity(panggil);
            }
        });
    }
}

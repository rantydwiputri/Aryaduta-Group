package com.example.android.aryadutagroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Aryaduta_Palembang extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aryaduta__palembang);

        final ImageView browserIntent = (ImageView) findViewById(R.id.book);
        browserIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aryaduta.com/"));
                startActivity(browserIntent);
            }
        });



        ImageView mapIntent = (ImageView) findViewById(R.id.direct);
        mapIntent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri location = Uri.parse("geo:0,0?q=1600+Aryaduta+Palembang,+Palembang+View,+Indonesia");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                    startActivity(mapIntent);
            }
        });
    }
}
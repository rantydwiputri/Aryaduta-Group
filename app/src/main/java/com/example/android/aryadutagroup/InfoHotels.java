package com.example.android.aryadutagroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class InfoHotels extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.ListViewTest.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_hotels);

        // Create an ArrayList of AndroidFlavor objects
        ArrayList<AndroidFlavor> androidFlavors = new ArrayList<AndroidFlavor>();

        androidFlavors.add(new AndroidFlavor("Aryaduta Palembang", "Palembang, Sumatera Selatan, Indonesia", R.drawable.aryaplg));
        androidFlavors.add(new AndroidFlavor("Aryaduta Lippo Village", "Tangerang, Banten, Indonesi", R.drawable.aryalippol));
        androidFlavors.add(new AndroidFlavor("Aryaduta Jakarta", "Jakarta, Indonesia", R.drawable.aryajkt));
        androidFlavors.add(new AndroidFlavor("Aryaduta Bandung", "Bandung, Jawa Barat, Indonesia", R.drawable.aryabdg));
        androidFlavors.add(new AndroidFlavor("Aryaduta Pekan Baru", "Pekanbaru, Indonesia", R.drawable.aryapkn));
        androidFlavors.add(new AndroidFlavor("Aryaduta Medan", "Medan, North Sumatera, Indonesia", R.drawable.aryamedan));
        androidFlavors.add(new AndroidFlavor("Aryaduta Bali", "Bali Indonesia", R.drawable.ryabl));
        androidFlavors.add(new AndroidFlavor("Aryaduta Makassar", "Makassar, South Sulawesi, Indonesia", R.drawable.aryamakas));
        androidFlavors.add(new AndroidFlavor("Aryaduta Manado", "Manado, North Sulawesi,Indonesia", R.drawable.aryamn));


        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        AndroidFlavorAdapter Adapter = new AndroidFlavorAdapter(this, androidFlavors);

        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(Adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent aryaplg = new Intent(InfoHotels.this, Aryaduta_Palembang.class);
                startActivity(aryaplg);
            }
        });

    }
}

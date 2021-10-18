package com.example.biodataa11202013028;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void telepon(View view) {
        String number = "+6281392316732";
        Intent Intent = new Intent(android.content.Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode(number)));
        startActivity(Intent);
    }

    public void email(View view) {
        String email = "111202013028@mhs.dinus.ac.id";
        Intent Intent = new Intent(android.content.Intent.ACTION_SENDTO, Uri.parse("mailto:" +Uri.encode(email)));
        startActivity(Intent);
    }

    public void alamat(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=-6.780977,110.7161577");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
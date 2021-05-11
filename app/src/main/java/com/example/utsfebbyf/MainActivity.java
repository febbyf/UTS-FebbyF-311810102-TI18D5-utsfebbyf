package com.example.utsfebbyf;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panggil(View view) {
        String nomor = "085894147814";
        Intent panggil = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri. fromParts("tel",nomor,null));
        startActivity(panggil);
    }

    public void buka(View view) {
        String url = "https://google.com";
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity((bukabrowser));
    }

    public void tulisemail (String addresses, String subject, Uri attachment) {
        Intent tulisemail = new Intent(Intent.ACTION_SEND);
        tulisemail.setType("*/*");
        tulisemail.putExtra(Intent.EXTRA_EMAIL, addresses);
        tulisemail.putExtra(Intent.EXTRA_SUBJECT, subject);
        tulisemail.putExtra(Intent.EXTRA_STREAM, attachment);
        if (tulisemail.resolveActivity(getPackageManager()) != null) {
            startActivity(tulisemail);
        }
    }

    public void showMap(Uri geoLocation) {
        Intent showMap = new Intent(Intent.ACTION_VIEW);
        showMap.setData(geoLocation);
        if (showMap.resolveActivity(getPackageManager()) != null) {
            startActivity(showMap);
        }
    }

    public void tentang(View view) {
        Intent tentang = new Intent(MainActivity.this, Tentang.class);
        startActivity(tentang);
    }

    public void showMap(View view) {
    }

    public void tulisemail(View view) {
    }
}
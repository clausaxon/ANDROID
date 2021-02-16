package com.example.testintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tombolkontak = (Button)findViewById(R.id.btnKontak);
        Button tombolgambar = (Button)findViewById(R.id.btnGambar);
        Button tombolmusik = (Button)findViewById(R.id.btnMusik);
        Button tombolweb = (Button)findViewById(R.id.btnWeb);
        Button tombolyutub = (Button)findViewById(R.id.btnYoutube);
        Button tombolkamera = (Button)findViewById(R.id.btnKamera);

        tombolkontak.setOnClickListener(operasi);
        tombolgambar.setOnClickListener(operasi);
        tombolmusik.setOnClickListener(operasi);
        tombolweb.setOnClickListener(operasi);
        tombolyutub.setOnClickListener(operasi);
        tombolkamera.setOnClickListener(operasi);
    }

    View.OnClickListener operasi = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnKontak:bukaKontak();break;
                case R.id.btnGambar:bukaGambar();break;
                case R.id.btnMusik:bukaMusik();break;
                case R.id.btnWeb:bukaWeb();break;
                case R.id.btnYoutube:bukaYutub();break;
                case R.id.btnKamera:bukaKamera();break;
            }
        }

        private void bukaKontak() {
            Intent intentku = new Intent(getBaseContext(), kontak.class);
            startActivityForResult(intentku,0);
        }
        private void bukaYutub(){
            Intent intentku = new Intent(Intent.ACTION_VIEW, Uri.parse("http://youtube.com"));
            startActivity(intentku);
        }

        private void bukaWeb(){
            Intent intentku = new Intent(getBaseContext(), web.class);
            startActivityForResult(intentku,0);
        }
        private void bukaGambar(){
            Intent i = new Intent();
            i.setAction(Intent.ACTION_VIEW);
            i.setData(Uri.parse("content://media/internal/images/media"));
            startActivity(i);
        }
        private void bukaMusik(){
            Intent intent;
            intent = new Intent(MediaStore.INTENT_ACTION_MUSIC_PLAYER);
            startActivity(intent);
        }
        private void bukaKamera(){
            Intent intent;
            intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        }


    };


}
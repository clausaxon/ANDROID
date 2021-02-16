package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button tombol1,tombol2, tombol3, tombol4, tombol5, tombol6, tombol7, tombol8, tombol9, tombolc, tombolhasil, tomboltitik, tomboltambah, tombolkurang, tombolbagi, tombolkali, tombol0;
    private TextView hasil;
    private EditText monitor;
    float valueOne,valueTwo;
    boolean addition, deletion, multiply, divide;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombol0 = (Button)findViewById(R.id.btn0);
        tombol1 = (Button)findViewById(R.id.btn1);
        tombol3 = (Button)findViewById(R.id.btn3);
        tombol4 = (Button)findViewById(R.id.btn4);
        tombol5 = (Button)findViewById(R.id.btn5);
        tombol6 = (Button)findViewById(R.id.btn6);
        tombol7 = (Button)findViewById(R.id.btn7);
        tombol8 = (Button)findViewById(R.id.btn8);
        tombol9 = (Button)findViewById(R.id.btn0);
        tombolc = (Button)findViewById(R.id.btnC);
        tomboltitik = (Button)findViewById(R.id.btndot);
        tomboltambah = (Button)findViewById(R.id.btnTambah);
        tombolbagi = (Button)findViewById(R.id.btnBagi);
        tombolkali = (Button)findViewById(R.id.btnKali);
        tombolkurang = (Button)findViewById(R.id.btnKurang);
        tombolhasil = (Button)findViewById(R.id.btnHasil);
        monitor = (EditText)findViewById(R.id.bilangan);
        hasil = (TextView)findViewById(R.id.viewResult);

        monitor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = monitor.getText().toString();
                int symbols = text.length();
                hasil.setText("" + symbols);
                count = symbols;
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    public void view1(View v){

        monitor.setText(monitor.getText()+ "1");
    }
    public void view2(View v){
        monitor.setText(monitor.getText()+ "2");
    }
    public void view3(View v){
        monitor.setText(monitor.getText()+ "3");
    }
    public void view4(View v){
        monitor.setText(monitor.getText()+ "4");
    }
    public void view5(View v){
        monitor.setText(monitor.getText()+ "5");
    }
    public void view6(View v){
        monitor.setText(monitor.getText()+ "6");
    }
    public void view7(View v){
        monitor.setText(monitor.getText()+ "7");
    }
    public void view8(View v){
        monitor.setText(monitor.getText()+ "8");
    }
    public void view9(View v){
        monitor.setText(monitor.getText()+ "9");
    }
    public void view0(View v){
        monitor.setText(monitor.getText()+ "0");
    }
    public void tambah(View v){
        monitor.setText(monitor.getText()+ "+");
    }
    public void kurang(View v){
        monitor.setText(monitor.getText()+ "-");
    }
    public void bagi(View v){
        monitor.setText(monitor.getText()+ "/");
    }
    public void kali(View v){
        monitor.setText(monitor.getText()+ "X");
    }

    public void result(View v){
        if (count == 0 ){
            hasil.setText("");
        } else {
            hasil.set
        }
    }



    public void viewC (View v){
        monitor.setText("");
    }
}
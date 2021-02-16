package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calculator11.R;

public class MainActivity extends AppCompatActivity {
    private EditText editBil1, editBil2;
    private TextView hasil;
    float mValueOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editBil1 = (EditText)findViewById(R.id.input1);
        editBil2 = (EditText)findViewById(R.id.input2);
        hasil = (TextView)findViewById(R.id.output);
    }
    /*public void tambah (View v){
        float bil1,bil2,total;
        bil1 = Float.parseFloat(editBil1.getText().toString());
        bil2 = Float.parseFloat(editBil2.getText().toString());
        total = bil1+bil2;
        hasil.setText(bil1 + "+" + bil2 + " = " + total);
    }
    public void kurang (View v){
        float bil1,bil2,total;
        bil1 = Float.parseFloat(editBil1.getText().toString());
        bil2 = Float.parseFloat(editBil2.getText().toString());
        total = bil1-bil2;
        hasil.setText(bil1 + "-" + bil2 + " =" + total);
    }
    public void kali (View v){
        float bil1,bil2,total;
        bil1 = Float.parseFloat(editBil1.getText().toString());
        bil2 = Float.parseFloat(editBil2.getText().toString());
        total = bil1*bil2;
        hasil.setText(bil1 + "X" + bil2 + " =" + total);
    }
    public void bagi (View v){
        float bil1,bil2,total;
        bil1 = Float.parseFloat(editBil1.getText().toString());
        bil2 = Float.parseFloat(editBil2.getText().toString());
        total = bil1/bil2;
        hasil.setText(bil1 + "/" + bil2 + " =" + total);
    }*/
    public void hapus (View v){
        float totalnow=0;
        hasil.setText("0");
    }

    public void operasi(View v){
        float bil1,bil2,total = 0, totalnow=0;
        Button bt;
        mValueOne = Float.parseFloat(hasil.getText() + "");
        bil1 = Float.parseFloat(editBil1.getText().toString());
        bil2 = Float.parseFloat(editBil2.getText().toString());
        switch (v.getId()) {
            case R.id.btnTambah: total = bil1 + bil2 ; break;
            case R.id.btnKurang: total = bil1 - bil2 ; break;
            case R.id.btnBagi: total = bil1 / bil2 ; break;
            case R.id.btnKali: total = bil1 * bil2 ; break;
        }
        bt =(Button) findViewById(v.getId());
        mValueOne = total + mValueOne;
        hasil.setText(bil1 + " " + bt.getText() + " " + bil2 + " =" + mValueOne);
    }
}
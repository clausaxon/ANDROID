package com.example.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editBil1, editBil2, txtinput1, txtinput2;
    private TextView hasil, hasilnya;
    float mValueOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*editBil1 = (EditText)findViewById(R.id.input1);
        editBil2 = (EditText)findViewById(R.id.input2);
        hasil = (TextView)findViewById(R.id.output);*/
        hasilnya = (TextView)findViewById(R.id.result);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(op);
        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(op);
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(op);
    }

    View.OnClickListener op = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button:
                    tampil_input();break;
                case R.id.button1:
                    tampil_input1();break;
                case R.id.button2:
                    tampil_input2();break;
            }
        }
    };

    /*private void tampil_input(){
        LayoutInflater li = LayoutInflater.from(this);
        View inputnya = li.inflate(R.layout.input_dialog,null);

        AlertDialog.Builder dialognya = new AlertDialog.Builder(this);
        dialognya.setView(inputnya);
        txtinput1 = (EditText) inputnya.findViewById(R.id.edittext);

        dialognya
                .setCancelable(false)
                .setPositiveButton("Ok",oknya)
                .setNegativeButton("Batal",oknya);
        dialognya.show();
    }*/

    private void tampil_input1(){
        LayoutInflater li = LayoutInflater.from(this);
        View inputnya = li.inflate(R.layout.input_dialog,null);

        AlertDialog.Builder dialognya = new AlertDialog.Builder(this);
        dialognya.setView(inputnya);
        txtinput1 = (EditText) inputnya.findViewById(R.id.edittext);

        dialognya
                .setCancelable(false)
                .setPositiveButton("Ok",oknya)
                .setNegativeButton("Batal",oknya);
        dialognya.show();
    }

    private void tampil_input2(){
        LayoutInflater li = LayoutInflater.from(this);
        View inputnya = li.inflate(R.layout.input_dialog,null);

        AlertDialog.Builder dialognya = new AlertDialog.Builder(this);
        dialognya.setView(inputnya);
        txtinput1 = (EditText) inputnya.findViewById(R.id.edittext);

        dialognya
                .setCancelable(false)
                .setPositiveButton("Ok",oknya)
                .setNegativeButton("Batal",oknya);
        dialognya.show();
    }

    DialogInterface.OnClickListener oknya = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            switch (which) {
                case -1: hasilnya.setText(txtinput1.getText().toString());
                    break;
                case -2:
                    break;
            }
        }
    };
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
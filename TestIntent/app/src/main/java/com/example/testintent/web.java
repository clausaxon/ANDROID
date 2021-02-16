package com.example.testintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        final WebView webku = (WebView) findViewById(R.id.wBrowse);
        webku.setWebViewClient(new WebViewClient());
        webku.getSettings().setJavaScriptEnabled(true);


        Button go = (Button)findViewById(R.id.bGo);
        final EditText urlnya = (EditText)findViewById(R.id.txtURL);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlku= "https://" + urlnya.getText().toString();
                Toast.makeText(getBaseContext(),"Load url " + urlku , Toast.LENGTH_LONG).show();
                webku.loadUrl(urlku);
            }
        });
    }
}
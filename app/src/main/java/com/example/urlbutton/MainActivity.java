package com.example.urlbutton;

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
    public void MyWeb(View view) {

        openUrl("https://swarnandhra.ac.in/");

    }

    public void openUrl (String url){

        Uri uri=Uri.parse(url);

        Intent iy=new Intent(Intent.ACTION_VIEW,uri);

        startActivity(iy);

    }
    public void MyRes(View view) {

        openUrls("https://www.swarnandhraexambranch.com/Login.aspx");

    }
    public void openUrls (String url){

        Uri uri=Uri.parse(url);

        Intent iys=new Intent(Intent.ACTION_VIEW,uri);

        startActivity(iys);

    }

}
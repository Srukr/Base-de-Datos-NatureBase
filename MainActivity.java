package com.example.naturebasestringparameter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Show logo on ActionBar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    //QueryTester Method
    public void QueryTester(View view){
        Intent intent = new Intent(this, QueryTester.class);
        startActivity(intent);
        this.finish();
    }

    //Catalogue method
    public void Catalogue(View view){
        Intent intent = new Intent(this, Catalogue.class);
        startActivity(intent);
        this.finish();
    }

    //Nursery Maps Method
    public void Maps(View view){
        Intent intent = new Intent(this, MapSelection.class);
        startActivity(intent);
        this.finish();
    }

    //About button
    public void About(View view){
        Intent intent = new Intent(this, AboutSelection.class);
        startActivity(intent);
        this.finish();
    }
}

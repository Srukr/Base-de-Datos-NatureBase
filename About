package com.example.naturebasestringparameter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class About extends AppCompatActivity {

    private ImageButton ib1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Show logo on ActionBar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        int choice = getIntent().getIntExtra("aboutchoice",1);
        ib1 = (ImageButton)findViewById(R.id.imageButtonAbout);

        if (choice == 1){
            ib1.setImageResource(R.drawable.fondoaboutplants);
        } else if (choice == 2){
            ib1.setImageResource(R.drawable.fondoaboutmaps);
        } else if(choice == 3){
            ib1.setImageResource(R.drawable.fondoaboutapp);
        } else {
            ib1.setImageResource(R.drawable.logoconfondo);
        }

    }

    //Go back
    public void GoBack(View view){
        Intent intent = new Intent(this, AboutSelection.class);
        startActivity(intent);
        this.finish();
    }

    //Disable back button
    @Override
    public void onBackPressed(){

    }
}

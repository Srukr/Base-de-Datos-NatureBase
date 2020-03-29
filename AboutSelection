package com.example.naturebasestringparameter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutSelection extends AppCompatActivity {

    private Button plants, maps, app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_selection);

        //Show logo on ActionBar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        plants = (Button)findViewById(R.id.aboutPlants);
        maps = (Button)findViewById(R.id.aboutMaps);
        app = (Button)findViewById(R.id.aboutApp);
    }

    //Method that gives the aboutButtons functionality
    public void AboutFunctionality(View view){
        if(plants.isPressed()== true){
            int aboutchoice = 1;
            Intent intent = new Intent(this, About.class);
            intent.putExtra("aboutchoice",aboutchoice);
            startActivity(intent);
            this.finish();
        } else if (maps.isPressed() == true){
            int aboutchoice = 2;
            Intent intent = new Intent(this, About.class);
            intent.putExtra("aboutchoice", aboutchoice);
            startActivity(intent);
            this.finish();
        } else if (app.isPressed() == true){
            int aboutchoice = 3;
            Intent intent = new Intent(this, About.class);
            intent.putExtra("aboutchoice", aboutchoice);
            startActivity(intent);
            this.finish();
        }
    }



    //Go back
    public void GoBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }

    //Disable back button
    @Override
    public void onBackPressed(){

    }
}

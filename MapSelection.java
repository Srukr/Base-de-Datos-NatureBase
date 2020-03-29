package com.example.naturebasestringparameter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapSelection extends AppCompatActivity {

    private Button mainNurseryButton, secondNurseryButton, thirdNurseryButton;
    private int choice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_selection);

        //Show logo on ActionBar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        mainNurseryButton = (Button)findViewById(R.id.mainNursery);
        secondNurseryButton = (Button)findViewById(R.id.secondNursery);
        thirdNurseryButton = (Button)findViewById(R.id.farNursery);


    }

    //Method that makes the maps pop up
    public void MapFunctionality(View view){
        if (mainNurseryButton.isPressed() == true){
            int mapa1 = 1;
            Intent intent = new Intent(this, ShownMap.class);
            intent.putExtra("choice", mapa1);
            startActivity(intent);
            this.finish();
        } else if (secondNurseryButton.isPressed() == true){
            int mapa2 = 2;
            Intent intent = new Intent(this, ShownMap.class);
            intent.putExtra("choice", mapa2);
            startActivity(intent);
            this.finish();
        } else if (thirdNurseryButton.isPressed() == true){
            int mapa3 = 3;
            Intent intent = new Intent(this, ShownMap.class);
            intent.putExtra("choice", mapa3);
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

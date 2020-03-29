package com.example.naturebasestringparameter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ShownMap extends AppCompatActivity {

    private ImageView map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shown_map);


        //Show logo on ActionBar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        int selectedMap = getIntent().getIntExtra("choice", 1);
        map = (ImageView)findViewById(R.id.imageView_Map);

        if (selectedMap == 1){
            map.setImageResource(R.drawable.mainnursery);
        } else if (selectedMap == 2){
            map.setImageResource(R.drawable.secondnursery);
        }else if (selectedMap == 3){
            map.setImageResource(R.drawable.thirdnursery);
        }


    }


    //Go back
    public void GoBack(View view){
        Intent intent = new Intent(this, MapSelection.class);
        startActivity(intent);
        this.finish();
    }

    //Disable back button
    @Override
    public void onBackPressed(){

    }
}

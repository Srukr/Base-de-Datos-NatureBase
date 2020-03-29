package com.example.naturebasestringparameter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class PlantView extends AppCompatActivity {

    private ImageButton ib1;
    private TextView textViewID;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_view);

        //Show logo on ActionBar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        ib1 = (ImageButton)findViewById(R.id.imageButton_PlantView);
        textViewID = (TextView)findViewById(R.id.textViewID);


        //Receive the name of the plant so that we can look for it in the database
        String shownID = getIntent().getStringExtra("ID");


        //Open the database and look for the imagename that is associated with detailsID
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        String shownImageName = databaseAccess.getImageName(shownID);
        databaseAccess.close();

        //Get id of the image
        int resID = getResources().getIdentifier(shownImageName, "drawable", getPackageName());

        //Give said id so that ib1 can display it
        ib1.setImageResource(resID);

        //Set textview to the index so we can use it later
        textViewID.setText(shownID);


    }

    //When pressing on the image method
    public void PlantDetailsButton(View view){
        String detailsSentID = textViewID.getText().toString();
        Intent intent = new Intent(this, PlantDetails.class);
        intent.putExtra("ID", detailsSentID);
        startActivity(intent);
        this.finish();
    }


    //Disable back button
    @Override
    public void onBackPressed(){

    }

    //Go back
    public void GoBack(View view){
        Intent intent = new Intent(this, Catalogue.class);
        startActivity(intent);
        this.finish();
    }


}

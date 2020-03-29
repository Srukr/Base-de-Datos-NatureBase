package com.example.naturebasestringparameter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlantDetails extends AppCompatActivity {

    private TextView tvType, tvCommonName, tvLatinName, tvExposure, tvMoisture, tvHeight, tvAvailability, tvEase;
    String Type, CommonName, LatinName, Exposure, Moisture, Height, Availability, Ease;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_details);

        //Show logo on ActionBar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        String informationID = getIntent().getStringExtra("ID");

        tvType = (TextView)findViewById(R.id.textView_Type);
        tvCommonName = (TextView)findViewById(R.id.textView_CommonName);
        tvLatinName = (TextView)findViewById(R.id.textView_LatinName);
        tvExposure = (TextView)findViewById(R.id.textView_Exposure);
        tvMoisture = (TextView)findViewById(R.id.textView_Moisture);
        tvHeight = (TextView)findViewById(R.id.textView_Height);
        tvAvailability = (TextView)findViewById(R.id.textView_Availability);
        tvEase = (TextView)findViewById(R.id.textView_Ease);

        //Open the database and look for the imagename that is associated with detailsID
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        Type = databaseAccess.getType(informationID);
        CommonName = databaseAccess.getCommonName(informationID);
        LatinName = databaseAccess.getLatinName(informationID);
        Exposure = databaseAccess.getExposure(informationID);
        Moisture = databaseAccess.getMoisture(informationID);
        Height = databaseAccess.getHeight(informationID);
        Availability = databaseAccess.getAvailability(informationID);
        Ease = databaseAccess.getEase(informationID);
        databaseAccess.close();

        //Display this stuff in our textviews
        tvType.setText("Type: " + Type);
        tvCommonName.setText("Common Name: " + CommonName);
        tvLatinName.setText("Latin Name: " + LatinName);
        tvExposure.setText("Exposure: " + Exposure);
        tvMoisture.setText("Moisture: " + Moisture);
        tvHeight.setText("Height (ft): " + Height);
        tvAvailability.setText("Availability: " + Availability);
        tvEase.setText("Ease of Growth: " + Ease);



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

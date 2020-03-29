package com.example.naturebasestringparameter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class QueryTester extends AppCompatActivity {

    private TextView tv1;
    private EditText et1;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query_tester);

        //Show logo on ActionBar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        tv1 = (TextView)findViewById(R.id.textView_showquery);
        et1 = (EditText)findViewById(R.id.editText_query);
        button1 = (Button)findViewById(R.id.button_runquery);

        //Clicklistener on querybutton
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create the instance of database access class and open database connection
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();

                //Getting string value from edittext
                String n = et1.getText().toString();
                String CommonName = databaseAccess.getImageName(n);

                //set textview to result
                tv1.setText(CommonName);

                //Close the database
                databaseAccess.close();
            }
        });


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

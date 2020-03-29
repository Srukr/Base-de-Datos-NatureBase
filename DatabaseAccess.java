package com.example.naturebasestringparameter;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseAccess {private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static DatabaseAccess instance;
    Cursor c = null;

    //Constructor
    private DatabaseAccess(Context context){
        this.openHelper = new DatabaseOpenHelper(context);

    }

    //Return single instance of database
    public static DatabaseAccess getInstance(Context context){
        if(instance == null){
            instance = new DatabaseAccess(context);

        }
        return instance;
    }

    //To open the database
    public void open(){
        this.db = openHelper.getWritableDatabase();

    }

    //Close the database
    public void close(){
        if(db != null){
            this.db.close();
        }
    }

    //Method to query the database and return CommonName of Plant
    public String getCommonName(String CommonName){
        c = db.rawQuery("select Common_Name from Hoja1 where Common_Name = '" + CommonName + "'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while(c.moveToNext()){
            String CommonName2 = c.getString(0);
            buffer.append(""+CommonName2);
        }
        return buffer.toString();
    }

    //Method to query the database and return ID of Plant
    public String getID(String CommonName){
        c = db.rawQuery("select ID from Hoja1 where Common_Name = '" + CommonName + "'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while(c.moveToNext()){
            String ID = c.getString(0);
            buffer.append(""+ID);
        }
        return buffer.toString();
    }

    //Method to query the database for the Type of the plant
    public String getType(String CommonName){
        c = db.rawQuery("select Type from Hoja1 where Common_Name = '" + CommonName + "'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while(c.moveToNext()){
            String Type = c.getString(0);
            buffer.append(""+Type);
        }
        return buffer.toString();
    }

    //Method to query the database for LatinName of the plant
    public String getLatinName(String CommonName){
        c = db.rawQuery("select Latin_Name from Hoja1 where Common_Name = '" + CommonName + "'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while(c.moveToNext()){
            String LatinName = c.getString(0);
            buffer.append(""+LatinName);
        }
        return buffer.toString();
    }

    //Method to query the database for Exposure of the plant
    public String getExposure(String CommonName){
        c = db.rawQuery("select Exposure from Hoja1 where Common_Name = '" + CommonName + "'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while(c.moveToNext()){
            String Xposure = c.getString(0);
            buffer.append(""+Xposure);
        }
        return buffer.toString();
    }

    //Method to query the database for Moisture of the plant
    public String getMoisture(String CommonName){
        c = db.rawQuery("select Moisture from Hoja1 where Common_Name = '" + CommonName + "'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while(c.moveToNext()){
            String Moisture = c.getString(0);
            buffer.append(""+Moisture);
        }
        return buffer.toString();
    }

    //Method to query the database for Height of the plant
    public String getHeight(String CommonName){
        c = db.rawQuery("select Height from Hoja1 where Common_Name = '" + CommonName + "'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while(c.moveToNext()){
            String Height = c.getString(0);
            buffer.append(""+Height);
        }
        return buffer.toString();
    }

    //Method to query the database for Availability of the plant
    public String getAvailability(String CommonName){
        c = db.rawQuery("select Availability from Hoja1 where Common_Name = '" + CommonName + "'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while(c.moveToNext()){
            String av = c.getString(0);
            buffer.append(""+av);
        }
        return buffer.toString();
    }

    //Method to query the database for Ease of Growth of the plant
    public String getEase(String CommonName){
        c = db.rawQuery("select Ease_of_Growth from Hoja1 where Common_Name = '" + CommonName + "'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while(c.moveToNext()){
            String ease = c.getString(0);
            buffer.append(""+ease);
        }
        return buffer.toString();
    }

    //Method to query the database for ImageName of the plant
    public String getImageName(String CommonName){
        c = db.rawQuery("select Image_Name from Hoja1 where Common_Name = '" + CommonName + "'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while(c.moveToNext()){
            String name = c.getString(0);
            buffer.append(""+name);
        }
        return buffer.toString();
    }

}

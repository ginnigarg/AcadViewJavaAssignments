package com.example.ginni.notesapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class DataBase {

    SQLiteDatabase database;
    Context context;

    DataBase(Context context) {
        this.context = context;
        database = context.openOrCreateDatabase("userDatabase",Context.MODE_PRIVATE,null);
        try {
            database.execSQL("CREATE TABLE IF NOT EXISTS USERS (name VARCHAR,password VARCHAR)");
        } catch (Exception e) {
            throw e;
        }

    }

    void addUser(String tableName,String password) {
        try {
            database.execSQL("CREATE TABLE IF NOT EXISTS " +tableName+ " (notes VARCHAR)");
            Log.i("CreateTable","notes table created");
            database.execSQL("INSERT INTO USERS VALUES('" +tableName+ "', '" +password+ "')");
            Log.i("CreateTable","users table created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void insert(String tableName,String note) {
        database.execSQL("INSERT INTO " +tableName+ " VALUES('" +note+ "')");
    }

    boolean checkUser(String tableName) {
        Cursor c = null;
        try
        {
            c = database.query(tableName, null,
                    null, null, null, null, null);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }

    boolean authenticate(String username,String password) {
        Cursor c = database.rawQuery("SELECT * FROM USERS",null);
        Log.i("AuthenticateCalled", username + " " + password + " Being Authenticated"+c.getColumnName(0)+c.getColumnName(1));
        if(c.moveToFirst()) {
            Log.i("CursorChecker","Cursor moved To first");
            do {
                Log.i("Passwords",c.getString(1));
                if(c.getString(1).contentEquals(password) && c.getString(0).contentEquals(username)) {
                    Log.i("Authentication ",username + " " + password + " Successfully Authenticated");
                    return true;
                }
            } while(c.moveToNext());
        }
        return false;
    }

    ArrayList<String> getNotes(String tablename) {
        Cursor c = database.rawQuery("SELECT * FROM " +tablename+ "",null);
        ArrayList<String> notes = new ArrayList<>();
        if(c.moveToFirst()) {
            do {
                int index = c.getColumnIndex("notes");
                String note = c.getString(index);
                notes.add(note);
            } while (c.moveToNext());
        }
        return  notes;
    }

}

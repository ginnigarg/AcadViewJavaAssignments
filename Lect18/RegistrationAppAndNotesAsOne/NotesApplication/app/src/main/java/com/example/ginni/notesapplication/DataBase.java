package com.example.ginni.notesapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

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
            database.execSQL("INSERT INTO USERS VALUES (" +tableName+ "," +password);
            database.execSQL("CREATE TABLE IF NOT EXISTS " +tableName+ "(notes VARCHAR)");
        } catch (Exception e) {
            throw e;
        }
    }

    void insert(String tablename,String note) {
        database.execSQL("INSERT INTO " +tablename+ " VALUES('" +note+ "')");
    }

    boolean checkUser(String tablename) {
        Cursor c = null;
        try
        {
            c = database.query(tablename, null,
                    null, null, null, null, null);
        }
        catch (Exception e) {
            return false;
        }
        return true;
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

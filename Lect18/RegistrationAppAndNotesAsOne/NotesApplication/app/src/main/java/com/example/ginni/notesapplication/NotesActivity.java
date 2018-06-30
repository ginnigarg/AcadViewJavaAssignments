package com.example.ginni.notesapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NotesActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> notesList;
    ArrayAdapter<String> notesAdapter;
    DataBase dataBase;
    Preferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        listView = findViewById(R.id.list);

        dataBase = new DataBase(getApplicationContext());
        sharedPreferences = new Preferences(getApplicationContext());

        Toast.makeText(getApplicationContext(),"Welcome"+sharedPreferences.getName(),Toast.LENGTH_LONG);

        displayNotes();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return  true;
    }

    private void openDialogBox(final String tablename) {

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.dialogbox, null);
        dialogBuilder.setView(dialogView);

        final EditText editText = dialogView.findViewById(R.id.edit1);

        dialogBuilder.setTitle("Add Note\n");
        dialogBuilder.setMessage("Enter the note below : ");
        dialogBuilder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dataBase.insert(tablename,editText.getText().toString());
                displayNotes();
            }
        });
        AlertDialog b = dialogBuilder.create();
        b.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.addItem) {
            openDialogBox(sharedPreferences.getName());
        } else if(id == R.id.logout) {
            sharedPreferences.changeStatus(false);
            Intent intent = new Intent(NotesActivity.this,LoginActivity.class);
            startActivity(intent);
            finish();
        }
        return true;
    }

    void displayNotes() {

        notesList = dataBase.getNotes(sharedPreferences.getName());

        if(!notesList.isEmpty()) {
            notesAdapter = new ArrayAdapter<>(NotesActivity.this,android.R.layout.simple_list_item_1,notesList);
            listView.setAdapter(notesAdapter);
        }



    }
}

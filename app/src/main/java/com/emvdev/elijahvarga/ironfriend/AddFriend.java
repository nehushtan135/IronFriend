package com.emvdev.elijahvarga.ironfriend;

import android.content.ContentValues;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class AddFriend extends AppCompatActivity {

    ironDBHelper i = new ironDBHelper(this);
    EditText name= (EditText) findViewById(R.id.personName);
    EditText number= (EditText) findViewById(R.id.personNumber);
    EditText birthday= (EditText) findViewById(R.id.personBday);
    ContentValues cv = new ContentValues();
    cv.put("personid", 1)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        public void finishFriend(View view) {
        i.getWritableDatabase().insert("persons",null, + name.getText() + ", " + number.getText() + ", " + birthday.getText() + ")");
    }

}

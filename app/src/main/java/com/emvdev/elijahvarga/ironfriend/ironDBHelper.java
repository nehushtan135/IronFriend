package com.emvdev.elijahvarga.ironfriend;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Elijah Varga on 4/23/2016.
 */
public class ironDBHelper extends SQLiteOpenHelper {
    //person table information
    static final String personTable = "persons";
    static final String personID = "personid";
    static final String personName = "name";
    static final String personNumber = "number";
    static final String personBday = "bday";

    //request table information
    static final String requestTable = "requests";
    static final String request
    static final String
    static final String

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "IronFriend.db";
    public ironDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + personTable + " ("
                + personID + " INTEGER PRIMARY KEY,"
                + personName + " NOT NULL TEXT,"
                + personNumber + " TEXT,"
                + personBday + " TEXT )");
        db.execSQL("CREATE TABLE " +);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

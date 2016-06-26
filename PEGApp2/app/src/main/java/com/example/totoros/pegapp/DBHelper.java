package com.example.totoros.pegapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by totoros on 13/10/2015.
 */
public class DBHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "instructors_db.db";
    //private static
    DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.e("DATABASE OPERATION", "Database created");
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE IF NOT EXISTS instructors_list (name TEXT PRIMARY KEY, mail TEXT, image INTEGER);");
        Log.e("DATABASE OPERATION", "Table created");

        ContentValues args = new ContentValues();
        args.put("name", "Αύγουστος Τσινάκος");
        getWritableDatabase().insert("instructors_list", null, args);
        args.put("mail", "tsinakos@teiemt.gr");
        getWritableDatabase().insert("instructors_list", null, args);
        args.put("image", R.drawable.tsinakos);
        getWritableDatabase().insert("instructors_list", null, args);
        args.put("name", "Xρήστος Λυτρίδης");
        getWritableDatabase().insert("instructors_list", null, args);
        args.put("mail", "chris.litridi@gmail.com");
        getWritableDatabase().insert("instructors_list", null, args);
        args.put("image", R.drawable.litridis);
        getWritableDatabase().insert("instructors_list", null, args);
        args.put("name", "Λευτέρης Μωυσιάδης");
        getWritableDatabase().insert("instructors_list", null, args);
        args.put("mail", "lmous@teiemt.gr");
        getWritableDatabase().insert("instructors_list", null, args);
        args.put("image", R.drawable.moisiadis);
        getWritableDatabase().insert("instructors_list", null, args);
        args.put("name", "Κώστας Ράντος");
        getWritableDatabase().insert("instructors_list", null, args);
        args.put("mail", "radkost@gmail.com");
        getWritableDatabase().insert("instructors_list", null, args);
        args.put("image", R.drawable.rantos);
        getWritableDatabase().insert("instructors_list", null, args);
        args.put("name", "Αλέξανδρος Ραψομανίκης");
        getWritableDatabase().insert("instructors_list", null, args);
        args.put("mail", "alexraps@gmail.com");
        getWritableDatabase().insert("instructors_list", null, args);
        args.put("image", R.drawable.rapsomanikis);
        getWritableDatabase().insert("instructors_list", null, args);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int
            newVersion) {
    }

}

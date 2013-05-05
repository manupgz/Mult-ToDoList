package com.manupgz.todo_lists_helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created with IntelliJ IDEA.
 * User: manuel
 * Date: 5/5/13
 * Time: 6:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME           = "todo_db";
    private static final String DATABASE_TABLE_ITEMS    = "todo_items";
    private static final String DATABASE_TABLE_SECTIONS = "todo_sections";
    private static final int DATABASE_VERSION = 1;

    private static final String KEY_ITEMS_ID            = "_id";
    private static final String KEY_SECTION_ID_COLUMN   = "_section_id";
    private static final String KEY_PRIORITY_COLUMN     = "priority";
    private static final String KEY_POSITION_COLUMN     = "position";
    private static final String KEY_STATUS_COLUMN       = "status";
    private static final String KEY_TITLE_COLUMN        = "title";
    private static final String KEY_DESCRIPTION_COLUMN  = "description";

    private static final String KEY_SECTIONS_ID         = "_id";
    private static final String KEY_NAME_COLUMN         = "name";
    private static final String KEY_COLOR_COLUMN        = "color";


    private static final String TABLE_ITEMS_CREATE = "create table " +
            DATABASE_TABLE_ITEMS + " ("
                + KEY_ITEMS_ID + " integer primary key autoincrement, "
                + KEY_SECTION_ID_COLUMN  + " integer not null, "
                + KEY_PRIORITY_COLUMN    + " integer not null, "
                + KEY_POSITION_COLUMN    + " integer not null, "
                + KEY_STATUS_COLUMN      + " integer not null, "
                + KEY_TITLE_COLUMN       + " text not null, "
                + KEY_DESCRIPTION_COLUMN + " text not null);";

    private static final String TABLE_SECTIONS_CREATE = "create table " +
            DATABASE_TABLE_SECTIONS + " ("
                + KEY_SECTIONS_ID   + " integer primary key autoincrement, "
                + KEY_NAME_COLUMN   + " text not null, "
                + KEY_COLOR_COLUMN  + " text not null);";

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    /**
     * This function is called when no database exists in disk and the helper
     * class needs to create a new one.
     * @param sqLiteDatabase
     */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    /**
     * Called when there is a database version mismatch meaning that
     * the version of the database on disk needs to be upgraded to
     * the current version.
     * @param sqLiteDatabase
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

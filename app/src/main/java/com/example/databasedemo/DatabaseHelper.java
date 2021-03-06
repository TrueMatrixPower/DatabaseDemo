package com.example.databasedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String TAG = "DatabaseHelper";

    /**
     * @ context 上下文
     * @ name  数据库名称
     * @ factory  游标工厂
     * @ version   版本号
     */
    public DatabaseHelper(@Nullable Context context) {
        super(context, Constants.DATABASE_NAME, null, Constants.VERSION_CODE);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //创建时的回调
        Log.d(TAG, "创建数据库...");
        //创建字段
        //sql create table table_name(_id integer, name varchar, age integer, salary integer);
        String sql = "create table " + Constants.TABLE_NAME + "(_id integer, name varchar, age integer, salary integer)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //升级数据库时的回调
        Log.d(TAG, "升级数据库...");

        //sql: alter table table_name add phone integer;
//        String sql = "alter table " + Constants.TABLE_NAME + " add phone integer "; //注意table后面要加个空格。
//        db.execSQL(sql);

        String sql;
        switch(oldVersion){
            case 1:
                sql = "alter table "+Constants.TABLE_NAME+" add phone integer";
                sql = "alter table "+Constants.TABLE_NAME+" add address varchar";
                db.execSQL(sql);
                break;
            case 2:
                sql = "alter table "+Constants.TABLE_NAME+" add address varchar";
                db.execSQL(sql);
                break;
            case 3:

                break;
        }
    }
}

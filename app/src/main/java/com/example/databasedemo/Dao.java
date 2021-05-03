package com.example.databasedemo;

import android.content.Context;

/**
 * @项目名称：DatabaseDemo
 * @包名：com.example.databasedemo
 * @作者：LiYanxinwen
 * @类名：Dao
 * @创建时间：4/14/2021 6:01 PM
 * @描述：这个类用于数据库的增删改查
 */
public class Dao {

    private final DatabaseHelper mHelper;

    public Dao(Context context){
        //创建数据库
        mHelper = new DatabaseHelper(context);
    }

    public void insert(){

    }

    public void delete(){

    }

    public void update(){

    }

    public void query(){

    }
}

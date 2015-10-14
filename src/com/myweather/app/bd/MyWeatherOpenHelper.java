package com.myweather.app.bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MyWeatherOpenHelper extends SQLiteOpenHelper{
	
	//建立Probince表
	public static final String CREATE_PROVINCE="create table Province ("
	+"id integer primary key autoincrement,"
	+"province_name text,"
	+"province_code text";
	
	
	//建立City表
	public static final String CREATE_CITY="create table City ("
			+"id integer primary key autoincrement,"
			+"City_name text,"
			+"City_code text";
	
	
	//建立County表
	public static final String CREATE_COUNTY="create table County ("
			+"id integer primary key autoincrement,"
			+"County_name text,"
			+"County_code text";

	public MyWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		//创建Province表
		db.execSQL(CREATE_PROVINCE);
		//创建City表
		db.execSQL(CREATE_CITY);
		//创建County表
		db.execSQL(CREATE_COUNTY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}

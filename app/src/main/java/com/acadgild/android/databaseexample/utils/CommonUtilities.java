package com.acadgild.android.databaseexample.utils;

import android.content.Context;

import com.acadgild.android.databaseexample.database.DBHelper;


/**
 * Created by Preetika on 6/23/2016.
 */
public class CommonUtilities {

    /**
     * Check if singleton object of DB is null and not open; in the case
     * reinitialize and open DB.
     *
     * @param mContext
     */
    public static DBHelper getDBObject(Context mContext) {
        DBHelper dbhelper = DBHelper.getInstance(mContext);
        return dbhelper;
    }
}

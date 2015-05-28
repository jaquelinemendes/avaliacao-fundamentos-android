package com.example.administrador.myapplication.models.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.administrador.myapplication.util.AppUtil;



public class UserRepository {


    private static class Singleton {
        public static final UserRepository INSTANCE = new UserRepository();
    }

    private UserRepository() {
        super();
    }

    public static UserRepository getInstance() {
        return Singleton.INSTANCE;
    }

    public boolean verifyPass(String user, String pass) {
        boolean userValid;

        DatabaseHelper helper = new DatabaseHelper(AppUtil.CONTEXT);
        SQLiteDatabase db = helper.getReadableDatabase();
        String where = UserContract.USER + " = ? AND " + UserContract.PASSWORD + " = ?";
        String[] args = {user, pass};
        Cursor cursor = db.query(UserContract.TABLE, UserContract.COLUNS, where, args, null, null, UserContract.USER);
        userValid = cursor.moveToFirst();
        db.close();
        helper.close();
        return userValid;
    }
}

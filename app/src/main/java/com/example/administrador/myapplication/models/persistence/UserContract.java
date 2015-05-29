package com.example.administrador.myapplication.models.persistence;

/**
 * Created by Administrador on 28/05/2015.
 */
public class UserContract {

    public static final String TABLE = "user_client";
    public static final String ID = "id";
    public static final String USER = "user";
    public static final String PASSWORD = "password";


    public static final String[] COLUNS = {ID, USER, PASSWORD};

    public static String createTable() {
        final StringBuilder sql = new StringBuilder();
        sql.append(" CREATE TABLE ");
        sql.append(TABLE);
        sql.append(" ( ");
        sql.append(ID + " INTEGER PRIMARY KEY, ");
        sql.append(USER + " TEXT, ");
        sql.append(PASSWORD + " TEXT");
        sql.append(" ); ");
        return sql.toString();
    }

    public static String insertUser() {
        final StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ");
        sql.append(TABLE);
        sql.append(" ( ");
        sql.append(USER);
        sql.append(",");
        sql.append(PASSWORD);
        sql.append(") ");
        sql.append("VALUES ");
        sql.append("(");
        sql.append("'Jaqueline Mendes',");
        sql.append("'cast123'");
        sql.append(")");


        return sql.toString();
    }


}

package com.mac.listviewforesteban;


public class DB {
    private static boolean checkValue = false;

    public static boolean getFromDB() {
        return checkValue;
    }

    public static void saveToDB(boolean checkValue) {
        DB.checkValue = checkValue;
    }
}

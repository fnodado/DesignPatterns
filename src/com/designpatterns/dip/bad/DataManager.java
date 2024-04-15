package com.designpatterns.dip.bad;

import com.designpatterns.dip.bad.DatabaseHandler;

public class DataManager{
    private final DatabaseHandler databaseHandler;

    public DataManager () {
        this.databaseHandler = new DatabaseHandler();
    }

    public void processData(String data) {
        // Process data and save to database
        databaseHandler.saveData(data);
    }
}

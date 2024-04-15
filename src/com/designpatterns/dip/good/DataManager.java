package com.designpatterns.dip.good;

public class DataManager {
    private final DataStorage dataStorage;

    public DataManager(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void processData(String data) {
        // Process data and save using injected data storage
        dataStorage.saveData(data);
    }
}

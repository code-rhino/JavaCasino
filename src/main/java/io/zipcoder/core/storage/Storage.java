package io.zipcoder.core.storage;


public interface Storage {

    String readData();
    void saveData(String data);
}

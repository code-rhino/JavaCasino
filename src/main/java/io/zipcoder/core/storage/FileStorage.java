package io.zipcoder.core.storage;


import org.apache.commons.io.IOUtils;
import java.io.IOException;

public class FileStorage implements Storage {

    private final String filePath;
    private ClassLoader classLoader;

    public FileStorage(String filePath){
        classLoader = getClass().getClassLoader();
        this.filePath = filePath;
    }

    public String readData() {
        String result = "";
        try {
            result = IOUtils.toString(classLoader.getResourceAsStream(filePath));
        }catch (IOException exception){

        }
        return result;
    }

    public void saveData(String data) {

    }
}

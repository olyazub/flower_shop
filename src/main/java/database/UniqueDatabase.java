package database;

import flower.Order;
import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UniqueDatabase {
    private static UniqueDatabase ourInstance ;
    private static BufferedWriter file;
    private static String filename;
    @SneakyThrows
    public static UniqueDatabase getInstance() {
        if (ourInstance == null) {
            ourInstance = new UniqueDatabase();
        }
        return ourInstance;
    }

    private UniqueDatabase() throws IOException {
        filename = "database.txt";
    }

    @SneakyThrows
    public void add(Order order){
        if (file == null) {
            file  = new BufferedWriter(new FileWriter(filename,  true));
        }
        file.append(order.toString() +"\n");

    }
    @SneakyThrows
    public void commit() {
        file.close();
        file = null;
    }
}

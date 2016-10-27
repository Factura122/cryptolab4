package ru.omstu.lab4.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by USER on 27.10.2016.
 * Writing of file
 */
public final class Writer implements IWriter {
    /**
     * File initializer.
     */
    private File dataFile;
    /**
     * Stream for write file.
     */
    private BufferedWriter fileWrite;

    /**
     * Constructor of class.
     * @param path of String type
     */
    public Writer(final String path) {
        try {
            dataFile = new File(path);
            fileWrite = new BufferedWriter(new FileWriter(dataFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Writing of the file.
     * @param symbol of char type
     */
    @Override
    public void write(final char symbol) {
        try {
            fileWrite.write(symbol);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Closing file.
     */
    @Override
    public void close() {
        try {
            fileWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

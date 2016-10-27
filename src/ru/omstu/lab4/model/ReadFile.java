package ru.omstu.lab4.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by USER on 27.10.2016.
 * Read file
 */
public final class ReadFile implements IReader {

    /**
     * Stream for read file.
     */
    private InputStream readDataFile;
    /**
     * File initializer.
     */
    private File dataFile;
    /**
     * Size of file.
     */
    private long size = 0;

    /**
     * Constructor class.
     * @param path of String type
     */
    public ReadFile(final String path) {
        try {
            dataFile = new File(path);
            readDataFile = new FileInputStream(dataFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

     /**
     * Reading of the file.
     * @return symbol of char
     */
    @Override
    public char read() {
        int symbol = 0;
        try {
            symbol = readDataFile.read();
            size++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (char) symbol;
    }

    /**
     * End of file.
     * @return size file
     */
    @Override
    public boolean endOfFile() {
        return size == dataFile.length();
    }

    /**
     * Closing file.
     */
    @Override
    public void close() {
        try {
            readDataFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

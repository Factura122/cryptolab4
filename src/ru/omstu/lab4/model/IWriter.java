package ru.omstu.lab4.model;

/**
 * Created by USER on 27.10.2016.
 * Write to file
 */
public interface IWriter {
    /**
     * Writing of the file.
     * @param symbol of char type
     */
    void write(char symbol);

    /**
     * closing stream.
     */
    void close();
}

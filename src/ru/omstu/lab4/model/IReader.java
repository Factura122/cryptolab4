package ru.omstu.lab4.model;

/**
 * Created by USER on 27.10.2016.
 * Read data from file
 */
public interface IReader {

    /**
     * Read of file.
     * @return of symbol
     */
    char read();

    /**
     * End of file.
     * @return true or false
     */
    boolean endOfFile();

    /**
     * closing stream.
     */
    void close();
}

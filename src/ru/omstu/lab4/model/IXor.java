package ru.omstu.lab4.model;

/**
 * Created by USER on 27.10.2016.
 * Contained methods for encrypting.
 */
public interface IXor {
    /**
     * Input arguments.
     * @param symbol of char type
     * @param key of int type
     */
    void addData(char symbol, int key);

    /**
     * Encrypt data.
     * @return encryption result of char type
     */
    char encryptData();

    /**
     * Decrypt data.
     * @return decryption result of String type
     */
    String decryptData();
}

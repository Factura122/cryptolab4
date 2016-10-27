package ru.omstu.lab4.labinit;

import ru.omstu.lab4.encrypting.EncryptData;
import ru.omstu.lab4.model.ReadFile;
import ru.omstu.lab4.model.Writer;
import ru.omstu.lab4.model.Xor;

/**
 * Created by USER on 27.10.2016.
 * Application initializer
 */
final class LabInit {
    /**
     * Empty constructor
     */
    private LabInit() { }

    /**
     * Entry point of program.
     * @param args of String[] type
     */
    public static void main(final String[] args) {
        final int key = 4;
        ReadFile readFile = new ReadFile("src/input.txt");
        Writer writeFile = new Writer("src/encrypt.txt");
        Xor encryptingData = new Xor();
        EncryptData encryptData = new EncryptData();
        encryptData.encrypt(readFile, writeFile, encryptingData, key);
        readFile.close();
        writeFile.close();
    }
}

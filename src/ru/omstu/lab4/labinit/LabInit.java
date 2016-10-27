package ru.omstu.lab4.labinit;

import ru.omstu.lab4.encrypting.EncryptData;
import ru.omstu.lab4.model.ReadFile;
import ru.omstu.lab4.model.Writer;
import ru.omstu.lab4.model.Xor;

import java.util.Scanner;

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
        System.out.println("Enter key:");
        Scanner in = new Scanner(System.in);
        final int key = in.nextInt();
        ReadFile readFile = new ReadFile("src/input.txt");
        Writer writeFile = new Writer("src/encrypt.txt");
        Xor encryptingData = new Xor();
        EncryptData encryptData = new EncryptData();
        encryptData.encrypt(readFile, writeFile, encryptingData, key);
        readFile.close();
        writeFile.close();
        System.out.println("Program completed");
    }
}

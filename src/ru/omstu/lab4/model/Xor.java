package ru.omstu.lab4.model;

/**
 * Created by USER on 27.10.2016.
 * Encrypt/decrypt data
 */
public final class Xor implements IXor {
    /**
     * Key value.
     */
    private int currentKey;
    /**
     * char value.
     */
    private char currentSymbol;

    /**
     * Input arguments.
     * @param symbol of char type
     * @param key of int type
     */
    @Override
    public void addData(final char symbol, final int key) {
        this.currentSymbol = symbol;
        this.currentKey = key;
    }

    /**
     * Encrypt data.
     * @return encryption result of char type
     */
    @Override
    public char encryptData() {
        char result;
        final int a = 3;
        final int b = 2;
        final int m = 40692;
        result = (char) (currentSymbol ^ currentKey);
        currentKey = (currentKey * a + b) % m;
        return result;
    }
}

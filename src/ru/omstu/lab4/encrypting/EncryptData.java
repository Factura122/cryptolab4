package ru.omstu.lab4.encrypting;

import ru.omstu.lab4.model.IReader;
import ru.omstu.lab4.model.IWriter;
import ru.omstu.lab4.model.IXor;

/**
 * Created by USER on 27.10.2016.
 * Encrypting data
 */
public final class EncryptData implements IEncryptData {
    /**
     * Encrypting and write file result.
     * @param read of IReader interface
     * @param write of IWriter interface
     * @param encrypt of IXor interface
     * @param key of int type
     */
    @Override
    public void encrypt(final IReader read, final IWriter write, final IXor encrypt, final int key) {
        char symbol;
        char result;
        while (!read.endOfFile()) {
            symbol = read.read();
            encrypt.addData(symbol, key);
            result = encrypt.encryptData();
            write.write(result);
        }
    }
}

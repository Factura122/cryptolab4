package ru.omstu.lab4.encrypting;

import ru.omstu.lab4.model.IReader;
import ru.omstu.lab4.model.IWriter;
import ru.omstu.lab4.model.IXor;

/**
 * Created by USER on 27.10.2016.
 * Encrypt data.
 */
interface IEncryptData {
    /**
     * Encrypting and write file result.
     * @param read of IReader interface
     * @param write of IWriter interface
     * @param encrypt of IXor interface
     * @param key of int type
     */
    void encrypt(IReader read, IWriter write, IXor encrypt, int key);
}

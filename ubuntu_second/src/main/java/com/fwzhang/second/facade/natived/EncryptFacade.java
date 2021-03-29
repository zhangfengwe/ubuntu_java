package com.fwzhang.second.facade.natived;

import com.fwzhang.util.CipherMachine;
import com.fwzhang.util.FileReader;
import com.fwzhang.util.FileWriter;

import java.io.File;

public class EncryptFacade {

    public void encryptFile(File file, String aimFilePath) {
        String content = FileReader.read(file);
        String encrypt = CipherMachine.encrypt(content);
        FileWriter.write(encrypt, aimFilePath);
    }

}

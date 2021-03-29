package com.fwzhang.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {

    public static String read(File file) {
        StringBuilder result = new StringBuilder();
        try (FileInputStream fileInputStream = new FileInputStream(file)){
            int len = 0;
            byte[] buff = new byte[1024];
            while ((len = fileInputStream.read(buff)) != -1) {
                result.append(new String(buff, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}

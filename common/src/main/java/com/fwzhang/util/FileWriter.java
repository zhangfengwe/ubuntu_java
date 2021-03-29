package com.fwzhang.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {

    public static void write(String content, String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new IllegalArgumentException("参数不正确");
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)){
            fileOutputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

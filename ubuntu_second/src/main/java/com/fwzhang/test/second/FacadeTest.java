package com.fwzhang.test.second;

import com.fwzhang.second.facade.natived.EncryptFacade;

import java.io.File;

public class FacadeTest {

    public static void main(String[] args) {
        EncryptFacade facade = new EncryptFacade();
        facade.encryptFile(new File(""), "");
    }
}

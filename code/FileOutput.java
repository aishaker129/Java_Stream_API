package com.mycompany.file;
import java.io.FileInputStream;

public class FileOutput {

    public static void main(String[] args)throws Exception {
        try (FileInputStream fis = new FileInputStream("/home/rifatul/Desktop/code/sh.txt")){
         byte b[] = new byte[fis.available()];
         fis.read(b);
         String str = new String(b);
         System.out.println(str);
        }
    }
}


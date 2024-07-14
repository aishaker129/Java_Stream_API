package com.mycompany.file;
import java.io.FileOutputStream;

public class File {

    public static void main(String[] args)throws Exception {
        try (FileOutputStream fos = new FileOutputStream("/home/rifatul/Desktop/code/sh.txt")){
        String s = "My name is Shaker";
        byte b[] = s.getBytes();
        fos.write(b);
        }
    }
}



package com.mycompany.file;
import java.io.FileReader;
public class FileReader {
    public static void main(String[] args) throws Exception 
    {
        try (FileReader fr = new FileReader("/home/rifatul/Desktop/code/sh.txt"))
        {
            int x;
            while((x = fr.read())!=-1){
                System.out.print((char)x);
            }
        
        }
    }
}


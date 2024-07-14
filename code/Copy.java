package com.mycompany.file;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class Copy {

    public static void main(String[] args)throws Exception {
       try{
            FileInputStream fis = new FileInputStream("/home/rifatul/Desktop/code/source1.txt");
            FileOutputStream fos = new FileOutputStream("/home/rifatul/Desktop/code/source2.txt");
            int x;
            while((x = fis.read()) !=-1){
                if(x>=65 && x<=90){
                    fos.write(x+32);
                }
                else{
                    fos.write(x);
                }
            }
        
            fis.close();
            fos.close();
       }catch(FileNotFoundException e){
           System.out.println(e);
       }
    }
}

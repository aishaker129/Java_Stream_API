
import java.io.*;
public class ByteArray {

    public static void main(String[] args) throws Exception {
        
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');
        bos.write('f');
//        byte b[] = bos.toByteArray();
//        for(byte u:b){
//            System.out.print((char)u);
//        }

        bos.writeTo(new FileOutputStream("/home/rifatul/Desktop/code/sh.txt"));
        bos.close();
    }
}


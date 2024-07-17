
import java.io.*;
public class ByteDemo {

    public static void main(String[] args) throws Exception {
        byte b[] = {'a','b','c','d','e','f','g','h','i'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
//        int x;
//        while((x = bis.read())!=-1){
//            System.out.print((char)x);
//        }
//        bis.close();
          
        String s = new String(bis.readAllBytes());
        System.out.println(s);
    }
}


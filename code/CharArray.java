import java.io.*;
public class CharArray {

    public static void main(String[] args) throws Exception {
        
       char b[] = {'a','b','c','d','e','f','g','h','i'};
        CharArrayReader cr = new CharArrayReader(b);
        
        int x ;
        while((x = cr.read())!=-1){
            System.out.print((char)x);
        }
    }
}


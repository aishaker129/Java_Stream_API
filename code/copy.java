import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class Mavenproject2 {

    public static void main(String[] args)throws Exception {
       try{
            FileInputStream fis = new FileInputStream("C:/Users/Rifat/Desktop/code/source1.txt");
            FileOutputStream fos = new FileOutputStream("C:/Users/Rifat/Desktop/code/source2.txt");
        
            String s = "JAVA PROGRAM THIS IS MY FIRST PROGRAM\n SO WE THIS program sincerli";
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
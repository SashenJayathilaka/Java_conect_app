import java.io.File;
import java.util.Scanner;
public class Reading_Files {
 
    public static void main(String[] args){
        
        try {
            File f =new File("D:\\Programming\\Java porgramming\\Creating Files\\sashen.txt");
            Scanner scn = new Scanner(f);
            while(scn.hasNextLine()){
                String a = scn.nextLine();
                System.out.println(a);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        
    }
       
}
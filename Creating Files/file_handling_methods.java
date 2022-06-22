import java.io.File;
import java.util.Scanner;
public class file_handling_methods{
	
	public static void main(String[] args){
        
        File f = new File("D:\\Programming\\Java porgramming\\Creating Files\\sashen.txt");
        
        try {
            if(f.exists()){
                
                System.out.println(f.getName());
                System.out.println(f.canRead());
                System.out.println(f.canWrite());
                System.out.println(f.getAbsolutePath());
                System.out.println(f.length());
                
            }else{
                System.out.println("Fail to delet file");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
       
}
import java.io.File;
public class File_Class {
 
    public static void main(String[] args){
        
        File f = new File("D:\\Programming\\Java porgramming\\Hello.java");
        if(f.exists())
            System.out.println(f.getName() + "\t" + "File exists");
        else
            System.out.println("File does not exists");
    }
       
}
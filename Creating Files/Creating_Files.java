import java.io.File;
public class Creating_Files {
 
    public static void main(String[] args){
        
        File f = new File("D:\\Programming\\Java porgramming\\Creating Files\\sashen");
        
        try {
            
            if(f.mkdir()){                     //f.createNewFile = creat a new file
                System.out.println("Folder is created!" + "\t" + f.getName());
            }else{
                System.out.println(" Sorry! Folder exists");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
       
}
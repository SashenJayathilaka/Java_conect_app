import java.io.FileWriter;
public class Writing_Files {
 
    public static void main(String[] args){
        
        try {
            FileWriter fw = new FileWriter("D:\\Programming\\Java porgramming\\Creating Files\\sashen.text");
            fw.write("This is best java course ever! \n");
            fw.write("My name is Sashen hasindu perera");
            fw.close();
            System.out.println("Succufully!");
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
       
}

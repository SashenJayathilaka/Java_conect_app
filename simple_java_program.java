public class simple_java_program {
 
    public static void main(String[] args){
        
        try {
            Runtime.getRuntime().exec("cmd /c start https://www.youtube.com/user/TomorrowlandChannel");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
       
}
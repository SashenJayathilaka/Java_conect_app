public class use_methods_with_parameters {
    
    public static void main (String[] args){
        
        apple appleObj = new apple();
        appleObj.SendMessage("Sashen");
        appleObj.SendMessage("Hasindu");
    }
    
    public void SendMessage(String name){
        
        System.out.println("Hello " + name);
        
    }
            
    
}
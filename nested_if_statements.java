public class nested_if_statements {
    
    public static void main(String[] args){
        
        int age = 17;
        
        if (age > 18)
            System.out.println("You can log 18+ web");
        
        else
            System.out.println("You can not log 18+ web");
            if (age > 14)
                System.out.println("You can log 14+ web");
            
            else
                System.out.println("Sorry!");
   
        
    }
    
}

public class logical_operators {
    
    public static void main(String[] args) {
        
       int maths = 55;
       int sin = 75;
       
	   /*if(maths > 50 && sin > 60)      AND operators */
       if(maths > 50 || sin > 60)       /* OR operators */
       {
           System.out.println("Pass");
       }else
       {
           System.out.println("Fall");
       }
           
        
    }
    
}

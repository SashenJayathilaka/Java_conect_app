enum day{
    MONDAY, TUESDAY, WEDNESDAY,THURSDAY,FRIDAY
}

public class Enumeration_1 {
 
    public static void main(String[] args){
        
       day dd = day.TUESDAY;
       
       switch(dd){
           case MONDAY:
               System.out.println("Today is MONDAY");
               break;
               
           case TUESDAY:
               System.out.println("Today is TUESDAY");
               break;
            
           case WEDNESDAY:
               System.out.println("Today is WEDNESDAY");
               break;
               
           case THURSDAY:
               System.out.println("Today is THURSDAY");
               break;
               
           case FRIDAY:
               System.out.println("Today is FRIDAY");
               break;   
       }
    
    }
       
}
	
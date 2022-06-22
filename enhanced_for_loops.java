public class enhanced_for_loops{
	
	public static void main(String[] args){
        
        double num[] = {2.3 , 4.25 , 8.2 , 3.7 , 7.9};
        double total = 0;
        
        for(double x: num){
            total += x;   //total = total + x
            
            
        }
        System.out.println("Total is = " + total);
        
    }
            
    
}
public class summing_elements_of_arrays{
	
	public static void main(String[] args){
        
        int num[] = {12,14,17,12,100};
        int sum = 0;
        
        for(int count = 0 ; count < num.length ; count++){
            sum +=num[count];   //sum = sum + num[count];
        }
        
        System.out.println("Sum is = " + sum);
    }
            
    
}
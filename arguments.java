public class arguments{
	
	public static void main(String[] args){
        
        int num[] = {1,2,4,5};
        
        System.out.println(secondMeth(num));
    }
    
    public static int secondMeth(int x[]){
        int total = 0;
        
        for(int y: x)
            total+=y;
        
        return total;
        
       
    }
       
}

public class arrays_in_method{
	
	int num[] = {2,3,4,5,6};
        change(num);
        
        for(int y: num)
            System.out.println(y);
    }
    public static void change(int x[]){
        
        for (int i = 0 ; i < x.length ; i++)
            x[i] +=10;
        
    }
    
            
    
}

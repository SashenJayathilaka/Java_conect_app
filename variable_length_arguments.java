public class variable_length_arguments{
	
	public static void main(String[] args){
        
        secondMeth(4,2,8,7,12,45);
        
    }
    public static void secondMeth(int...number){
        int total = 0;
        for(int y:number)
            total+=y;
        
        System.out.println(total/number.length);
    }
       
}
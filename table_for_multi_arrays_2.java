public class table_for_multi_arrays_2{
	
	public static void main(String[] args){
        
        int num[][] = {{1,2,3,4},{12,45,78,63},{7,8,9,10}};
        
        int sashen[][] = {{5,7,2,4},{25},{45,89,16}};
        
        int third[][] = {{14,85,45,2},{89,63,74,52},{63,47,51,37}};
        
        System.out.println("\nFirst Array");
        Display(num);
        System.out.println("\nSecond Array");
        Display(sashen);
        System.out.println("\nThird Array");
        Display(third);
    }
    public static void Display(int x[][]){
        
        for(int row = 0 ; row < x.length ; row++){
            for(int coloum = 0 ; coloum < x[row].length ; coloum++){
                System.out.print(x[row][coloum] + "\t");
            }
            System.out.println("");
        }
    }
       
}
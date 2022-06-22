public class table_for_multi_arrays_1{
	
	public static void main(String[] args){
        
//        int num[][] = {{1,2,3,4},{12,45,78,63},{7,8,9,10}};
        
        int sashen[][] = {{5,7,2,4},{25},{45,89,16}};
        
        for(int row = 0 ; row < sashen.length ; row++) {
            
            for(int coloum = 0 ; coloum < sashen[row].length ; coloum++ ){
                
                System.out.print(sashen[row][coloum] + "\t");
                
            }
            System.out.println("");
        }
    }
       
}
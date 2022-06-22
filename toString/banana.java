public class banana {
    
    private int year;
    private int month;
    private int day;
    
    public banana(int y, int m, int d){
        year = y;
        month = m;
        day = d;
        
        System.out.printf("My birthday is %s\n", this);
    }
    
    public String toString(){
        return String.format("%d/%d/%d",year,month,day); //2000/4/25
    }
            
    
}
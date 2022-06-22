public class orange {
    
    public int hour;
    private int minute;
    private int second;
    
    public orange(int h,int m, int s){
        hour = h;
        minute = m;
        second = s;
        
    }
    
    public void show(){
        System.out.printf("%2d:%2d:%2d", hour,minute,second);
    }
}
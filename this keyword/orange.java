public class orange {
    
    private int hour;
    private int minute;
    private int second;
    
    public orange(int hour,int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        
    }
    
    public void show(){
        System.out.printf("%2d:%2d:%2d\n", hour,minute,second);
    }
}

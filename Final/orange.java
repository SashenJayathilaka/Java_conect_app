public class orange {
    
    private int ans;         //15
    private final int NUMBER;
    //private static int num;
    
    orange(int x){
        NUMBER = x;
    }
    
    public void add(){
        ans = NUMBER + 10;
    }
    
    public String getString(){
        return String.format("Answer is = %s",ans);
    }
    
}
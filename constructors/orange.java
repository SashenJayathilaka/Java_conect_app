public class orange {
    
    private String friendName;
    
    public orange(String name){
        friendName = name;
    }
            
//    public void getName(String name){
//        friendName = name;
//    }
    public String setName(){
        return friendName;
    }
    public void say(){
        System.out.println("Your friend name is " + setName());
    }
    
}
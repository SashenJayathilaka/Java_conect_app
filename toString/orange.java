public class orange {
    
    private String name;
    private banana birthday;
    
    public orange(String theName,banana theDate){
        name = theName;
        birthday = theDate;
    }
    
    public String toString(){
        return String.format("My name is %s ,and my birthday is %s",name,birthday);
    }
        
}
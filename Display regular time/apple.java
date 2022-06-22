public class apple {
    
    public static void main(String[] args){
        
        orange orObj = new orange();
        System.out.println(orObj.standTime());
        System.out.println(orObj.RegularTime());
        
        orObj.setTime(14, 25, 36);
        System.out.println(orObj.standTime());
        System.out.println(orObj.RegularTime());
    }
       
}
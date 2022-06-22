import java.util.EnumSet;
public class apple {
 
    public static void main(String[] args){
        
        for(orange org : EnumSet.range(orange.HASINDU,orange.AJITH)){   
            System.out.printf("%s\t%s\t%d\n",org,org.getDese(),org.getAge());
        }
    
    }
       
}
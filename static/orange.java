public class orange {
    
    private String fname;
    private String lname;
    
    private static int members = 0;
    
    orange(String fn,String ln){
        fname = fn;
        lname = ln;
        members++;
        System.out.printf("%s %s member in the Library : %d \n",fname,lname,members);
    }
}
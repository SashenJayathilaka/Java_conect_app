import java.util.Scanner;
public class else_if_statements {
    
    public static void main(String[] args){
        
		Scanner MyScanner  = new Scanner(System.in);
        System.out.print("Enter your marks");
		int marks = MyScanner.nextInt();
        
        if(marks >= 75)
            System.out.println("Your gread is A");
        
        else if (marks >= 65)
            System.out.println("Your gread is B");
        
        else if (marks >= 55)
            System.out.println("Your gread is C");
        
        else
            System.out.println("You");
   
        
    }
    
}

import java.util.*;
public class Exception_Handling {
 
    public static void main(String[] args){
        int x = 1;
        do{
            try{
                Scanner in = new Scanner(System.in);
                System.out.print("Enter first number = ");
                int num1 = in.nextInt();

                System.out.print("Enter Second number = ");
                int num2 = in.nextInt();
                int sum = num1 / num2;

                System.out.println("Answer is = "+ sum);
                x = 2;
            }catch(Exception e){
                System.out.println("You can't do that");
            }
        }while(x==1);
    }
       
}
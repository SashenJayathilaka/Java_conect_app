import java.util.Scanner;
public class Nomal {
    
    public static void main(String[] args){
        int x = 1;
        do{
            Scanner MyScanner = new Scanner(System.in);

            System.out.print("Enter your First subject marks = ");
            int first = MyScanner.nextInt();

            System.out.print("Enter youe Second subject marks = ");
            int second = MyScanner.nextInt();

            System.out.print("Enter youe Third subject marks = ");
            int third = MyScanner.nextInt();

            int avg = first + second + third;
            int avg_marks = avg/3;
            System.out.println("\nYour Average mark is = " + avg_marks);

            if(avg_marks >= 75)
                System.out.println("Grat! You have \" A+ \" ");

            else if(avg_marks >= 85)
                System.out.println("Grat! You have \" A \" ");

            else if(avg_marks >= 75)
                System.out.println("Grat! You have \" A- \" ");

            else if(avg_marks >= 70)
                System.out.println("Congralutation! You have \" B+ \" ");

            else if(avg_marks >= 65)
                System.out.println("Congralutation! You have \" B \" ");

            else if(avg_marks >= 60)
                System.out.println("Congralutation! You have \" B- \" ");

            else if(avg_marks >= 55)
                System.out.println("Congralutation! You have \" C+ \" ");

            else if(avg_marks >= 50)
                System.out.println("Congralutation! You have \" C \" ");

            else if(avg_marks >= 45)
                System.out.println("Congralutation! You have \" C \" ");

            else if(avg_marks >= 40)
                System.out.println("Try again! You have \" D \" ");

            else
                System.out.println("Sorry! You have \" F \" ");
            
            System.out.println("---------------------------------------------" + "\n");
        }while(x==1);   
        
    }
    
}
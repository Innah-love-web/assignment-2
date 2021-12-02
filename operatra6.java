import java.util.Scanner;
public class operatr {
        public static void main(String[] args) {
            int a,b,c;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter value a");
            a=s.nextInt();
            System.out.println("Enter value b");
            b=s.nextInt();
            System.out.println("The result of adding is"+" "+(c=a+b));
            System.out.println("The result of subtracting is"+" "+(c=a-b));
            System.out.println("The result of multiplying is"+" "+(c=a*b));
            System.out.println("The result of dividing is"+" "+(c=a/b));
    
        }
    }  

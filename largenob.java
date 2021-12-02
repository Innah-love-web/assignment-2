import java.util.Scanner;
public class largenob {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first no");
		a=s.nextInt();
		System.out.println("Enter the second no");
		b=s.nextInt();
		System.out.println("Enter the third no");
		c=s.nextInt();
		if ((a>b)&&(a>c)){
			System.out.println("The large no is "+" "+a);
			}
		else if((b>c)&&(b>a)){
			System.out.println("The large no is"+" "+b);

		}
		
		else{
			System.out.println("The large no is"+" "+c);
		}
		
	}
}


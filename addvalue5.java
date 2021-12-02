import java.util.Scanner;
public class addvalue5 {
	public static void main(String[] args) {
		float a,b,z;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value a:");
		a=s.nextFloat();
		System.out.println("The value of a before adding is"+" "+a);
		System.out.println("Enter value b:");
		b=s.nextFloat();
		z=a+b;
		System.out.println("The value of a after adding is"+" "+z);
	}
}

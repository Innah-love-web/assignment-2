import java.util.Scanner;
public class nameagea4 {
	public static void main(String[] args) {
		String name; int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		name=s.nextLine();
		System.out.println("Enter your age");
		age=s.nextInt();
		System.out.println("Welcome"+" "+name+" "+"your age is"+" "+age);

	}
}

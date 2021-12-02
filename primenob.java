import java.util.Scanner;
public class primenob {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int b=s.nextInt();
		for(int a=2;a<=b;a++){
			int c=0;
			for (int y=a;y>=1;y--){
				c+=1;
				
			}
		if (c%2==1){
			System.out.println("The prime number is"+" "+a);
		}
		}
	}
}

import java.util.Scanner;
public class avearageb11 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=0;
		double ave;
		System.out.println("enter the number");
		x=s.nextInt();
		for(int i=0;i>=x;i++){
			System.out.println("Enter the number"+i);
			x=s.nextInt();
			/*if(i==999){
				break;
			ave=(i/x);*/
			System.out.println("The average of the numbers is"+" "+x);
			//}

		}
	}
}

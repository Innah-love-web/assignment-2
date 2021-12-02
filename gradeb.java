import java.util.Scanner;
public class gradeb {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int quiz;
		int final_score;
		int mid_term;
		System.out.println("Enter quiz score");
		quiz=s.nextInt();
		System.out.println("Enter mid term score");
		mid_term=s.nextInt();
		System.out.println("Enter final score");
		final_score=s.nextInt();
		double ave=(quiz+mid_term+final_score)/3;
		System.out.println("The average is"+" "+ave);
		if (ave>=90){
			System.out.println("Your grade is A");
		}
		else if(ave>=70){
			System.out.println("Your grade is B");
			}
		else if(ave>=50){
			System.out.println("Your grade is C");
			}
		else{
			System.out.println("Your grade is F");
			}

	}
}

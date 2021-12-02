import java.util.Scanner;
public class quizb {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int quiz_score;
            System.out.println("Enter quiz score");
            quiz_score=s.nextInt();
            switch(quiz_score){
                case 5:
                    System.out.println("A");
                    break;
                case 4:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 2:
                    System.out.println("D");
                    break;
                case 1:
                    System.out.println("E");
                    break;
                case 0:
                    System.out.println("F");
                    break;
            
            }
        }
    }   

import java.util.Scanner;

public class VoteElse {

        public static void main(String[] args) {
            int age;
            System.out.println("Enter your age");
            Scanner r=new Scanner(System.in);
            age=r.nextInt();
            if(age>=18)
                System.out.println("Eligible for vote");
            else
                System.out.println("YOU ARE NOT ELIGIBLE FOR VOTE");

            System.out.println("Thank you");

        }
    }



import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program
		System.out.println("pick a number between 1-1000");
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	Random mand1 = new Random();
	int rand_num1= mand1.nextInt(1000) + 0;
	System.out.println(rand_num1);
	
	if(x==rand_num1){
	System.out.println("Your number was the random number") ;
	
	}
	else if(x>rand_num1){
	    System.out.println("your number wasnt the random number, you were very close");
	   
	}
	else if(x<rand_num1){
	    System.out.println("your number wasnt the random number, you were very far ");
	 
	}
		
		



	}
}

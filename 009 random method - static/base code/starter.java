import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random mand1 = new Random();
		int rand_num1 = mand1.nextInt(1000) + 0;
		System.out.println("First Random Number Is " + rand_num1);
		double rand_num2 = mand1.nextDouble();
		System.out.println("Second Random Numder is " + rand_num2);
		
		int rand_numA = mand1.nextInt(10) + 0;
		System.out.println("Third Random Number is " + rand_numA);
		int rand_numB = mand1.nextInt(100) + 1;
		System.out.println("Fourth Random Number is " + rand_numB);
		double rand_numC = mand1.nextDouble() + 2.5;
		System.out.println(" Fifth Random Number is " + rand_numC);
		double rand_numD = mand1.nextInt(575) + 14 + mand1.nextDouble();
		System.out.println("Sixth Random number is " + rand_numD);
	}
}

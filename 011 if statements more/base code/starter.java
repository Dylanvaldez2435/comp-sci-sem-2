import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Please input one numbers ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("please input a second number");
		int y = sc.nextInt();
		
		if(x==y){
			System.out.println("they are the same");
		}	
		 if(x>y){
			System.out.println("they are different");
		}
		else if(x<y){
			System.out.println("they are different");
		}
	
	

		
	}
}

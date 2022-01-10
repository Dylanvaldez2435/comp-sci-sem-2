import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner bob = new Scanner(System.in);
		String name;
		System.out.println("Type name"); 
		name = bob.nextLine(); 
		System.out.println("First name is: " + name);
		Scanner jose = new Scanner(System.in);
		String age;
		System.out.println("Type Age"); 
		age = jose.nextLine(); 
		System.out.println("age: " + age);
		Scanner Mary = new Scanner(System.in);
		String month;
		System.out.println("Type month"); 
		month = Mary.nextLine(); 
		System.out.println("Birth month: " + month);
		Scanner john = new Scanner(System.in);
		String day;
		System.out.println("Type day"); 
		day = john.nextLine(); 
		System.out.println("day: " + day);
		Scanner dylan = new Scanner(System.in);
		String year;
		System.out.println("Type year"); 
		year = dylan.nextLine(); 
		System.out.println("Birth year: " + year);
		Scanner stinypoopy = new Scanner(System.in);
		String buckfifty;
		System.out.println("Type buck fifty"); 
		buckfifty = stinypoopy.nextLine(); 
		System.out.println("buck fifty: " + buckfifty);
		
		 
	}
}

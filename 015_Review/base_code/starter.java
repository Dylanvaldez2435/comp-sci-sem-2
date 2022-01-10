import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("What is your name");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		System.out.println("what is your title? EX: Slayer of dragons");
		String y = sc.nextLine();
		
		
		System.out.println("please select a role: Wizard, Warrior, Rogue ");
		String c = sc.nextLine();
		if(c.equals("Wizard")){
			System.out.println("you're a WiZaRd harry");
		}
		else if(c.equals("Warrior")){
			System.out.println(" Wow youre good at using your hands");
		}
		
		else if(c.equals("Rogue")){
			System.out.println(" Wow a person who loves to live on the dangerous side ");
		} 
		else{
			System.out.println("choose one of the three roles please, retard");
		}
	
		
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		
		//Strength
		System.out.println("How manny points out of 10 would you like to put into Strength?");
		String Strength;
		int s = sc.nextInt();
		
			
		int points = (25-s);
		System.out.println("you have " + points +" points left");
		System.out.println("how many points out of 10 would you like to put into ")
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

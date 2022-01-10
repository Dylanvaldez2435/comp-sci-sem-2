import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("please select a role: Wizard, Warrior, Rogue ");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		if(x.equals("Wizard")){
			System.out.println("you're a WizArd harry");
		}
		else if(x.equals("Warrior")){
			System.out.println(" Wow youre good at using your hands");
		}
		
		else if(x.equals("Rogue")){
			System.out.println(" Wow a man/woman who loves to live in danger ");
		} 
		else{
			System.out.println("choose one of the three roles please, retard");
		}
		
		
		
		
		
		
	
		
	}

}

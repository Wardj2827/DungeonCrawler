import java.util.ArrayList;
import java.util.Scanner;


public class HealthItem extends ItemsSuperclass {
	private static double healing;
	private static double HpUp;

	public static void potion() {
		Scanner Scan = new Scanner(System.in);
		System.out.println("It's a small potion engraved with the word healing, you decide to drink it right there... \n");Scan.nextLine();
		System.out.println("You feel refreshed! [Heal 20% health]");Scan.nextLine();
		healing = (MainClass.maxhealth/5);
		MainClass.currenthealth = MainClass.currenthealth + healing;
		if (MainClass.currenthealth > MainClass.maxhealth) {
			MainClass.currenthealth = MainClass.maxhealth;
		}
		System.out.println("You now have " + MainClass.currenthealth + " health out of " + MainClass.maxhealth + " health");Scan.nextLine();
	}

	public static void Armour() {Scanner Scan = new Scanner(System.in);
	HpUp = 4;
	System.out.println("It's better armour albeit a bit old \n");Scan.nextLine();
	System.out.println("You put it on and feel stronger then ever [Max Health + 4]");Scan.nextLine();
	MainClass.maxhealth = MainClass.maxhealth + HpUp;
	MainClass.currenthealth = MainClass.currenthealth + HpUp;
	System.out.println("You now have " + MainClass.currenthealth + " health out of " + MainClass.maxhealth + " health");Scan.nextLine();
	}
	
	
	public static void potionLv2() {
		Scanner Scan = new Scanner(System.in);
		System.out.println("It's a potion engraved with the word healing, you decide to drink it right there... \n");Scan.nextLine();
		System.out.println("You feel refreshed! [Heal 30% health]");Scan.nextLine();
		healing = (MainClass.maxhealth/3);
		MainClass.currenthealth = MainClass.currenthealth + healing;
		if (MainClass.currenthealth > MainClass.maxhealth) {
			MainClass.currenthealth = MainClass.maxhealth;
		}
		System.out.println("You now have " + MainClass.currenthealth + " health out of " + MainClass.maxhealth + " health");Scan.nextLine();
	}

	public static void ArmourLv2() {Scanner Scan = new Scanner(System.in);
	HpUp = 8;
	System.out.println("It's better armour with only slight rust \n");Scan.nextLine();
	System.out.println("You put it on and feel stronger then ever [Max Health + 8]");Scan.nextLine();
	MainClass.maxhealth = MainClass.maxhealth + HpUp;
	MainClass.currenthealth = MainClass.currenthealth + HpUp;
	System.out.println("You now have " + MainClass.currenthealth + " health out of " + MainClass.maxhealth + " health");Scan.nextLine();
	}
}

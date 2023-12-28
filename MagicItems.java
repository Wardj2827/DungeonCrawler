import java.util.ArrayList;
import java.util.Scanner;


public class MagicItems extends ItemsSuperclass {
	private static double MPtUp;
	private static double MDamageUp;

	public static void Wand() {
		Scanner Scan = new Scanner(System.in);
		MDamageUp = 1.5;
		System.out.println("It's an old worn down wand, but its still better then your current one so you pick it up");Scan.nextLine();
		System.out.println("You feel energy surge through it [Magic Damage + 1.5] ");Scan.nextLine();
		MainClass.Mdamage = MainClass.Mdamage + MDamageUp;
		MainClass.Bite = MainClass.Bite + MDamageUp;
	}

	public static void Crystal() {
		Scanner Scan = new Scanner(System.in);
		MPtUp = 0.5;
		System.out.println("It's small blue crystal, it is less chipped then your current one though so you take it with you ");Scan.nextLine();
		System.out.println("You can feel energy being drawn to it [Mana per turn + 0.5]");Scan.nextLine();
		MainClass.ManaPt = MainClass.ManaPt + MPtUp;
	}
	
	
	public static void WandLv2() {
		Scanner Scan = new Scanner(System.in);
		MDamageUp = 2.5;
		System.out.println("It's a wand, better then your current one by a fair bit so you pick it up");Scan.nextLine();
		System.out.println("You feel the energy surge through it [Magic Damage + 2.5] ");Scan.nextLine();
		MainClass.Mdamage = MainClass.Mdamage + MDamageUp;
		MainClass.Bite = MainClass.Bite + MDamageUp;
	}

	public static void CrystalLv2() {
		Scanner Scan = new Scanner(System.in);
		MPtUp = 1;
		System.out.println("It's blue crystal, fair size and only a few chips so you take it with you ");Scan.nextLine();
		System.out.println("You can feel energy being drawn to it [Mana per turn + 1]");Scan.nextLine();
		MainClass.ManaPt = MainClass.ManaPt + MPtUp;
	}
	
}

import java.util.ArrayList;
import java.util.Scanner;


public class DamageItems extends ItemsSuperclass {
	private static double damageUp;
	private static double dodgeUp;

	public static void Sword() {
		Scanner Scan = new Scanner(System.in);
		damageUp = 1;
		System.out.println("It's a old sword, an upgrade from your current one atleast");Scan.nextLine();
		System.out.println("It feels sharper [Damage +1]");Scan.nextLine();
		MainClass.damage = MainClass.damage + damageUp;

	}

	public static void Boots() {
		Scanner Scan = new Scanner(System.in);
		dodgeUp = 0.05;
		System.out.println("It's some old boots, an upgrade is an upgrade though so you put them on ");Scan.nextLine();
		System.out.println("You feel lighter on your feet [Dodge Chance + 5%]");Scan.nextLine();
		MainClass.BaseDodge = MainClass.BaseDodge + dodgeUp;
	}

	public static void SwordLv2() {
		Scanner Scan = new Scanner(System.in);
		damageUp = 2;
		System.out.println("It's a sword, and definetly an upgrade from your current one ");Scan.nextLine();
		System.out.println("It feels far sharper [Damage +2]");Scan.nextLine();
		MainClass.damage = MainClass.damage + damageUp;

	}

	public static void BootsLv2() {
		Scanner Scan = new Scanner(System.in);
		dodgeUp = 0.1;
		System.out.println("It's some boots and a decent pair at that so you put them on ");Scan.nextLine();
		System.out.println("You feel even lighter on your feet [Dodge Chance + 10%]");Scan.nextLine();
		MainClass.BaseDodge = MainClass.BaseDodge + dodgeUp;
	}
	
}

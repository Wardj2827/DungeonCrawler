import java.util.ArrayList;
import java.util.Scanner;


public class ItemsSuperclass {
	Scanner Scan = new Scanner(System.in);

	private static double val;
	public static double Gold;
	private static double g;

	static void Item(){
		if((val = Math.random()) <=0.12) {
			HealthItem.potion();}
		else if((val = Math.random()) <=0.24) {
			HealthItem.Armour();}
		else if((val = Math.random()) <=0.36) {
			DamageItems.Sword();}
		else if((val = Math.random()) <=0.48) {
			DamageItems.Boots();}
		else if((val = Math.random()) <=0.60) {
			MagicItems.Wand();}
		else if((val = Math.random()) <=0.72) {
			MagicItems.Crystal();}
		else if((val = Math.random()) <=1) {
			Nothing();
		}
		DropGold();
	}

	static void ItemLv2(){
		if((val = Math.random()) <=0.12) {
			HealthItem.potionLv2();}
		else if((val = Math.random()) <=0.24) {
			HealthItem.ArmourLv2();}
		else if((val = Math.random()) <=0.36) {
			DamageItems.SwordLv2();}
		else if((val = Math.random()) <=0.48) {
			DamageItems.BootsLv2();}
		else if((val = Math.random()) <=0.60) {
			MagicItems.WandLv2();}
		else if((val = Math.random()) <=0.72) {
			MagicItems.CrystalLv2();}
		else if((val = Math.random()) <=1) {
			Nothing();
		}
		DropGold();
	}
	
	
	public static void Nothing() {
		System.out.println("Turns out there hadnt been anything of use there");
	}

	public static void DropGold() {
		Scanner Scan = new Scanner(System.in);
		if((val = Math.random()) <=0.30) {
			g = 2; coinz();
		}
		else if((val = Math.random()) <=0.60) {
			g = 3; coinz();
		}
		else if((val = Math.random()) <=0.85) {
			g = 4; coinz();
		}
		else if((val = Math.random()) <=1) {
			System.out.println("You picked up the coins but they slowly dissapeared as if just an illusion");
			g = 0;
		}
		Gold = Gold + g;
	}

	public static void coinz() {
		Scanner Scan = new Scanner(System.in);
		System.out.println("you find a collection of " + g + " gold coins "); Scan.nextLine();
	}
}


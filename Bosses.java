import java.util.ArrayList;
import java.util.Scanner;


public class Bosses {
	public static double bosshealth;
	private static double enemydamage;
	private static double enemydodge;
	private static double val;
	private static double Dodge;
	private static double HitChance;
	private static boolean webbed;
	private static int i;
	private static double bossmana;
	private static double bossmaxhealth;
	private static double enemyspecial;
	private static double bossmanapt;

	public static boolean Fangs;
	public static boolean everburn;
	public static boolean Stunning;

	Scanner Scan = new Scanner(System.in);

	public static void Human() {
		bosshealth = 10;

		Scanner Scan = new Scanner(System.in);
		System.out.println("You approach aggressivly without a word and start to attack");Scan.nextLine();
		Dodge = MainClass.BaseDodge;
		while(bosshealth > 3) {
			System.out.println("The person has " + bosshealth + " health \n What would you like to do? [1] Melee, [2] Magic Attack (" + MainClass.Mana +" out of 10), [3] Try Dodge or [4] have mercy and ask if they are okay?");
			int choice = Scan.nextInt();
			if(choice == 1) {
				System.out.println("You chose to melee attack");Scan.nextLine();
				if((val = Math.random()) >= enemydodge) {
					System.out.println("You land the attack for " + MainClass.damage + " damage");Scan.nextLine();
					bosshealth = bosshealth - MainClass.damage;
					System.out.println("You hear them scream in pain and beg for mercy");
					Scan.nextLine();
				}
				else {
					System.out.println("You missed...");Scan.nextLine();
				}
			}
			else if(choice == 2) {
				if (MainClass.Mana < 10 ) {
					System.out.println("You tried to do a magic attack but didnt have enough mana");Scan.nextLine();
				}
				else {
					System.out.println("You Chose to magic attack");Scan.nextLine();
					if ((val = Math.random()) >= enemydodge){
						System.out.println("You landed your spell for " + MainClass.Mdamage + " damage");Scan.nextLine();
						System.out.println("You hear them scream in pain and beg for mercy");Scan.nextLine();
						bosshealth = bosshealth - MainClass.Mdamage;
						MainClass.Mana = 0;
					}
					else {
						System.out.println("You missed...");Scan.nextLine();
					}
				}
			}
			else if(choice == 3) { 
				System.out.println("You decide to try focus on dodging");Scan.nextLine();
				System.out.println("But they didnt even try to attack you");
				Dodge = Dodge + 0.3;
			}
			else if(choice == 4) {
				System.out.println("Are you okay? *you ask* \n They point to a wound on their arm and you go to look");Scan.nextLine();
				System.out.println("All of a sudden you feel a coldness move through your body and see their hand stabbed into your shoulder");Scan.nextLine();
				MainClass.currenthealth = MainClass.currenthealth - 5;
				System.out.println("You get hit and take 5 damage");Scan.nextLine();
				System.out.print("You have " + MainClass.currenthealth + " out of " + MainClass.maxhealth + " health");Scan.nextLine();
				Bosses.Vampire();
			}
		}
		Vampire();
	}


	public static void Vampire() {
		Scanner Scan = new Scanner(System.in);
		enemyspecial = 4;
		enemydamage = 3;
		bossmaxhealth = 25;
		bosshealth = bosshealth + 15;
		enemydodge = 0.3;
		bossmana = 0;
		bossmanapt=1;
		if(bosshealth>bossmaxhealth) {bosshealth = bossmaxhealth;}

		System.out.println("Suddenly the person turns into a bat and moves further away and then you see the fangs \n You prepare to attack");Scan.nextLine();
		while ( bosshealth > 0 ) {
			Attack();
			if(bossmana == 3) {
				if((val = Math.random()) >= 0.35) {
					System.out.println("They try to scratch you");Scan.nextLine();
					Defence();
				}
				else { 
					VampireSpecial();
				}
			}
			else {
				System.out.println("They try to scratch you");Scan.nextLine();
				Defence();
			}
		}
		System.out.println("You have managed to kill the vampire");Scan.nextLine();
		System.out.println("You find a selection of items where he lay, a sword that glowed with an [1]everburning blade, [2]Military Grade Flashbang and [3]The Vampires Fangs");Scan.nextLine();
		System.out.println("Which will you take?");
		int Loot = Scan.nextInt();
		if (Loot == 1) {
			System.out.println("You chose the Everburn Blade");
			everburn = true;
		}
		else if (Loot == 2) {
			System.out.println("You chose the Military Grade Flashbang");
			Stunning = true;
		}
		if (Loot == 3) {
			System.out.println("You chose the Vampires Fangs");
			Fangs = true;
		}
	}

	public static void Attack() {
		Scanner Scan = new Scanner(System.in);
		Dodge = MainClass.BaseDodge;
		System.out.println("The Enemy has " + bosshealth + " health out of " + bossmaxhealth + " \n What would you like to do? [1] Melee, [2] Magic Attack (" + MainClass.Mana +" out of 10) or [3] Try Dodge");
		int choice = Scan.nextInt();
		if(choice == 1) {
			System.out.println("You chose to melee attack");Scan.nextLine();
			if((val = Math.random()) >= enemydodge) {
				System.out.println("You land the attack for " + MainClass.damage + " damage");Scan.nextLine();
				bosshealth = bosshealth - MainClass.damage;
			}
			else {
				System.out.println("You missed...");Scan.nextLine();
			}
		}
		else if(choice == 2) {
			if (MainClass.Mana < 10 ) {
				System.out.println("You tried to do a magic attack but didnt have enough mana");Scan.nextLine();
			}
			else {
				System.out.println("You Chose to magic attack");Scan.nextLine();
				if ((val = Math.random()) >= enemydodge){
					System.out.println("You landed your spell for " + MainClass.Mdamage + " damage");Scan.nextLine();
					bosshealth = bosshealth - MainClass.Mdamage;
					MainClass.Mana = 0;
				}
				else {
					System.out.println("You missed...");Scan.nextLine();
				}
			}
		}
		else {
			System.out.println("You decide to try focus on dodging");Scan.nextLine();

			Dodge = Dodge + 0.5;
		}
	}


	public static void Defence() {
		Scanner Scan = new Scanner(System.in);
		if((val = Math.random()) >= Dodge){
			System.out.println("You get hit and take " + enemydamage + " damage");Scan.nextLine();
			MainClass.currenthealth = MainClass.currenthealth - enemydamage;
			if(MainClass.currenthealth <=0) {
				System.out.println("YOU DIED....");
				System.exit(0);
			}
		}
		else {
			System.out.println("You manage to dodge their attack");Scan.nextLine();
		}
		if(bosshealth < 0) {
			bosshealth = 0;
		}
		System.out.print("The vampire has " + bosshealth + " health remaining out of " + bossmaxhealth + " health");Scan.nextLine();
		System.out.print("You have " + MainClass.currenthealth + " out of " + MainClass.maxhealth + " health");Scan.nextLine();
		bossmana = bossmana + 1;
		if(bossmana >3) {bossmana =3;}
		MainClass.Mana = MainClass.Mana + MainClass.ManaPt;
		if(MainClass.Mana > 10) {
			MainClass.Mana = 10;
		}
	}

	public static void VampireSpecial() {
		Scanner Scan = new Scanner(System.in);
		if((val = Math.random()) >= Dodge){
			System.out.println("You get bitten and take " + enemyspecial + " damage");Scan.nextLine();
			System.out.println("You pull away and see the vampire smile as he wipes the blood off his lips");
			MainClass.currenthealth = MainClass.currenthealth - enemyspecial;
			if(MainClass.currenthealth <=0) {
				System.out.println("YOU DIED....");
				System.exit(0);
			}
			bosshealth = bosshealth + (enemyspecial/2);
			bossmana = 0;
		}
		else {
			System.out.println("You manage to dodge their attack");Scan.nextLine();
		}
		if(bosshealth < 0) {
			bosshealth = 0;
		}
		System.out.print("The vampire has " + bosshealth + " health remaining out of " + bossmaxhealth + " health");Scan.nextLine();
		System.out.print("You have " + MainClass.currenthealth + " out of " + MainClass.maxhealth + " health");Scan.nextLine();
		bossmana = bossmana + 1;
		if(bossmana >3) {bossmana =3;}
		MainClass.Mana = MainClass.Mana + MainClass.ManaPt;
		if(MainClass.Mana > 10) {
			MainClass.Mana = 10;
		}
	}
}

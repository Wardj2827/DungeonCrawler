import java.util.ArrayList;
import java.util.Scanner;




public class Enemies {
	static String[] item = new String[4];
	static double[] cost = new double[4];
	private static double enemyhealth;
	private static double enemydamage;
	private static double enemydodge;
	private static double val;
	private static double Dodge;
	private static double HitChance;
	private static boolean webbed;
	private static int i;
	public static boolean stun;

	public static void Slime(){
		Scanner Scan = new Scanner(System.in);
		enemyhealth = 6;
		enemydamage = 1;
		enemydodge = 0.2;

		while ( enemyhealth > 0 ) {
			Attack();
			Dodge = Dodge - 0.1;
			if(enemyhealth > 0) {
				if(stun == true) {
					for(int s = 0; s<2; s++) {
						System.out.println("The enemy was stunned and couldnt attack");
						Attack();
					}
					stun = false;
				}

				else {
					System.out.println("The slime jumps at you");Scan.nextLine();
					System.out.println("The floor is sticky so you cant dodge as fast");Scan.nextLine();
					Defence();
				}
			}
		}
		System.out.println("You have managed to defeat the Slime and in the remains of the gel you find some treasure");Scan.nextLine();
		ItemsSuperclass.Item();
	}

	public static void Zombie(){
		Scanner Scan = new Scanner(System.in);
		enemyhealth = 10;
		enemydamage = 5;
		enemydodge = 0;

		System.out.println("The zombie slowly comes towards you");Scan.nextLine();
		System.out.println("Atleast it moves slow so it should be easier to hit and dodge it");Scan.nextLine();
		while ( enemyhealth > 0 ) {
			Attack();
			Dodge = Dodge + 0.3;
			if(enemyhealth > 0) {
				if(stun == true) {
					for(int s = 0; s<2; s++) {
						System.out.println("The enemy was stunned and couldnt attack");
						Attack();
					}
					stun = false;
				}

				else {
					System.out.println("They swing their rotten hand towards you");Scan.nextLine();
					Defence();
				}
			}
		}

		System.out.println("You think you have killed it and start to loot the room");Scan.nextLine();
		ItemsSuperclass.Item();
		System.out.println("Then you see its hand twitch as it slowly stands back up although less stable now");Scan.nextLine();

		enemyhealth = 8;
		enemydamage = 2.5;
		enemydodge = 0;

		while ( enemyhealth > 0 ) {
			Attack();
			Dodge = Dodge + 0.3;
			if(enemyhealth > 0) {
				if(stun == true) {
					for(int s = 0; s<2; s++) {
						System.out.println("The enemy was stunned and couldnt attack");
						Attack();
					}
					stun = false;
				}

				else {
					System.out.println("They swing their rotten hand towards you");Scan.nextLine();
					Defence();
				}
			}
		}
		System.out.println("You have managed to defeat the Zombie and ensure it by chopping off its head \n In the corner of the room you see what looks like treasure");Scan.nextLine();
		ItemsSuperclass.Item();
	}

	public static void Spider(){
		Scanner Scan = new Scanner(System.in);
		enemyhealth = 15;
		enemydamage = 3;
		enemydodge = 0.3;

		while ( enemyhealth > 0 ) {
			if(webbed == false) {
				Attack();
				if(enemyhealth > 0) {
					if(stun == true) {
						for(int s = 0; s<2; s++) {
							System.out.println("The enemy was stunned and couldnt attack");
							Attack();
						}
						stun = false;
					}

					else {
						if((val = Math.random()) >= 0.35) {
							System.out.println("They try to bite you");Scan.nextLine();
							Defence();
						}
						else { 
							System.out.println("they try to shoot a web at you");Scan.nextLine();
							SpiderWeb();
						}
					}
				}
			}

			else {
				for(int x=0; x<3; x++) {
					Attack();
					Dodge = 0.05;
					if(stun == true) {
						for(int s = 0; s<2; s++) {
							System.out.println("The enemy was stunned and couldnt attack");
							Attack();
						}
						stun = false;
					}

					else {
						if(enemyhealth>0) {
						System.out.println("They try to bite you and you struggle to dodge due to the webbing");Scan.nextLine();
						Defence();
						}
					}
				}
				System.out.println("You finally manage to clear off all the webs");Scan.nextLine();
				webbed = false;
			}
		}
		System.out.println("You have managed to slay the spider and buried in its web you think you see something");Scan.nextLine();
		ItemsSuperclass.Item();
	}



	public static void Attack(){
		Scanner Scan = new Scanner(System.in);
		Dodge = MainClass.BaseDodge;
		System.out.println("The Enemy has " + enemyhealth + " health \n What would you like to do? [1] Melee, [2] Magic Attack (" + MainClass.Mana +" out of 10) or [3] Try Dodge");
		int choice = Scan.nextInt();
		if(choice == 1) {
			System.out.println("You chose to melee attack");Scan.nextLine();
			if((val = Math.random()) >= enemydodge) {
				System.out.println("You land the attack for " + MainClass.damage + " damage");Scan.nextLine();
				if(Bosses.everburn == true) {
					System.out.println("The blades flames pulse[+2 damage]");
					enemyhealth = enemyhealth - 2;
				}
				enemyhealth = enemyhealth - MainClass.damage;
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
				if(Bosses.Stunning == true) {
					System.out.println("Would you like to use [1]basic magic or use [2]the Military Grade Flashbang?");
					int SpellChoice = Scan.nextInt();
					if(SpellChoice == 1) {
						System.out.println("You Chose to magic attack");Scan.nextLine();
						if ((val = Math.random()) >= enemydodge){
							System.out.println("You landed your spell for " + MainClass.Mdamage + " damage");Scan.nextLine();
							enemyhealth = enemyhealth - MainClass.Mdamage;
							MainClass.Mana = 0;
						}
						else {
							System.out.println("You missed...");Scan.nextLine();
						}
					}
					else if(SpellChoice == 2) {
						System.out.println("You attempt to throw the Military Grade Flashbang");Scan.nextLine();
						if ((val = Math.random()) >= enemydodge){
							System.out.println("It exploded for 2 damage and successfully stunned them");Scan.nextLine();
							enemyhealth = enemyhealth - 2;
							MainClass.Mana = 0;
							stun = true;
						}

						else {
							System.out.println("You missed...");Scan.nextLine();
						}
					}
				}
				else {
					System.out.println("You Chose to magic attack");Scan.nextLine();
					if ((val = Math.random()) >= enemydodge){
						System.out.println("You landed your spell for " + MainClass.Mdamage + " damage");Scan.nextLine();
						enemyhealth = enemyhealth - MainClass.Mdamage;
						MainClass.Mana = 0;
					}

					else {
						System.out.println("You missed...");Scan.nextLine();
					}
				}
			}
		}
		else {
			System.out.println("You decide to try focus on dodging");Scan.nextLine();

			Dodge = Dodge + 0.5;
		}
	}

	public static void Defence(){
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
		if(enemyhealth < 0) {
			enemyhealth = 0;
		}
		System.out.print("The enemy has " + enemyhealth + " health remaining \n");Scan.nextLine();
		System.out.print("You have " + MainClass.currenthealth + " out of " + MainClass.maxhealth + " health");Scan.nextLine();
		MainClass.Mana = MainClass.Mana + MainClass.ManaPt;
		if(MainClass.Mana > 10) {
			MainClass.Mana = 10;
		}
	}

	public static void SpiderWeb(){
		Scanner Scan = new Scanner(System.in);
		HitChance = 0.5;
		if((val = Math.random()) >= HitChance){
			System.out.println("You get hit by a web and take 1 damage and are almost stuck in place");Scan.nextLine();
			MainClass.currenthealth = MainClass.currenthealth - 1;
			webbed = true;
		}
		else {
			System.out.println("You manage to dodge their attack");Scan.nextLine();
		}
		if(enemyhealth < 0) {
			enemyhealth = 0;
		}
		System.out.print("The enemy has " + enemyhealth + " health remaining \n");Scan.nextLine();
		System.out.print("You have " + MainClass.currenthealth + " out of " + MainClass.maxhealth + " health");Scan.nextLine();
		MainClass.Mana = MainClass.Mana + MainClass.ManaPt;
		if(MainClass.Mana > 10) {
			MainClass.Mana = 10;
		}
	}

	public static void Shopkeep() {
		for (i=0; i<4; i++) {
			if((val = Math.random()) <= 0.25){
				cost[i] = 2;}
			else if((val = Math.random()) <= 0.5){
				cost[i] = 3;}
			else if((val = Math.random()) <= 0.75){
				cost[i] = 4;}
			else if((val = Math.random()) <= 1){
				cost[i] = 5;}
		}
		for (i=0; i<4; i++) {
			if((val = Math.random()) <= 0.2){
				item[i] = "Sword";}
			else if((val = Math.random()) <= 0.4){
				item[i] = "Wand";}
			else if((val = Math.random()) <= 0.6){
				item[i] = "Boots";}
			else if((val = Math.random()) <= 0.8){
				item[i] = "Crystal";}
			else if((val = Math.random()) <= 1){
				item[i] = "Armour";}

		}
		Scanner Scan = new Scanner(System.in);
		System.out.println("You see he has some wares for sale"); Scan.nextLine();
		System.out.println("He shows you his wares: \n" + "Item: " + item[0] + " " + item[1] + " " + item[2] + " " + item[3] + " \n Cost: " + cost[0] + "g " + cost[1] + "g " + cost[2] + "g " + cost[3] + "g ");
		System.out.println("You Have " + ItemsSuperclass.Gold + " gold, would you like to buy something? [y/n]");
		String reply =Scan.next();
		if (reply.equalsIgnoreCase("y")) {
			System.out.println("Which item would you like to buy?[1,2,3 or 4]");
			int purchase = Scan.nextInt();
			if( ItemsSuperclass.Gold >= cost[purchase - 1] ) {
				System.out.println("Ah perfect the " + item[purchase - 1] + " is all yours");Scan.nextLine();
				if (item[purchase - 1].equals("Sword")) {
					DamageItems.Sword();
				}
				else if (item[purchase - 1].equals("Boots")) {
					DamageItems.Boots();
				}
				else if (item[purchase - 1].equals("Wand")) {
					MagicItems.Wand();
				}
				else if (item[purchase - 1].equals("Crystal")) {
					MagicItems.Crystal();
				}
				else if (item[purchase - 1].equals("Armour")) {
					HealthItem.Armour();
				}

				ItemsSuperclass.Gold = ItemsSuperclass.Gold - cost[purchase - 1];
				System.out.println("And have a healing potion, on the house");
				HealthItem.potion();
			}
			else {
				System.out.println("Sorry you dont seem to have enough here but im sure if you keep going you will find more");Scan.nextLine();
			}
		}
		else {
			System.out.println("No problem I wish you a merry adventure");Scan.nextLine();
		}

	}
}



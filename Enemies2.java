import java.util.ArrayList;
import java.util.Scanner;

public class Enemies2 {


	static String[] item = new String[4];
	static double[] cost = new double[4];
	static double[] enemyhealth = new double[6];
	static double[] enemydamage = new double[6];
	static double[] enemydodge = new double[6];

	private static double t;
	private static boolean trust;
	private static int slime;
	private static int numberofenemies;
	private static double val;
	private static double Dodge;
	private static double HitChance;
	private static boolean webbed;
	private static int i;
	private static int a;

	public static void Bats() {
		Scanner Scan = new Scanner(System.in);
		numberofenemies = 2;
		enemyhealth[1] = 4;
		enemydamage[1]= 2;
		enemydodge[1] = 0.5;
		enemyhealth[2] = 4;
		enemydamage[2] = 2;
		enemydodge[2] = 0.5;


		while ( enemyhealth[1] > 0 || enemyhealth[2]>0) {
			Attack();
			if(enemyhealth[1] > 0 || enemyhealth[2] > 0) {
				if(Enemies.stun == true) {
					for(int s = 0; s<2; s++) {
						System.out.println("The enemy was stunned and couldn't attack");
						Attack();
						for(int z = 1; z<numberofenemies;z++) {
							if(enemyhealth[z] <= 0) {
								enemyhealth[z]=0;
								if(z<3) {
								enemyhealth[z] = enemyhealth[z+1];
								enemydamage[z] = enemydamage[z+1];
								enemydodge[z] = enemydodge[z+1];
								numberofenemies = numberofenemies -1;}}}
					}
					Enemies.stun = false;
				}

				else {
					System.out.println("The bat dives at you");Scan.nextLine();
					Defence();
					for(int z = 1; z<numberofenemies;z++) {
						if(enemyhealth[z] <= 0) {
							enemyhealth[z]=0;
							if(z<3) {
							enemyhealth[z] = enemyhealth[z+1];
							enemydamage[z] = enemydamage[z+1];
							enemydodge[z] = enemydodge[z+1];
							numberofenemies = numberofenemies -1;}}}
					System.out.println(numberofenemies);
				}
			}
		}
		System.out.println("You have managed to defeat the bats and in the darkness you find some treasure");Scan.nextLine();
		ItemsSuperclass.Item();

	}

	public static void Slime() {
		Scanner Scan = new Scanner(System.in);
		numberofenemies = 3;
		enemyhealth[1] = 4;
		enemydamage[1]= 0.5;
		enemydodge[1] = 0.2;
		enemyhealth[2] = 6;
		enemydamage[2] = 1;
		enemydodge[2] = 0.1;
		enemyhealth[3] = 8;
		enemydamage[3] = 1.5;
		enemydodge[3] = 0.05;


		while ( enemyhealth[1] > 0 || enemyhealth[2]>0 || enemyhealth[3]>0) {
			Attack();
			for(int z = 1; z<numberofenemies;z++) {
				if(enemyhealth[z] <= 0) {
					enemyhealth[z]=0;
					if(z<3) {
					enemyhealth[z] = enemyhealth[z+1];
					enemydamage[z] = enemydamage[z+1];
					enemydodge[z] = enemydodge[z+1];
					numberofenemies = numberofenemies -1;}}}
			if(enemyhealth[1] > 0 || enemyhealth[2] > 0 || enemyhealth[3]>0) {
				if(Enemies.stun == true) {
					for(int s = 0; s<2; s++) {
						System.out.println("The enemy was stunned and couldn't attack");
						Attack();
					}
					Enemies.stun = false;
				}

				else {
					System.out.println("The Slimes try to jump on you");Scan.nextLine();
					Defence();
					for(int z = 1; z<numberofenemies;z++) {
						if(enemyhealth[z] <= 0) {
							enemyhealth[z]=0;
							if(z<3) {
							enemyhealth[z] = enemyhealth[z+1];
							enemydamage[z] = enemydamage[z+1];
							enemydodge[z] = enemydodge[z+1];
							numberofenemies = numberofenemies -1;}}}
					System.out.println(numberofenemies);
				}
			}
		}
		System.out.println("You have managed to defeat the slimes and in the goo you find some ...");Scan.nextLine();
		System.out.println("Suddenly there is a bang as from the ceiling falls a huge blob of slime ");Scan.nextLine();
		numberofenemies = 1;
		System.out.println(numberofenemies);
		enemyhealth[1] = 18;
		enemydamage[1] = 6;
		enemydodge[1] = 0.2;
		slime = 0;

		while(enemyhealth[1] > 0) {
			if(enemyhealth[1]<5) {
				if(slime<3) {
					System.out.println("It seemed to absorb some of the broken off pieces and the remains of the smaller slimes");
					enemyhealth[1] = enemyhealth[1] + 6;
					slime = slime +1;
				}
			}
			Attack();
			if(enemyhealth[1] > 0 || enemyhealth[2] > 0 || enemyhealth[3]>0) {
				if(Enemies.stun == true) {
					for(int s = 0; s<2; s++) {
						System.out.println("The enemy was stunned and couldn't attack");
						Attack();
					}
					Enemies.stun = false;
				}
			}
			else {
				System.out.println("The Slime tries to jump on you by launching high into the air");Scan.nextLine();
				Dodge = MainClass.BaseDodge + 0.3;
				Defence();
			}
		}
		System.out.println("You manage to defeat the slime and chop it into such small pieces that it doesnt regenerate and find some very sticky rewards");Scan.nextLine();
		ItemsSuperclass.ItemLv2();

	}
	
	public static void Chest() {
		t = 0.1;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Do you want to open the chest? [y/n]"); String chest = Scan.next();
		if(chest.equals("y")) {
			trust = true;
			System.out.println("You open up the chest, you cant see inside very well \n  ");
			while(trust == true) {
				System.out.println("You reach in...");Scan.nextLine();
				if((val = Math.random()) > t) {
					ItemsSuperclass.ItemLv2();
					System.out.println("Do you want to check if there is more in the chest? [y/n]"); chest = Scan.next();
					if(chest.equals("y")) { t = t + 0.3;
					}
					else {trust = false;
					}
				}
				else {
					Mimic();
					trust = false;
				}
			}
		}
		else {
			System.out.println("You don't trust it and decide to just carry on through the dungeon");
		}		
	}


	public static void Mimic() {
		Scanner Scan = new Scanner(System.in);
		enemyhealth[1]=20;
		enemydamage[1]=5;
		enemydodge[1]=0.1;
		System.out.println("The lid slams down on your arm and you see a single ripped book page fall through the air");Scan.nextLine();
		System.out.println("It reads 'A bit greedy dontcha think?'[-10hp]");Scan.nextLine();
		MainClass.currenthealth = MainClass.currenthealth - 10;
		while(enemyhealth[1] > 0) {
			Attack();
			if(enemyhealth[1] > 0) {
				if(Enemies.stun == true) {
					for(int s = 0; s<2; s++) {
						System.out.println("The mimic was stunned and couldn't attack");
						Attack();
					}
					Enemies.stun = false;
				}
			}
			else {
				System.out.println("The mimic dashes at you at a highspeed as the lid starts to slam shut");Scan.nextLine();
				Defence();
			}
		}
		System.out.println("You manage to defeat the mimic and find some rewards");Scan.nextLine();
		ItemsSuperclass.ItemLv2();
		ItemsSuperclass.Item();

	}



	public static void Attack(){
		Scanner Scan = new Scanner(System.in);
		Dodge = MainClass.BaseDodge;
		if(numberofenemies == 1) {System.out.println("The first enemy has " + enemyhealth[1] + " health \n What would you like to do? [1] Melee, [2] Magic Attack (" + MainClass.Mana +" out of 10) or [3] Try Dodge");}
		else if(numberofenemies == 2) {System.out.println("The first enemy has " + enemyhealth[1] + " health and the second enemy has " + enemyhealth[2] + " health \n What would you like to do? [1] Melee, [2] Magic Attack (" + MainClass.Mana +" out of 10) or [3] Try Dodge");}
		else if(numberofenemies == 3) {System.out.println("The first enemy has " + enemyhealth[1] + " health, the second enemy has " + enemyhealth[2] + " health and the third enemy has " + enemyhealth[3] + " health \n What would you like to do? [1] Melee, [2] Magic Attack (" + MainClass.Mana +" out of 10) or [3] Try Dodge");}
		int choice = Scan.nextInt();
		if(choice == 1) {
			if(numberofenemies == 1) {System.out.println("You chose to melee attack"); a = 1;}
			else if(numberofenemies == 2) {System.out.println("You chose to melee attack but to which enemy? [1 or 2]"); a =Scan.nextInt();}
			else if (numberofenemies == 3) {System.out.println("You chose to melee attack but to which enemy? [1, 2 or 3]"); a =Scan.nextInt();}

			if((val = Math.random()) >= enemydodge[a]) {
				System.out.println("You land the attack for " + MainClass.damage + " damage");Scan.nextLine();
				if(Bosses.everburn == true) {
					System.out.println("The blades flames pulse[+2 damage]");
					enemyhealth[a] = enemyhealth[a] - 2;
				}
				enemyhealth[a] = enemyhealth[a] - MainClass.damage;
				if(enemyhealth[a]<0) {enemyhealth[a] = 0;}
			}
			else {
				System.out.println("You missed...");Scan.nextLine();
			}
		}
		else if(choice == 2) {
			if (MainClass.Mana < 10 ) {
				System.out.println("You tried to do a magic attack but didnt have enough Energy");Scan.nextLine();
			}
			else {
				if(Bosses.Stunning == true) {
					System.out.println("Would you like to use [1]basic magic or use [2]the Military Grade Flashbang ");
					int SpellChoice = Scan.nextInt();
					if(SpellChoice == 1) {
						if(numberofenemies == 1) {System.out.println("You Chose to magic attack "); a = 1;}
						else if(numberofenemies == 2) {System.out.println("You Chose to magic attack but on which enemy?[1 or 2]"); a =Scan.nextInt();}
						else if (numberofenemies == 3) {System.out.println("You Chose to magic attack but on which enemy?[1, 2 or 3]"); a =Scan.nextInt();}
						if ((val = Math.random()) >= enemydodge[a]){
							System.out.println("You landed your spell for " + MainClass.Mdamage + " damage");Scan.nextLine();
							enemyhealth[a] = enemyhealth[a] - MainClass.Mdamage;
							if(enemyhealth[a]<0) {enemyhealth[a] = 0;}
							MainClass.Mana = 0;
						}
						else {
							System.out.println("You missed...");Scan.nextLine();
						}
					}
					else if(SpellChoice == 2) {
						if(numberofenemies == 1) {System.out.println("You attempt to throw the Military Grade Flashbang"); a = 1;}
						else if(numberofenemies == 2) {System.out.println("You attempt to throw the Military Grade Flashbang but at which enemy?[1 or 2]"); a =Scan.nextInt();}
						else if (numberofenemies == 3) {System.out.println("You attempt to throw the Military Grade Flashbang but at which enemy?[1, 2 or 3]"); a =Scan.nextInt();}
						if ((val = Math.random()) >= enemydodge[a]){
							System.out.println("You landed your spell for 2 damage and successfully stunned them");Scan.nextLine();
							enemyhealth[a] = enemyhealth[a]- 2;
							if(enemyhealth[a]<0) {enemyhealth[a] = 0;}
							MainClass.Mana = 0;
							Enemies.stun = true;
						}

						else {
							System.out.println("You missed...");Scan.nextLine();
						}
					}
				}
				else if(Bosses.Fangs == true) {
					System.out.println("Would you like to use [1] basic magic or use [2] your Fangs ");
					int SpellChoice = Scan.nextInt();
					if(SpellChoice == 1) {
						if(numberofenemies == 1) {System.out.println("You Chose to magic attack "); a = 1;}
						else if(numberofenemies == 2) {System.out.println("You Chose to magic attack but on which enemy?[1 or 2]"); a =Scan.nextInt();}
						else if (numberofenemies == 3) {System.out.println("You Chose to magic attack but on which enemy?[1, 2 or 3]"); a =Scan.nextInt();}
						if ((val = Math.random()) >= enemydodge[a]){
							System.out.println("You landed your spell for " + MainClass.Mdamage + " damage");Scan.nextLine();
							enemyhealth[a] = enemyhealth[a] - MainClass.Mdamage;
							if(enemyhealth[a]<0) {enemyhealth[a] = 0;}
							MainClass.Mana = 0;
						}
						else {
							System.out.println("You missed...");Scan.nextLine();
						}
					}
					else if (SpellChoice == 2){
						if(numberofenemies == 1) {System.out.println("You Chose to try bite a target but which enemy?"); a = 1;}
						else if(numberofenemies == 2) {System.out.println("You Chose to try bite a target but which enemy?[1 or 2]"); a =Scan.nextInt();}
						else if (numberofenemies == 3) {System.out.println("You Chose to try bite a target but which enemy?[1, 2 or 3]]"); a =Scan.nextInt();}
						if ((val = Math.random()) >= enemydodge[a]){
							System.out.println("You bit them for " + MainClass.Bite + " damage");Scan.nextLine();
							System.out.println("You feel a rush of adrenaline through your body [Heal half of the damage]");
							MainClass.currenthealth = MainClass.currenthealth + (MainClass.Bite/2);
							enemyhealth[a] = enemyhealth[a] - MainClass.Bite;
							if(enemyhealth[a]<0) {enemyhealth[a] = 0;}
							MainClass.Mana = 0;
						}

						else {
							System.out.println("You missed...");Scan.nextLine();
						}
					}
				}
				else {
					System.out.println("You Chose to magic attack but on which enemy?[1, 2 or 3]");int a =Scan.nextInt();
					if ((val = Math.random()) >= enemydodge[a]){
						System.out.println("You landed your spell for " + MainClass.Mdamage + " damage");Scan.nextLine();
						enemyhealth[a] = enemyhealth[a] - MainClass.Mdamage;
						if(enemyhealth[a]<0) {enemyhealth[a] = 0;}
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

			Dodge = Dodge + 0.6;
		}
	}

	public static void Defence(){
		Scanner Scan = new Scanner(System.in);
		for( int e = 1; e<=numberofenemies ; e++) {
			if(enemyhealth[e]>0){
				System.out.println("enemy " + e + " tries to hit you");
				if((val = Math.random()) >= Dodge){
					System.out.println("You get hit and take " + enemydamage[e] + " damage");Scan.nextLine();
					MainClass.currenthealth = MainClass.currenthealth - enemydamage[e];
					if(MainClass.currenthealth <=0) {
						System.out.println("YOU DIED....");
						System.exit(0);
					}
				}
				else {
					System.out.println("You manage to dodge their attack");Scan.nextLine();
				}
				if(enemyhealth[e] <= 0) {
					enemyhealth[e] = 0;}
			}
		}
		System.out.print("You have " + MainClass.currenthealth + " out of " + MainClass.maxhealth + " health");Scan.nextLine();
		MainClass.Mana = MainClass.Mana + MainClass.ManaPt;
		if(MainClass.Mana > 10) {
			MainClass.Mana = 10;
		}	
	}



}

import java.util.ArrayList;
import java.util.Scanner;




public class MainClass {
	public static double maxhealth;
	public static double currenthealth;
	public static double damage;
	public static double Mdamage;
	public static double Bite;
	public static double Mana;
	public static double ManaPt;
	public static double BaseDodge;
	private static double val;


	public static void main(String[] args)
	{ 	
		Scanner Scan = new Scanner(System.in);
		System.out.println("Welcome to Dungeon Crawler Attempt:1");
		Scan.nextLine();
		Bosses.Fangs = false;
		Bosses.everburn = false;
		Bosses.Stunning = false;
		Enemies.stun = false;
		ItemsSuperclass.Gold = 0;
		maxhealth = 20;
		currenthealth = 20;
		damage = 2;
		Mdamage = 6;
		ManaPt = 2;
		Bite = 4;
		BaseDodge = 0.35;
		Mana = 0;
		System.out.println("Your hero has " + currenthealth + " out of " + maxhealth + " health ");
		Scan.nextLine();
		System.out.println("You enter the dungeon and come into a dark room, the walls are coated in a green mucus");
		Scan.nextLine();
		System.out.println("Suddenly a slime falls from the roof right infront of you \n");
		Enemies.Slime();
		System.out.println("You carry on through the dungeon and reach a juncton...");Scan.nextLine();
		System.out.println("Do you want to go (l)eft or (r)ight?");
		String Direction = Scan.next();
		if ( Direction.equals("l")) {
			System.out.println("You decide to head left and soon find yourself in a new room... \n and start to hear a weird groaning noise...? and then you see it");Scan.nextLine();
			Enemies.Zombie();
		}
		else if (Direction.equals("r")) {
			System.out.println("You decide to head right and soon find yourself in a new room... \n You walk into a room and you feel a spider web hit your face");Scan.nextLine();
			System.out.println("A huge hairy spider crawls along its huge web that lines the walls");Scan.nextLine();
			Enemies.Spider();
		}
		System.out.println("You carry on through the dungeon and reach a juncton...");Scan.nextLine();
		System.out.println("Do you want to go (l)eft or (r)ight?");
		String direction = Scan.next();
		if ( direction.equals("l")) {
			if((val = Math.random()) >= 0.7) {
				System.out.println("You decide to head left and soon find yourself in a new room... \n and start to hear a weird groaning noise...? and then you see it");Scan.nextLine();
				Enemies.Zombie();
			}
			else {
				System.out.println("You decide to head left and... find a shop? A pretty makeshift one at that though");
				Enemies.Shopkeep();
			}
		}
		if ( direction.equals("r")) {
			if((val = Math.random()) >= 0.7) {
				System.out.println("You decide to head right and soon find yourself in a new room... \n You walk into a room and you feel a spider web hit your face");Scan.nextLine();
				System.out.println("A huge hairy spider crawls along its huge web that lines the walls");Scan.nextLine();
				Enemies.Spider();
			}
			else {
				System.out.println("You decide to head right and... find a shop? A pretty makeshift one at that though");
				Enemies.Shopkeep();
			}
		}
		System.out.println("You decide to keep going and soon find yourself in a huge circular room \n"); Scan.nextLine();
		System.out.println("It's a bit dark but you can see....? \n");Scan.nextLine();
		System.out.println("A person? You start to approach but should you be aggressive or check if they are okay? [a/p]");
		String Stance = Scan.next();
		if (Stance.equals("a")) {
			Bosses.Human();
		}
		else {
			System.out.println("Are you okay? *you ask* \n They point to a wound on their arm and you go to look");Scan.nextLine();
			System.out.println("All of a sudden you feel a coldness move through your body and see their hand stabbed into your shoulder");Scan.nextLine();
			MainClass.currenthealth = MainClass.currenthealth - 5;
			System.out.println("You get hit and take 5 damage");Scan.nextLine();
			System.out.print("You have " + MainClass.currenthealth + " out of " + MainClass.maxhealth + " health");Scan.nextLine();
			Bosses.bosshealth = 10;
			Bosses.Vampire();
		}
		System.out.println("You carry on out of the boss room and find a room... with a pillow?");Scan.nextLine();
		System.out.println("To be fair it had lots of pillows the entire room seemed to be pillow but it looked so soft");Scan.nextLine();
		System.out.println("Would you like to lay down?[y/n]");
		String answer = Scan.next();
		if(answer.equals("y")) {
			System.out.println("You lay down and just rest your eyes for a second.....");Scan.nextLine();
			System.out.println("You wake up feeling refreshed [Heal half of your max hp]");
			currenthealth = currenthealth + ((maxhealth/4)*3);
			if (currenthealth > maxhealth) {currenthealth = maxhealth;}
			System.out.print("You have " + MainClass.currenthealth + " out of " + MainClass.maxhealth + " health");Scan.nextLine();
		}
		System.out.println("You notice one of the pillows seems bouncier... want to bounce?(y/n)");
		String bounce = Scan.next();
		if(bounce.equals("y")) {
			System.out.println("How many times would you like to bounce?");
			int bounces = Scan.nextInt();
			for(int b = 0;b<bounces;b++) {
				System.out.println("You Bounce...");
				if ((val = Math.random()) >= 0.95){
					System.out.println("You have rolled your ankle, you won't be moving as fast now[-5% dodge chance]");
					BaseDodge = BaseDodge - 0.05;
				}
				if(b == 5) {
					System.out.println("You jump an a brick appears above you...");Scan.nextLine();
					System.out.println("And 3 gold coins come out...");
					ItemsSuperclass.Gold = ItemsSuperclass.Gold + 3;
				}
			}
		}
		System.out.println("You decide to keep going and start on to the next part of the dungeon");
		System.out.println("You come into a new room and its eerily dark \n suddenly a swarm of bats fly down");
		Enemies2.Bats();

		System.out.println("You decide to carry on through the dungeon and come to a junction, would you like to go left or right?(l/r)");
		Direction = Scan.next();
		if ( Direction.equals("l")) {
			System.out.println("You decide to head left and soon find yourself in a new room... \n and start to hear lots of squelching");Scan.nextLine();
			Enemies2.Slime();
		}
		else if (Direction.equals("r")) {
			System.out.println("You decide to head right and soon find yourself in a new room... \n Sat square in the middle of it is... a chest");Scan.nextLine();
			System.out.println("It's giving off a curious aura so you go check");
			Enemies2.Chest();
		}
		
		System.out.println("You continue on through the dungeon");
		if((val = Math.random())>=0.5) {
			
		}
		else {
			
		}
	}
}
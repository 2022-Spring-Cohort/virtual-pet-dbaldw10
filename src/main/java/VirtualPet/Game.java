package VirtualPet;

import java.util.Scanner;

public class Game {
    //public static Dragon Freddy = new Dragon("Freddy", "silver", 309, 25, "ice", 10);
    public static Dragon Zallon = new Dragon("Zallon", "ebony", 1109, 3, "electric", 99);
    //public static Dragon Bekah = new Dragon("Bekah", "rainbow", 35, 99, "fire", 100);
    //public static Dragon Lyric = new Dragon("Lyric", "blue", 3, 12, "fire", 70);


    public void play() {
        Scanner userInput = new Scanner(System.in);
        while(Zallon.getEnergy() > 20) {

            String userChoice = "";

            System.out.println("Hello dear adventure, don't be scared, Im just a motherfucking dragon.");

            System.out.println("Welcome to DragonWorld:Extinction of Mankind");

            Zallon.greeting();
            System.out.println(mainMenu());
            userChoice = userInput.nextLine();
            if (userChoice.equalsIgnoreCase("Walk")) {
                Zallon.tick();
                System.out.println(Zallon.getAge());

            } else if (userChoice.equalsIgnoreCase("Fight Dallas")) {
                System.out.println("Instant death");
                System.exit(0);
            } else if (userChoice.equalsIgnoreCase("Fight a God")) {
                System.out.println("You have just been knocked you out.");
                Zallon.tick2();

            }
        }
        String ending = "Game Over";
        System.out.println(ending);
    }
    public String mainMenu(){
        String menu = "";
        menu += "Please enter a selection from the choice below.\n";
        menu += "Walk - drains energy and makes hungry and raise experience\n";
        menu += "Attack Villagers - drains energy and makes less hungry and raise experience\n";
        menu += "Defend the Planet - drains energy and makes hungry and raise experience ALOT\n";
        menu += "Fight Dallas - Dragon dies\n";
        menu += "Fight a God - Well you have a better chance then fighting Dallas\n";
        return menuBling(menu);
    }
    public String menuBling(String textToBling){
        String blingText = "";
        for(int i = 0; i < 70; i++){
            blingText += "*";
        }
        blingText += "\n";
        return blingText + textToBling + blingText;
    }
}


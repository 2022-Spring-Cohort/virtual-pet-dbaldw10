package VirtualPet;

import java.util.Scanner;


public class Main {

   static VirtualDragonShelter shelter = new VirtualDragonShelter();
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        String userChoice = "";
        while (shelter.allDragonsHealthy()) {

            System.out.println("Welcome to DragonWorld:Extinction of Mankind");


            System.out.println(mainMenu());

            userChoice = userInput.nextLine();


            if (userChoice.equalsIgnoreCase("Walk")) {
                shelter.viewPetList();
                String petName = userInput.nextLine();
                shelter.walkPetByName(petName);


            } else if (userChoice.equalsIgnoreCase("Fight Dallas")) {
                System.out.println("Instant death");
                System.exit(0);
            } else if (userChoice.equalsIgnoreCase("Fight a Boss Monster")) {
                System.out.println("You have just been knocked you out.");
                String petName = userInput.nextLine();
                shelter.fightABoss(petName);

            } else if (userChoice.equalsIgnoreCase("Take to Doctor")) {
                shelter.viewPetList();
                String petName = userInput.nextLine();
                shelter.doctorPetByName(petName);

            } else if (userChoice.equalsIgnoreCase("Add a Dragon")) {
                addPetToShelter();

            } else if (userChoice.equalsIgnoreCase("View Pet Status")) {
                System.out.println(shelter.getPetsStatus());

            } else if (userChoice.equalsIgnoreCase("View All Pets")) {
                shelter.viewPetList();
            } else if (userChoice.equalsIgnoreCase("Train All Dragons")) {
                shelter.trainAllDragons();

            } else if (userChoice.equalsIgnoreCase("Adopt a Dragon")) {
                AdoptADragon();


            } else
                System.out.println("Please enter a correct choice");

        }
    }



    public static String mainMenu() {
        String menu = "";
        menu += "Please enter a selection from the choice below.\n";
        menu += "Walk - drains energy and makes hungry and raise experience.\n";
        menu += "View Pet Status - Lets you view status of all pets in shelter.\n";
        menu += "View All Pets - Shows all pets in the shelter & adopted in one list\n";
        menu += "Add A Dragon - Lets you add a dragon to the Shelter\n";
        menu += "Take to Doctor - Restores health to 100.\n";
        menu += "Fight Dallas - Dragon dies.\n";
        menu += "Adopt a Dragon - Take one home with you!\n";
        menu += "Train All Dragons - Lowers all health.\n";

        return menuBling(menu);
    }

    public static String menuBling(String textToBling) {
        String blingText = "";
        for (int i = 0; i < 70; i++) {
            blingText += "*";
        }
        blingText += "\n";
        return blingText + textToBling + blingText;
    }


    public static Dragon addPetToShelter() {
        System.out.println("What is the name of Dragon being admitted?");
        Scanner scanner = new Scanner(System.in);
        String nameOfNewPet = scanner.next();

        System.out.println("What scale color is it?");
        scanner = new Scanner(System.in);
        String scaleColorNew = scanner.next();

        System.out.println("How old is the dragon?");
        scanner = new Scanner(System.in);
        int ageNew = scanner.nextInt();

        System.out.println("How hungry is the dragon? 0-100");
        scanner = new Scanner(System.in);
        int hungerNew = scanner.nextInt();

        System.out.println("What type of Dragon?");
        scanner = new Scanner(System.in);
        String typeNew = scanner.next();

        System.out.println("How much energy does the dragon have currently? 0-100");
        scanner = new Scanner(System.in);
        int energyNew = scanner.nextInt();

        System.out.println("How much health  does the dragon have? 0-100");
        scanner = new Scanner(System.in);
        int healthNew = scanner.nextInt();


        Dragon newPet = new Dragon(nameOfNewPet, scaleColorNew, ageNew, hungerNew, typeNew, energyNew, healthNew);
        shelter.addPet(newPet);


        return newPet;
    }
    public static void AdoptADragon() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Which dragon would you like to adopt?");
        shelter.viewPetList();
        String petNameToAdopt =  userInput.nextLine();
        shelter.adoptPetByName(petNameToAdopt);

    }

    }







package VirtualPet;

import java.util.Scanner;


public class Main {

    static VirtualDragonShelter shelter = new VirtualDragonShelter();

    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        String userChoice = "";
        System.out.println("Welcome to DragonWorld:Extinction of Mankind");
        while (shelter.allAnimalsHealthy()) {

            System.out.println(mainMenu());
            Animal.tick();
            userChoice = userInput.nextLine();


            if (userChoice.equalsIgnoreCase("Walk")) {
                shelter.viewPetList();
                String petName = userInput.nextLine();
                shelter.walkPetByName(petName);

            } else if (userChoice.equalsIgnoreCase("Fight Dallas")) {
                System.out.println("Instant death");
                System.exit(0);
            } else if (userChoice.equalsIgnoreCase("Doctor")) {
                shelter.viewPetList();
                String petName = userInput.nextLine();
                shelter.doctorPetByName(petName);

            } else if (userChoice.equalsIgnoreCase("Add a Dragon")) {
                addPetToShelter();
            } else if (userChoice.equalsIgnoreCase("View Pet Status")){
                shelter.getPetsStatus();

            } else if (userChoice.equalsIgnoreCase("View All Pets")) {
                shelter.viewPetList();
            } else if (userChoice.equalsIgnoreCase("Train All Dragons")) {
                shelter.trainAllDragons();

            } else if (userChoice.equalsIgnoreCase("Adopt a Dragon")) {
                AdoptADragon();
            } else if (userChoice.equalsIgnoreCase("Oil Robot Dragon")) {
                shelter.viewRobots();
                String petName = userInput.nextLine();
                shelter.oilDragonByName(petName);
            } else if (userChoice.equalsIgnoreCase("Clean Litter Boxes")) {
                shelter.viewOrganicAnimals();
                String petName = userInput.nextLine();
                shelter.oilDragonByName(petName);
            }else if(userChoice.equalsIgnoreCase("Feed")) {
                System.out.println("Which pet would you like to feed?");
                shelter.viewPetList();
                String petName = userInput.nextLine();
                shelter.feedAnimalByName(petName);

            } else if (userChoice.equalsIgnoreCase("Exit")){
                System.exit(0);
            } else
                System.out.println("Please enter a correct choice");

        }
    }


    public static String mainMenu() {
        String menu = "";
        menu += "Please enter a selection from the choice below.\n";
        menu += "View All Pets - Shows all pets in the shelter & adopted in one list\n";
        menu += "View Pet Status - Shows all pets status. \n";
        menu += "Walk - drains energy and makes hungry and raise experience.\n";
        menu += "Feed - feeds a hungry animal. \n";
        menu += "Add An Animal - Lets you add an animal to the Shelter\n";
        menu += "Doctor - Restores all animals health to 100.\n";
        menu += "Adopt a Dragon - Take one home with you!\n";
        menu += "Train All Dragons - Lowers all health.\n";
        menu += "Oil Robot Dragon - Raises Oil LVl of Robot. \n";
        menu += "Exit - Exit Game. \n";

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


    public static Animal addPetToShelter() {
        System.out.println("Sorry we are only admitting Dragons at this time \n.");
        System.out.println("What is the name of Dragon being admitted?\n");
        Scanner scanner = new Scanner(System.in);
        String nameOfNewPet = scanner.next();

        System.out.println("How Old is it?");
        int newAge = scanner.nextInt();

        System.out.println("How much energy does it have? 0-100");
        int newEnergy = scanner.nextInt();


        System.out.println("How healthy is it? 0-100");
        scanner = new Scanner(System.in);
        int newHealth = scanner.nextInt();


        Dragon newPet = new Dragon(nameOfNewPet, newAge, newEnergy, newHealth) {
            @Override
            public void walk() {

            }

            @Override
            void animalSound() {

            }

            @Override
            void feed() {

            }
        };
        shelter.addPet(newPet);

        return newPet;
    }

    public static void AdoptADragon() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Which dragon would you like to adopt?");
        shelter.viewPetList();
        String petNameToAdopt = userInput.nextLine();
        shelter.adoptPetByName(petNameToAdopt);
    }

}







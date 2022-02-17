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
            userChoice = userInput.nextLine();


            if (userChoice.equalsIgnoreCase("Walk")) {
                shelter.viewPetList();
                String petName = userInput.nextLine();
                shelter.walkPetByName(petName);

            } else if (userChoice.equalsIgnoreCase("Doctor")) {
                shelter.viewOrganicAnimals();
                String petName = userInput.nextLine();
                shelter.doctorPetByName(petName);

            } else if (userChoice.equalsIgnoreCase("Add")) {
                addPetToShelter();
            } else if (userChoice.equalsIgnoreCase("Status")){
                shelter.getPetsStatus();

            } else if (userChoice.equalsIgnoreCase("All Pets")) {
                shelter.viewPetList();
            } else if (userChoice.equalsIgnoreCase("Train All")) {
                shelter.trainAllDragons();

            } else if (userChoice.equalsIgnoreCase("Adopt")) {
                AdoptAnAnimal();
            } else if (userChoice.equalsIgnoreCase("Oil Robot")) {
                shelter.viewRobots();
                String petName = userInput.nextLine();
                shelter.oilRobotByName(petName);
            } else if (userChoice.equalsIgnoreCase("Clean")) {
                shelter.viewOrganicAnimals();
                String petName = userInput.nextLine();
                shelter.cleanLitterBoxByName(petName);
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

        menu += "Walk - drains energy.\n";
        menu += "Clean - cleans litter completely \n";
        menu += "Add a dragon - Lets you add a dragon to the Shelter\n";

        menu += "Doctor - Restores an animals health to 100.\n";
        menu += "Adopt - Take one home with you!\n";
        menu += "Train All Organic  - Lowers all energy(not for robots they never tire.) \n";
        menu += "Oil Robot - Raises Oil LVl of Robot. \n";
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

        System.out.println("How healthy is it?");
        scanner = new Scanner(System.in);
        int newHealth = scanner.nextInt();

        System.out.println("How dirty is it?");
        scanner = new Scanner(System.in);
        int newLitter = scanner.nextInt();

        System.out.println("What type is it?");
        scanner = new Scanner(System.in);
        String newType = scanner.nextLine();

        System.out.println("How much energy does it have?");
        scanner = new Scanner(System.in);
        int newEnergy = scanner.nextInt();


        OrganicDragon newDragon = new OrganicDragon(nameOfNewPet, newHealth, newType, newEnergy, newHealth, newLitter) {



            @Override
            void doctorPetByName() {
            }
        };
        shelter.addPet(newDragon);

        return newDragon;
    }

    public static void AdoptAnAnimal() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which dragon would you like to adopt?");
        shelter.viewPetList();
        String petNameToAdopt = userInput.nextLine();
        shelter.adoptPetByName(petNameToAdopt);
    }

}







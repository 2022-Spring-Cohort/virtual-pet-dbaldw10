package VirtualPet;

import java.util.ArrayList;

public class VirtualDragonShelter {

    ArrayList<Animal> animalList;

    public VirtualDragonShelter() {
        animalList = new ArrayList<>();

        animalList.add(new OrganicDragon("Zallon", "ebony", 1109, "electric", 99, 100, 20));
        animalList.add(new OrganicDragon("Freddy", "silver", 309, "ice", 10, 100, 35));
        animalList.add(new OrganicDragon("Bekah", "rainbow", 35, "fire", 100, 100, 45));
        animalList.add(new OrganicDragon("Lyric", "blue", 3, "fire", 70, 100, 50));
        animalList.add(new RobotDragon("Zachary", 100, 99, 50));
        animalList.add(new OrganicTurkey("Choppy", "gold", 10, "fire", 100, 25));
        animalList.add(new RobotTurkey("Zhoppy", 100, 3, 90, 30, 99));

    }

    public void getPetsStatus() {
        for (Animal currentAnimal : animalList) {
            System.out.println(currentAnimal.getStatus());
            ;
        }
    }

    public void viewPetList() {
        for (Animal currentAnimal : animalList) {
            System.out.println(currentAnimal.getName());
        }
    }

    public void viewRobots() {
        for (Animal currentAnimal : animalList) {
            if (currentAnimal instanceof Robot)
                System.out.println(currentAnimal.getName());
        }
    }

    public void viewOrganicAnimals() {
        for (Animal currentAnimal : animalList) {
            if (currentAnimal instanceof Organic)
                System.out.println(currentAnimal.getName());
        }

    }

    public void walkPetByName(String name) {
        findAnimalByName(name).walk();

    }

    public void doctorPetByName(String name) {
        findAnimalByName(name).doctorPetByName();
    }

    public void trainAllDragons() {
        for (Animal currentDragon : animalList) {
            if (currentDragon instanceof Dragon)
                ((Dragon) currentDragon).trainAllDragon();
        }

    }

    public RobotDragon findRobotDragonByName(String name) {
        RobotDragon selectedRobot = null;
        for (Animal currentDragon : animalList) {
            if (currentDragon instanceof RobotDragon)
                selectedRobot = (RobotDragon) currentDragon;
        }
        return selectedRobot;
    }

    public Animal findAnimalByName(String name) {
        Animal selectedAnimal = null;
        for (Animal currentAnimal : animalList) {
            if (currentAnimal instanceof Animal)
                selectedAnimal = (Animal) currentAnimal;
        }
        return selectedAnimal;
    }

    public void oilDragonByName(String name) {
        findRobotDragonByName(name).oilRobot();

    }

    public void cleanLitterBoxByName(String name) {
        findOrganicAnimalByName(name).cleanLitter();

    }

    public Organic findOrganicAnimalByName(String name) {
        Organic selectedRobot = null;
        for (Animal currentDragon : animalList) {
            if (currentDragon instanceof Organic)
                selectedRobot = (Organic) currentDragon;

        }
        return selectedRobot;
    }

    private Dragon findDragonByName(String name) {
        Dragon selectedDragon = null;
        for (Animal currentDragon : animalList) {
            if (currentDragon.getName().equalsIgnoreCase(name)) {
                selectedDragon = (Dragon) currentDragon;
            }
        }
        return selectedDragon;
    }


    public void adoptPetByName(String name) {
        animalList.remove(findDragonByName(name));
    }

    public void addPet(Animal newPet) {
        animalList.add(newPet);
    }

    public boolean allAnimalsHealthy() {
        for (Animal currentAnimal : animalList) {
            if (currentAnimal instanceof Animal)
                if (currentAnimal.getHealth() <= 0) {
                    return false;
                }
        }
        return true;
    }

    public void feedAnimalByName(String name) {
        findAnimalByName(name).feed();
        }
    }

package VirtualPet;

public abstract class Animal {
    String name;
    static int health;

    public Animal(String name, int health) {
        this.name = "";
        this.health = 75;
    }

    abstract void walk();

    abstract void animalSound();


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getStatus() {
        return name + " " + health;
    }

    public static void tick() {
        health -= 5;
    }

    abstract void feed();

    public void doctorPetByName() {
        health = 100;
    }
}





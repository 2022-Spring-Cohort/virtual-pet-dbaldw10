package VirtualPet;

public abstract class Animal {
    String name;
    int health;

    public Animal(String name, int health) {
        this.name = "";
        this.health = health;
    }

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

    abstract void feed();

    abstract void doctorPetByName();
    

    public void tick(){
        health -= 10;
    }

    public abstract void walk();
}





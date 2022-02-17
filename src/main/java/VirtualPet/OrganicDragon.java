package VirtualPet;

public class OrganicDragon extends Dragon implements Organic{

    String favoriteFood;
    int hunger;
    int litter;
    int energy;

    public OrganicDragon(String name, int age, String type, int energy, int health, int litter) {

        super(name, age, energy, health);

        this.favoriteFood = "pizza";
        this.litter = litter;
        this.energy = energy;
        this.health = health;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getStatus() {
        String statusMessage = "name: " + name + " |" + " healthLVL: " + health + " |" + "litterLVL: " + litter + " |" + "energy: " + getEnergy();

        return statusMessage;
    }


    public void tick() {
        health -= 10;
    }


    @Override
    public void walk(){
        litter -= 10;
        energy -= 20;
        health -= 10;
    }

    @Override
    public void animalSound() {

    }

    @Override
    public void cleanLitter() {
        litter = 0;
    }

    public void feed() {
        hunger -= 10;
    }

    @Override
    public void doctorAnimal() {
        health = 100;
    }

}
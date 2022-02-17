package VirtualPet;

public class OrganicTurkey extends Turkey implements Organic {

    String favoriteFood;
    int hunger;
    String turkeyName;
    int litter;

    public OrganicTurkey(String name, String featherColor, int age, String type, int energy, int health, int litter) {
        super(name, health, energy, age);
        this.favoriteFood = "pizza";
        this.hunger = 15;
        this.name = name;
        this.litter = litter;
        this.health = health;
        this.energy = energy;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getTurkeyName() {
        return turkeyName;
    }


    public void walk() {
        litter -= 10;
        energy -= 20;
    }

   public void animalSound() {
       System.out.println("gobble gobble");

    }
    @Override
    public void cleanLitter() {
        litter = 0;

    }
    public void tick() {
        health -= 10;
    }


    public void feed() {
        hunger -= 10;
    }

    @Override
    void doctorPetByName() {

    }

    @Override
    public void doctorAnimal() {
        health = 100;
    }

    public String getStatus() {
        String statusMessage = "name: " + name + "|" + " healthLVL: " + health + "|" + "litterLVL: " + litter + "|" + "favorite food: " + favoriteFood ;

        return statusMessage;

    }
}

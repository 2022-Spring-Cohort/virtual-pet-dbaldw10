package VirtualPet;

public class OrganicTurkey extends Turkey implements Organic {

    String favoriteFood;
    int hunger;
    String turkeyName;
    int litter;

    public OrganicTurkey(String name, String featherColor, int age, String type, int energy, int health) {
        super(name, health, energy, age);
        this.favoriteFood = "pizza";
        this.hunger = 15;
        this.name = "greg";
        this.litter = 0;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getTurkeyName() {
        return turkeyName;
    }


    public void walk() {
        litter -= 10;
    }

   public void animalSound() {
       System.out.println("gobble gobble");

    }

    public void cleanLitter() {

    }


    public void feed() {
        hunger -= 10;
    }

    public String getStatus() {
        String statusMessage = "name: " + name + "|" + " healthLVL: " + health + "|" + "favorite food: " + favoriteFood + "|" + "litterLVL: " + litter;

        return statusMessage;

    }
}

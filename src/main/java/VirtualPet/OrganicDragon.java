package VirtualPet;

public class OrganicDragon extends Dragon {

    String favoriteFood;
    int hunger;
    int litter;
    int energy;

    public OrganicDragon(String name, String scaleColor, int age, String type, int energy, int health, int hunger) {

        super(name, age, energy, health);

        this.favoriteFood = "pizza";
        this.hunger = 15;
        this.litter = 0;
        this.energy = energy;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getStatus() {
        String statusMessage = "name: " + name + " |" + " healthLVL: " + health + " |" + "litterLVL: " + litter + " |" + "energy: " + getEnergy();

        return statusMessage;
    }
    public void walk(){
        litter -= 10;
    }
    public void feed() {
        hunger -= 10;
    }
}
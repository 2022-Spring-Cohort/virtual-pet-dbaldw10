package VirtualPet;


public class Dragon extends Animal{
    int age;
    String type;
    int energy;
    int hunger;

    public Dragon(String name, int age, int energy, int health) {
        super(name, health);


        this.name = name;
        this.age = age;
        this.type = type;
        this.energy = energy;
        this.health = health;
    }

    public  String getDragonName() {
        return name;
    }

    public  int getAge() {
        return age;
    }

    public  String getType() {
        return type;
    }

    public  int getEnergy() {
        return energy;
    }



    public  int getHealth() {
        return health;
    }


    public void trainAllDragon() {
        energy -= 10;
    }
    public  void fightABoss(){
         energy -= 30;
         health -= 33;
    }
    public void tick3() {
        age ++;
    }
    public void doctorPetByName(){
        health = 100;
        energy = 100;
    }
    public void walk(){
        energy -= 50;
    }

    @Override
    void animalSound() {


        }

    public String getStatus() {
        String statusMessage = name +  " hungerLvl: " + hunger + " healthLVL: " +
                "" + health ;

        return statusMessage;
    }

    @Override
    void feed() {

    }


}
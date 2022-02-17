package VirtualPet;


public abstract class Dragon extends Animal{
    int age;
    String type;
    int energy;
    int hunger;
    int health;

    public Dragon(String name, int age, int energy, int health) {
        super(name, health);


        this.name = name;
        this.age = age;
        this.type = type;
        this.energy = energy;
        this.health = health;

    }

    public  String getName() {
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
        health -= 10;
    }


     void doctorPetByName(){
        health = 100;
        energy = 100;
    }

    @Override
    void animalSound() {


        }

    @Override
    void feed() {

    }


}
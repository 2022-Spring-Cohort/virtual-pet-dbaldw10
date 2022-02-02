package VirtualPet;


public class Dragon {
    public String dragonName;
    private  String scaleColor;
    private int age;
    private  String type;
    private int hunger;
    private int energy;
    private int health;

    public Dragon(String dragonName, String scaleColor, int age, int hunger, String type, int energy, int health) {
        this.dragonName = dragonName;
        this.scaleColor = scaleColor;
        this.age = age;
        this.hunger = 45;
        this.type = type;
        this.energy = energy;
        this.health = health;
    }

    public  String getDragonName() {
        return dragonName;
    }

    public  String getScaleColor() {
        return scaleColor;
    }

    public  int getAge() {
        return age;
    }

    public  String getType() {
        return type;
    }

    public  int getHunger() {
        return hunger;
    }

    public  int getEnergy() {
        return energy;
    }

    public  int getHealth() {
        return health;
    }

    public void trainAllDragon() {
        hunger+= 10;
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



    public String greeting() {
        String ageMessage = "";
        if (age < 100) {
            ageMessage = "\nI am a young dragon baby";
        } else if (age > 100 && age < 500) {
            ageMessage = "\nI am a middle aged dragon";
        }
        {
            return "My name is" + dragonName + "\n my fur color is: " + scaleColor + "and I am " + age + " years old."
                    + ageMessage;
        }
    }
    public String getStatus() {
        String statusMessage = dragonName + " scale color: " + scaleColor + " age: " + age + " type: " + type + " hungerLvl: " + hunger + " energyLvl: " + energy + " healthLVL: " +
                "" + health;

        return statusMessage;
    }



}
package VirtualPet;

public class Dragon {
    private String dragonName;
    private String scaleColor;
    private int age;
    private String type;
    private int hunger;
    private int energy;

    public Dragon(String dragonName, String scaleColor, int age, int hunger, String type, int energy) {
        this.dragonName = dragonName;
        this.scaleColor = scaleColor;
        this.age = age;
        this.hunger = 45;
        this.type = type;
        this.energy = energy;
    }

    public String getDragonname() {
        return dragonName;
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public int getHunger() {
        return hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public void tick() {
        hunger++;
    }
    public void tick2(){
         energy -= 30;
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
}
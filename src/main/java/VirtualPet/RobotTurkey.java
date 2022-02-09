package VirtualPet;


public class RobotTurkey extends Turkey implements Robot{
    int experience;
    int energyLVL;
    int powerLVL;
    int oilLVL;

    public RobotTurkey(String name,int  health,int  powerLVL,int  oilLVL, int energyLVL, int experience) {
        super(name, health, powerLVL, oilLVL);

        this.name = name;
        this.health = health;
        this.oilLVL = 100;
        this.powerLVL = 1000;
        this.energyLVL = 75;
        this.experience = 100;

    }

    public int getPowerLVL() {
        return powerLVL;
    }

    public int getOilLVL() {
        return oilLVL;
    }

    public void oilRobot(){
        oilLVL -= 10;
    }


    public void walk() {
        oilLVL += 10;
    }


    public void animalSound() {
    this.animalSound();
    }
    public String getStatus() {
        String statusMessage = "name: " + name + " |" + " healthLVL: " +  health + " |" + "oilLVL: " + oilLVL + " |" + "powerLVL: " + powerLVL;

        return statusMessage;
    }

}

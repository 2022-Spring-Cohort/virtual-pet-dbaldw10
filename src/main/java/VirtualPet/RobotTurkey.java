package VirtualPet;


public class RobotTurkey extends Turkey implements Robot{
    int experience;
    int energyLVL;
    int powerLVL;
    int oilLVL;
    int health;

    public RobotTurkey(String name,int  health,int  powerLVL,int  oilLVL, int energyLVL, int experience) {
        super(name, health, powerLVL, oilLVL);

        this.name = name;
        this.health = health;
        this.oilLVL = oilLVL;
        this.powerLVL = powerLVL;
        this.energyLVL = energyLVL;
        this.experience = experience;

    }

    public int getPowerLVL() {
        return powerLVL;
    }

    public int getOilLVL() {
        return oilLVL;
    }

    @Override
    public void oilRobot(){
        oilLVL += 10;
    }


    public void walk() {
        oilLVL += 10;
        energyLVL -= 20;
    }


    public void animalSound() {
    this.animalSound();
    }
    public String getStatus() {
        String statusMessage = "name: " + name + " |" + " healthLVL: " +  health + " |" + "oilLVL: " + oilLVL + " |" + "powerLVL: " + powerLVL;

        return statusMessage;
    }
    public void tick() {
        health -= 10;
    }

    @Override
    void doctorPetByName() {
        health = 100;
    }


}

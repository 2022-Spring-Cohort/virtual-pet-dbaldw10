package VirtualPet;


public class RobotDragon extends Dragon implements Robot {


     int energy;
     int oilLVL;
     int powerLVL;

    public RobotDragon(String name, int health, int powerLVL, int oilLVL) {
        super(name, health, powerLVL, oilLVL);

        this.name = name;
        this.health = health;
        this.energy = energy;
        this.oilLVL = oilLVL;
        this.powerLVL = powerLVL;
    }



    public String getStatus() {
        String statusMessage = "name: " + name + " |" + " health: " + health + " |" + " oilLvl: " + oilLVL + " powerLVL: " + powerLVL;

        return statusMessage;
    }

    @Override
    public void oilRobot() {

    }

    public void walk(){

    }


    public void animalSound() {
        this.animalSound();

    }
}

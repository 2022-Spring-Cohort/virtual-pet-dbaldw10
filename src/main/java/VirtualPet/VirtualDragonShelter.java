package VirtualPet;

import java.util.ArrayList;

public class VirtualDragonShelter {

    ArrayList<Dragon> petList;

    public VirtualDragonShelter() {
        petList = new ArrayList<>();
        petList.add( new Dragon("Zallon", "ebony", 1109, 3, "electric", 99, 100));
        petList.add(new Dragon("Freddy", "silver", 309, 25, "ice", 10, 100));
        petList.add(new Dragon("Bekah", "rainbow", 35, 99, "fire", 100, 100));
        petList.add(new Dragon("Lyric", "blue", 3, 12, "fire", 70, 100));
    }




    public void viewPetList() {
        for (Dragon dragon : petList){
            System.out.println(dragon.getDragonName());
        }
    }
    public void walkPetByName(String name){
        findDragonByName(name).walk();
    }
    public void doctorPetByName(String name){
        findDragonByName(name).doctorPetByName();
    }
    public void trainAllDragons(){
        for(Dragon currentDragon: petList){
            currentDragon.trainAllDragon();
                    }

    }

    public void removePetByName(String pet) {


    }

    private Dragon findDragonByName(String name) {
        Dragon selectedDragon = null;
        for (Dragon currentDragon:petList) {
            if(currentDragon.getDragonName().equalsIgnoreCase(name)){
                selectedDragon = currentDragon;
            }
        }
        return selectedDragon;
    }


   public void adoptPetByName(String name){
        petList.remove(findDragonByName(name));
    }
    public void addPet(Dragon pet){
        petList.add(pet);
    }
    public boolean allDragonsHealthy(){
        for(Dragon currentDragon: petList){
            if(currentDragon.getHealth() <= 0){
                return false;
            }
        }
        return true;
    }
    public String getPetsStatus(){
        String petsStat = "";
        for(Dragon currentDragon: petList){
            petsStat += currentDragon.getStatus() + "\n";
        }
        return petsStat;
    }

    public void fightABoss(String name) {
        findDragonByName(name).fightABoss();
    }
}
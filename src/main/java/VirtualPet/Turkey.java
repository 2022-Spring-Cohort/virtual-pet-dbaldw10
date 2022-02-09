package VirtualPet;

    public class Turkey extends Animal {
         String featherColor;
         int age;
         int energy;
         int litter;


        public Turkey(String name, int age, int energy, int health) {
            super(name, health);
            this.name = name;
            this.featherColor = featherColor;
            this.age = age;
            this.energy = energy;
            this.health = health;
        }


        public int getEnergy() {
            return energy;
        }

                @Override
        void animalSound() {

        }

        public int getHealth() {
            return health;
        }



        public String getStatus() {
            String statusMessage = name + " scale color: " + featherColor + " age: " + age + " hungerLvl: " + " energyLvl: " + energy + " healthLVL: " +
                    "" + health;

            return statusMessage;
        }

        @Override
        void feed() {
        }

        public void walk(){
            litter -= 10;
        }

    }

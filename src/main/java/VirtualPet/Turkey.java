package VirtualPet;

    public abstract class Turkey extends Animal {
         String featherColor;
         int age;
         int energy;
         int health;


        public Turkey(String name, int age, int energy, int health) {
            super(name, health);
            this.name = name;
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

        @Override
        public void tick() {

        }

        @Override
        void feed() {
        }

        @Override
        abstract void doctorPetByName();

    }

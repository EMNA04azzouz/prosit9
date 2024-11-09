public class Zoo {
    public static final int NUMBER_OF_CAGES = 25;
    public static final int NUMBER_OF_AQUATIC_ANIMALS = 10;
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimals;
    private Aquatic[] aquaticAnimals;
    private int nbrAquaticAnimals;

    public Zoo() {}
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        //this.nbrAnimals = nbrAnimals;
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new Aquatic[NUMBER_OF_AQUATIC_ANIMALS];
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getNbrAnimals() {
        return nbrAnimals;
    }
    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }
    public Animal[] getAnimals() {
        return animals;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }


    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }
    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;

    }
    public int getNbrAquaticAnimals() {
        return nbrAquaticAnimals;
    }
    public void setNbrAquaticAnimals(int nbrAquaticAnimals) {
        this.nbrAquaticAnimals = nbrAquaticAnimals;
    }


    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName().equals(animals[i].getName()))



                return i;

        }
        return index;

    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
            if (isZooFull())
                return false;
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;

}

public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i+1];

        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
}

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAnimals == NUMBER_OF_AQUATIC_ANIMALS)
        {
            System.out.println("Aquatic section is full");
        }
        else{
            aquaticAnimals[nbrAnimals] = aquatic;
            nbrAquaticAnimals++;
            System.out.println(aquatic.getName()+" has been added to the aquatic section");
        }

    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0f;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (maxDepth < penguin.getSwimmingDepth())
                    maxDepth = penguin.getSwimmingDepth();
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int nbrPenguins = 0;
        int nbrDolphins = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            }
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
        }
        System.out.println("Le Zoo " + name + " contient " + nbrDolphins + " dauphins et " + nbrPenguins + " pingouins");
    }

}


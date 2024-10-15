public class Zoo {
    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimals;

    public Zoo() {}
    public Zoo(String name, String city, int nbrAnimals) {
        this.name = name;
        this.city = city;
        this.nbrAnimals = nbrAnimals;
        animals = new Animal[NUMBER_OF_CAGES];
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

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

}

public abstract class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs;
public Terrestrial() {
    super();
}
public Terrestrial(String name, String family, int age, boolean isMammal,int nbrLegs) {
    super(name, family, age, isMammal);
    this.nbrLegs = nbrLegs;
}
public int getNbrLegs() {
    return nbrLegs;
}
public void setNbrLegs(int nbrLegs) {
    this.nbrLegs = nbrLegs;
}
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println("Terrestrial eats meat.");
        } else {
            System.out.println("Terrestrial doesn't eat this type of food.");
        }
    }

    public void eatPlant(Food plant) {
        if (plant == Food.PLANT) {
            System.out.println("Terrestrial eats plant.");
        } else {
            System.out.println("Terrestrial doesn't eat this type of food.");
        }
    }


    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("Terrestrial eats both plant and meat.");
        } else {
            System.out.println("Terrestrial eats only one type of food.");
        }
    }
}
















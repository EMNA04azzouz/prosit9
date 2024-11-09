public class Aquatic extends Animal implements Carnivore<Food> {
    protected String habitat;
    public Aquatic() {}
    public Aquatic(String name, String family, int age, boolean isMammal, String habitat) {
        super(name, family, age, isMammal);
        this.habitat = habitat;

    }
    /*public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;

    }*/

    //public abstract void swim();

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Aquatic aquatic) {
            return aquatic.habitat.equals(habitat) && aquatic.getName().equals(super.getName()) && aquatic.getAge() == super.getAge();
        }
        return false;
    }

    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }

    public void swim() {
        System.out.println("The " + getName() + " swims in the " + habitat + ".");
    }


        public void eatMeat(Food meat) {
            if (meat == Food.MEAT) {
                System.out.println("Aquatic eats meat.");
            } else {
                System.out.println("Aquatic doesn't eat this type of food.");
            }
        }



}

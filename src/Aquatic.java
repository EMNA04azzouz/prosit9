public class Aquatic extends Animal {
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
}

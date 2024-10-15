public class Animal {
    private String name;
    private String family;
    private int age;
    private boolean isMammal;
    public Animal() {}
    public Animal(String name, String family, int age, boolean isMammal) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0)
            System.out.println("The age must a positive number");
        else
            this.age = age;
    }
    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

}

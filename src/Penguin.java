public class Penguin extends Aquatic {
    private float swimmingDepth;
    public Penguin() {}
    public Penguin(String name, String family, int age, boolean isMammal , String habitat,float swimmingDepth) {
        super(name, family, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public String toString() {
        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }


}

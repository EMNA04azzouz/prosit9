public class Dolphin extends Aquatic {
    private float swimmingSpeed;
    public Dolphin() {}
    public Dolphin(String name, String family, int age, boolean isMammal , String habitat,float swimmingSpeed) {
        super(name,family,age,isMammal,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public String toString() {
        return super.toString() + ", swimmingSpeed:" + swimmingSpeed;
    }
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}

public class Terrestrial extends Animal {
private int nbrLegs;
public Terrestrial() {

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

}

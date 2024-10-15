public class ZooManagement {
    int nbrCages = 20;
    String zooName = "My Zoo";



    void displayInformation(){
        System.out.println(zooName + " has " + nbrCages + " cages");
    }

    Animal lion = new Animal("felines", "lion", 14, true);
    Zoo myZoo = new Zoo("My Awesome Zoo", "Tunis", 0);
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

           /* ZooManagement zm = new ZooManagement();

            Scanner sc = new Scanner(System.in);
            System.out.println("Insert the number of cages");

            int numberOfCages = sc.nextInt();

            System.out.println("Insert the name of the zoo");

            String nameOfZoo = sc.next();

            zm.nbrCages = numberOfCages;
            zm.zooName = nameOfZoo;

            zm.displayInformation();*/
        Animal lion = new Animal("felines", "lion", -1, true);
        System.out.println("Animal: " + lion.getName() + ", Family: " + lion.getFamily() +
                ", Age: " + lion.getAge() + ", Is Mammal: " + lion.isMammal());
        Zoo myZoo = new Zoo("My Awesome Zoo", "Tunis", 0);
        System.out.println("Name :" + myZoo.getName() + ", city: " + myZoo.getCity() +
                ", nbrAnimals: " + myZoo.getNbrAnimals());

        Zoo notMyZoo = new Zoo("WaterPark", "Siliana" ,4);
        System.out.println("Name :" + notMyZoo.getName() + ", city: " + notMyZoo.getCity() + ", nbrAnimals: " + myZoo.getNbrAnimals());

        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        System.out.println("Animal: " + dog.getName() + ", Family: " + dog.getFamily() +
                ", Age: " + dog.getAge() + ", Is Mammal: " + dog.isMammal());
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        System.out.println("-------------------------------------------------------");
        Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);


        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);



        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}

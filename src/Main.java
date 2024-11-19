import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Employe e1 = new Employe(1,"azzouz","emna","test",1);
        Employe e2 = new Employe(2,"porto","fatma","aaa",2);

        System.out.println(e1.toString());
        System.out.println(e1.equals(e2));

        SocieteArrayList GestionEmployes = new SocieteArrayList();
        GestionEmployes.ajouterEmploye(e1);
        GestionEmployes.ajouterEmploye(e2);

        System.out.println("Employee found by object: " +
                GestionEmployes.rechercherEmploye(new Employe(2, "porto", "fatma", "aaa", 2)));
        GestionEmployes.displayEmploye();
        GestionEmployes.supprimerEmploye(new Employe(3,"porto","fatma","aaa",3));
        GestionEmployes.displayEmploye();
        System.out.println("list par nom:" + GestionEmployes.rechercherEmploye("azzouz"));
        GestionEmployes.trierEmployeParId();
        GestionEmployes.displayEmploye();
        GestionEmployes.trierEmployeParNomDépartementEtGrade();
        GestionEmployes.displayEmploye();
    }
}
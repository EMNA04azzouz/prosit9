import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements Gestion<Employe> {
    private ArrayList<Employe> employees;

    public SocieteArrayList() {
        employees = new ArrayList<>();
    }
    @Override
    public void ajouterEmploye (Employe e){
            employees.add(e);
        }
        @Override
        public boolean rechercherEmploye (String nom){
            for (int i = 0; i < this.employees.size(); i++) {
                if (this.employees.get(i).getNom().equals(nom)) {
                    return true;
                }
            }


            return false;
        }
        @Override
        public boolean rechercherEmploye (Employe e){
            return employees.contains(e);
        }
        @Override
        public void supprimerEmploye (Employe e)
        {
            employees.remove(e);
        }
        @Override
        public void displayEmploye () {
            System.out.println(this.employees.toString());
        }
        @Override
    public void trierEmployeParId()
    {
Collections.sort(this.employees);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        this.employees.sort(Comparator.comparing(Employe::getNom)
                .thenComparing(Employe::getNomD)
                .thenComparing(Employe::getGrade));
    }
}

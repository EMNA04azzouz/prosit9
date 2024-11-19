public interface Gestion<T> {
    public void ajouterEmploye(T e);
    public boolean rechercherEmploye(String nom);
    public boolean rechercherEmploye(T e);
    public void supprimerEmploye(T e);
    public void displayEmploye();
    public void trierEmployeParId(); //Comparable
    public void trierEmployeParNomDépartementEtGrade();
}

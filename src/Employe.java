import java.io.Serializable;

public class Employe implements Comparable<Employe>{
    private int id;
    private String nom, prenom;
    private String nomD;
    private int grade;

    public Employe() {
    }

    public Employe(int id, String nom, String prenom, String nomD, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomD = nomD;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomD() {
        return nomD;
    }

    public void setNomD(String nomD) {
        this.nomD = nomD;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    /*public boolean equals(Object obj){
        if (this==obj)
        {return true;}
        if (obj==null){return false;}
        if(getClass()!=obj.getClass()){return false;}
        final Employe other=(Employe) obj;
        if(this.id!=other.id){return false;}
        return true;
    }*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employe)) return false;
        Employe employe = (Employe) obj;
        return (id == employe.id) && (nom == employe.nom);
    }
@Override
    public String toString() {
        return "employe{" + "id=" + id + ",nom=" + nom + ",prenom=" + prenom + ",nom de departement=" + nomD + ",grade=" + grade + "}";
    }
    @Override
    public int compareTo(Employe o) {
        return this.id-o.id;
    }

}
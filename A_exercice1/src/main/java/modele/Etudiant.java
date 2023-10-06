package modele;

import java.util.List;

public class Etudiant {

    private String numEtu;

    private String prenom;

    private String nom;

    private List<Formation> formations;

    private List<Groupe> groupes;

    public Etudiant(String numEtu, String prenom, String nom) {
        this.numEtu = numEtu;
        this.prenom = prenom;
        this.nom = nom;
    }

    public Etudiant(String numEtu, String prenom, String nom, List<Formation> formations, List<Groupe> groupes) {
        this.numEtu = numEtu;
        this.prenom = prenom;
        this.nom = nom;
        this.formations = formations;
        this.groupes = groupes;
    }

    public String getNumEtu() {
        return numEtu;
    }

    public void setNumEtu(String numEtu) {
        this.numEtu = numEtu;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }

    public List<Groupe> getGroupes() {
        return groupes;
    }

    public void setGroupes(List<Groupe> groupes) {
        this.groupes = groupes;
    }
}

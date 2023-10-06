package modele;

import java.util.List;

public class Groupe {

    private int idGroupe;

    private String intituleGroupe;

    private Creneau creneau;

    private List<Etudiant> etudiants;

    public Groupe(int idGroupe, String intituleGroupe) {
        this.idGroupe = idGroupe;
        this.intituleGroupe = intituleGroupe;
    }

    public Groupe(int idGroupe, String intituleGroupe, Creneau creneau) {
        this.idGroupe = idGroupe;
        this.intituleGroupe = intituleGroupe;
        this.creneau = creneau;
    }

    public Groupe(int idGroupe, String intituleGroupe, Creneau creneau, List<Etudiant> etudiants) {
        this.idGroupe = idGroupe;
        this.intituleGroupe = intituleGroupe;
        this.creneau = creneau;
        this.etudiants = etudiants;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getIntituleGroupe() {
        return intituleGroupe;
    }

    public void setIntituleGroupe(String intituleGroupe) {
        this.intituleGroupe = intituleGroupe;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}

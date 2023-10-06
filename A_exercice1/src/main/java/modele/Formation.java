package modele;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "FORMATION")
public class Formation {

    @Id
    @Column(name = "IDFORM")
    private String idForm;

    @Column(name = "INTITULEFORM")
    private String intituleForm;

    @ManyToMany(mappedBy = "formations")
    private List<Salle> salles;

    @ManyToOne
    @JoinColumn(name = "IDGROUPE")
    private Groupe groupe;

    @ManyToMany(mappedBy = "formations")
    private List<Etudiant> etudiants;

    public Formation(String idForm, String intituleForm, List<Salle> salles, Groupe groupe, List<Etudiant> etudiants) {
        this.idForm = idForm;
        this.intituleForm = intituleForm;
        this.salles = salles;
        this.groupe = groupe;
        this.etudiants = etudiants;
    }

    public Formation() {

    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public String getIdForm() {
        return idForm;
    }

    public void setIdForm(String idForm) {
        this.idForm = idForm;
    }

    public String getIntituleForm() {
        return intituleForm;
    }

    public void setIntituleForm(String intituleForm) {
        this.intituleForm = intituleForm;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public void setSalles(List<Salle> salles) {
        this.salles = salles;
    }
}

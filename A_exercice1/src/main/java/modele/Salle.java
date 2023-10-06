package modele;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SALLE")
public class Salle {

    @Id
    @GeneratedValue
    @Column(name = "IDSALLE")
    private int idSalle;

    @Column(name = "NUMSALLE")
    private String numSalle;

    @Column(name = "CAPACITE")
    private int capacite;

    @ManyToOne
    @JoinColumn(name = "IDBATIMENT")
    private Batiment batiment;

    @ManyToOne
    @JoinColumn(name = "IDCRENEAU")
    private Creneau creneau;

    @OneToMany(mappedBy = "salle")
    private List<Formation> formations;

    public Salle(String numSalle, int capacite, Batiment batiment) {
        this.numSalle = numSalle;
        this.capacite = capacite;
        this.batiment = batiment;
    }

    public Salle(String numSalle, int capacite) {
        this.numSalle = numSalle;
        this.capacite = capacite;
    }

    public Salle(String numSalle, int capacite, Batiment batiment, Creneau creneau, List<Formation> formations) {
        this.numSalle = numSalle;
        this.capacite = capacite;
        this.batiment = batiment;
        this.creneau = creneau;
        this.formations = formations;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }

    public String getNumSalle() {
        return numSalle;
    }

    public void setNumSalle(String numSalle) {
        this.numSalle = numSalle;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Batiment getBatiment() {
        return batiment;
    }

    public void setBatiment(Batiment batiment) {
        this.batiment = batiment;
    }
}

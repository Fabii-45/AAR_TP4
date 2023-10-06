package modele;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BATIMENT")
public class Batiment {

    @Id
    @GeneratedValue
    @Column(name = "IDBATIMENT")
    private int idBatiment;
    @Column(name = "NOMBATIMENT",nullable = false)
    private String nomBatiment;

    @ManyToOne
    @JoinColumn(name = "IDUFR")
    private Ufr monUfr;

    @OneToMany
    @JoinColumn(name = "IDBATIMENT")
    private List<Salle> salles;

    public Batiment(int idBatiment, String nomBatiment, Ufr monUfr) {
        this.idBatiment = idBatiment;
        this.nomBatiment = nomBatiment;
        this.monUfr = monUfr;
    }

    public Batiment(int idBatiment, String nomBatiment) {
        this.idBatiment = idBatiment;
        this.nomBatiment = nomBatiment;
    }

    public Batiment(int idBatiment, String nomBatiment, Ufr monUfr, List<Salle> salles) {
        this.idBatiment = idBatiment;
        this.nomBatiment = nomBatiment;
        this.monUfr = monUfr;
        this.salles = salles;
    }

    public Batiment() {

    }

    public int getIdBatiment() {
        return idBatiment;
    }

    public void setIdBatiment(int idBatiment) {
        this.idBatiment = idBatiment;
    }

    public String getNomBatiment() {
        return nomBatiment;
    }

    public void setNomBatiment(String nomBatiment) {
        this.nomBatiment = nomBatiment;
    }

    public Ufr getMonUfr() {
        return monUfr;
    }

    public void setMonUfr(Ufr monUfr) {
        this.monUfr = monUfr;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public void setSalles(List<Salle> salles) {
        this.salles = salles;
    }
}

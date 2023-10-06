package modele;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "UFR")
public class Ufr {

    @Id
    @GeneratedValue
    @Column(name = "IDUFR")
    private int idUfr;

    @Column(name = "SIGLEUFR", nullable = false)
    private String sigleUfr;

    @OneToMany(mappedBy = "monUfr")
    private List<Batiment> batiments;

    public Ufr(int idUfr, String sigleUfr) {
        this.idUfr = idUfr;
        this.sigleUfr = sigleUfr;
    }

    public Ufr(int idUfr, String sigleUfr, List<Batiment> batiments) {
        this.idUfr = idUfr;
        this.sigleUfr = sigleUfr;
        this.batiments = batiments;
    }

    public Ufr() {

    }

    public int getIdUfr() {
        return idUfr;
    }

    public void setIdUfr(int idUfr) {
        this.idUfr = idUfr;
    }

    public String getSigleUfr() {
        return sigleUfr;
    }

    public void setSigleUfr(String sigleUfr) {
        this.sigleUfr = sigleUfr;
    }

    public List<Batiment> getBatiments() {
        return batiments;
    }

    public void setBatiments(List<Batiment> batiments) {
        this.batiments = batiments;
    }
}

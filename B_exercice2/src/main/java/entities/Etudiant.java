package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Etudiant {

    @Id
    @GeneratedValue
    private int idEtu;

    private int numETU;
    private String prenomEtu;

    private String nomEtu;

    @ManyToMany(mappedBy = "etudiants")
    private List<Groupe> groupes;

    @ManyToMany(mappedBy = "etudiants")
    private List<Formation> formations;

    public Etudiant() {
    }
}

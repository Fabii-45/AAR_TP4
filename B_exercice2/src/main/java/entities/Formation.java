package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Formation {

    @Id
    @GeneratedValue
    private int idFormation;

    private String intituleFormation;

    @ManyToMany
    private List<Etudiant> etudiants;
}

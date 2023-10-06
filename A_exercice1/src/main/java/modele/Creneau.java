package modele;

import java.time.LocalDateTime;
import java.util.List;

public class Creneau {

    private int creneau;
    private LocalDateTime debut;

    private LocalDateTime fin;

    private List<Salle> salles;

    private List<Groupe> groupes;

    public Creneau(int creneau, LocalDateTime debut, LocalDateTime fin, List<Salle> salles, List<Groupe> groupes) {
        this.creneau = creneau;
        this.debut = debut;
        this.fin = fin;
        this.salles = salles;
        this.groupes = groupes;
    }

    public Creneau(int creneau, LocalDateTime debut, LocalDateTime fin) {
        this.creneau = creneau;
        this.debut = debut;
        this.fin = fin;
    }

    public Creneau(int creneau, LocalDateTime debut, LocalDateTime fin, List<Salle> salles) {
        this.creneau = creneau;
        this.debut = debut;
        this.fin = fin;
        this.salles = salles;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public void setSalles(List<Salle> salles) {
        this.salles = salles;
    }

    public int getCreneau() {
        return creneau;
    }

    public void setCreneau(int creneau) {
        this.creneau = creneau;
    }

    public LocalDateTime getDebut() {
        return debut;
    }

    public void setDebut(LocalDateTime debut) {
        this.debut = debut;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }
}

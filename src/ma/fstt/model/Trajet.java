package ma.fstt.model;

import java.util.Date;

public class Trajet {
    private int idTrajet;
    private Date dateDepart;
    private Date dateArrive;
    private double consommation;
    private Vehicule vehicule;
    private Mission mission;

    public Trajet(int idTrajet, Date dateDepart, Date dateArrive, double consommation, Vehicule vehicule, Mission mission) {
        this.idTrajet = idTrajet;
        this.dateDepart = dateDepart;
        this.dateArrive = dateArrive;
        this.consommation = consommation;
        this.vehicule = vehicule;
        this.mission = mission;
    }

    public int getIdTrajet() {
        return idTrajet;
    }

    public void setIdTrajet(int idTrajet) {
        this.idTrajet = idTrajet;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateArrive() {
        return dateArrive;
    }

    public void setDateArrive(Date dateArrive) {
        this.dateArrive = dateArrive;
    }

    public double getConsommation() {
        return consommation;
    }

    public void setConsommation(double consommation) {
        this.consommation = consommation;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    @Override
    public String toString() {
        return "Trajet{" +
                "idTrajet=" + idTrajet +
                ", dateDepart=" + dateDepart +
                ", dateArrive=" + dateArrive +
                ", consommation=" + consommation +
                ", vehicule=" + vehicule +
                ", mission=" + mission +
                '}';
    }
}

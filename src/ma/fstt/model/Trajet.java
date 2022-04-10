package ma.fstt.model;

import java.util.Date;

public class Trajet {
    private int idTrajet;
    private String dateDepart;
    private String dateArrive;
    private double consommation;
    private int idVehicule;
    private int idMission;

    public Trajet(String dateDepart, String dateArrive, double consommation, int idVehicule, int idMission) {
        this.dateDepart = dateDepart;
        this.dateArrive = dateArrive;
        this.consommation = consommation;
        this.idVehicule = idVehicule;
        this.idMission = idMission;
    }

    public Trajet() {

    }

    public int getIdTrajet() {
        return idTrajet;
    }

    public void setIdTrajet(int idTrajet) {
        this.idTrajet = idTrajet;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getDateArrive() {
        return dateArrive;
    }

    public void setDateArrive(String dateArrive) {
        this.dateArrive = dateArrive;
    }

    public double getConsommation() {
        return consommation;
    }

    public void setConsommation(double consommation) {
        this.consommation = consommation;
    }

    public int getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
    }

    public int getIdMission() {
        return idMission;
    }

    public void setIdMission(int idMission) {
        this.idMission = idMission;
    }

    @Override
    public String toString() {
        return "Trajet{" +
                "idTrajet=" + idTrajet +
                ", dateDepart=" + dateDepart +
                ", dateArrive=" + dateArrive +
                ", consommation=" + consommation +
                ", vehicule=" + idVehicule +
                ", mission=" + idMission +
                '}';
    }
}

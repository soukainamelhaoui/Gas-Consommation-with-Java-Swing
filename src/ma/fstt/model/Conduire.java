package ma.fstt.model;

import java.util.*;

public class Conduire {
    private int id_conduire;
    private Date date_prise;
    private Date date_depot;
    private Vehicule vehicule;
    private Chauffeur chauffeur;

    public Conduire(Date date_prise, Date date_depot, Vehicule vehicule, Chauffeur chauffeur, int id_conduire) {
        this.date_prise = date_prise;
        this.date_depot = date_depot;
        this.vehicule = vehicule;
        this.chauffeur = chauffeur;
        this.id_conduire = id_conduire;
    }

    public Date getDate_prise() {
        return date_prise;
    }

    public void setDate_prise(Date date_prise) {
        this.date_prise = date_prise;
    }

    public Date getDate_depot() {
        return date_depot;
    }

    public void setDate_depot(Date date_depot) {
        this.date_depot = date_depot;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }

    @Override
    public String toString() {
        return "Conduire{" +
                "date_prise=" + date_prise +
                ", date_depot=" + date_depot +
                ", vehicule=" + vehicule +
                ", chauffeur=" + chauffeur +
                '}';
    }
}

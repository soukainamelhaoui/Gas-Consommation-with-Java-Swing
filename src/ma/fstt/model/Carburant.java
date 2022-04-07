package ma.fstt.model;
import java.util.*;

public class Carburant {
    private int idCarburant;
    private String libelle;
    private double pu;
    private Date date;
    private double quantity;
    private Vehicule vehicule;

    public Carburant(int idCarburant, String libelle, double pu, Date date, double quantity, Vehicule vehicule){
        this.idCarburant = idCarburant;
        this.libelle = libelle;
        this.pu = pu;
        this.date = date;
        this.quantity = quantity;
        this.vehicule = vehicule;
    }

    public int getIdCarburant() {
        return idCarburant;
    }

    public void setIdCarburant(int idCarburant) {
        this.idCarburant = idCarburant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPu() {
        return pu;
    }

    public void setPu(double pu) {
        this.pu = pu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    @Override
    public String toString() {
        return "Carburant{" +
                "idCarburant=" + idCarburant +
                ", libelle='" + libelle + '\'' +
                ", pu=" + pu +
                ", date=" + date +
                ", quantity=" + quantity +
                '}';
    }
}

package ma.fstt.model;
import java.util.*;

public class Carburant {
    private int idCarburant;
    private String libelle;
    private double pu;
    private String date;
    private double quantity;
    private int idVehicule;

    public Carburant(String libelle, double pu, String date, double quantity, int idVehicule){
        this.idCarburant = idCarburant;
        this.libelle = libelle;
        this.pu = pu;
        this.date = date;
        this.quantity = quantity;
        this.idVehicule = idVehicule;
    }

    public  Carburant(){}

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
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

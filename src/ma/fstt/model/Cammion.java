package ma.fstt.model;

public class Cammion extends Vehicule{
    private int capacite;
    public Cammion(int idCammion, String numero, String model, int capaRes, double poids, int capacite) {
        super(idCammion, numero, model, capaRes, poids);
        this.capacite = capacite;
    }

    public Cammion() {

    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "Cammion{" +
                "capacite=" + capacite +
                ", idVehicule=" + idVehicule +
                ", numero='" + numero + '\'' +
                ", model='" + model + '\'' +
                ", capaRes=" + capaRes +
                ", nbrSiege=" + nbrSiege +
                ", poids=" + poids +
                '}';
    }
}

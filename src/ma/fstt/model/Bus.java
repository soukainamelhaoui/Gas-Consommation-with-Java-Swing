package ma.fstt.model;

public class Bus extends Vehicule{
    private int nbrSiege;
    public Bus(int idBus, String numero, String model, int capaRes, double poids, int nbrSiege) {
        super(idBus, numero, model, capaRes, poids);
        this.nbrSiege = nbrSiege;
    }

    public Bus() {

    }

    public int getNbrSiege() {
        return nbrSiege;
    }

    public void setNbrSiege(int nbrSiege) {
        this.nbrSiege = nbrSiege;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "nbrSiege=" + nbrSiege +
                ", idVehicule=" + idVehicule +
                ", numero='" + numero + '\'' +
                ", model='" + model + '\'' +
                ", capaRes=" + capaRes +
                ", nbrSiege=" + nbrSiege +
                ", poids=" + poids +
                '}';
    }
}

package ma.fstt.model;

public class Bus extends Vehicule{
    public Bus(int idBus, String numero, String model, int capaRes, double poids) {
        super(idBus, numero, model, capaRes, poids);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "idVehicule=" + idVehicule +
                ", numero='" + numero + '\'' +
                ", model='" + model + '\'' +
                ", capaRes=" + capaRes +
                ", poids=" + poids +
                '}';
    }
}

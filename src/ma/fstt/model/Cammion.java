package ma.fstt.model;

public class Cammion extends Vehicule{
    public Cammion(int idCammion, String numero, String model, int capaRes, double poids) {
        super(idCammion, numero, model, capaRes, poids);
    }

    @Override
    public String toString() {
        return "Cammion{" +
                "idVehicule=" + idVehicule +
                ", numero='" + numero + '\'' +
                ", model='" + model + '\'' +
                ", capaRes=" + capaRes +
                ", poids=" + poids +
                '}';
    }
}

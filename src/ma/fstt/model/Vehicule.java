package ma.fstt.model;

public class Vehicule {
    protected int idVehicule;
    protected String numero;
    protected String model;
    protected int capaRes;
    protected double poids;

    public Vehicule(int idVehicule, String numero, String model, int capaRes, double poids) {
        this.idVehicule = idVehicule;
        this.numero = numero;
        this.model = model;
        this.capaRes = capaRes;
        this.poids = poids;
    }

    public int getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapaRes() {
        return capaRes;
    }

    public void setCapaRes(int capaRes) {
        this.capaRes = capaRes;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "idVehicule=" + idVehicule +
                ", numero='" + numero + '\'' +
                ", model='" + model + '\'' +
                ", capaRes=" + capaRes +
                ", poids=" + poids +
                '}';
    }
}

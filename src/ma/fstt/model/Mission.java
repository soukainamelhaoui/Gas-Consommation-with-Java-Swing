package ma.fstt.model;

public class Mission {
    private int idMission;
    private String depart;
    private String arrive;
    private double kilometrage;
    private double consommationTheo;

    public Mission(int idMission, String depart, String arrive, double kilometrage, double consommationTheo) {
        this.idMission = idMission;
        this.depart = depart;
        this.arrive = arrive;
        this.kilometrage = kilometrage;
        this.consommationTheo = consommationTheo;
    }

    public int getIdMission() {
        return idMission;
    }

    public void setIdMission(int idMission) {
        this.idMission = idMission;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public double getConsommationTheo() {
        return consommationTheo;
    }

    public void setConsommationTheo(double consommationTheo) {
        this.consommationTheo = consommationTheo;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "idMission=" + idMission +
                ", depart='" + depart + '\'' +
                ", arrive='" + arrive + '\'' +
                ", kilometrage=" + kilometrage +
                ", consommation theorique=" + consommationTheo +
                '}';
    }
}

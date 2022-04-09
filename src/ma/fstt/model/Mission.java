package ma.fstt.model;

public class Mission {
    private Integer idMission;
    private String depart;
    private String arrive;
    private Double kilometrage;
    private Double consommationTheo;

    public Mission(String depart, String arrive, Double kilometrage, Double consommationTheo) {
        this.depart = depart;
        this.arrive = arrive;
        this.kilometrage = kilometrage;
        this.consommationTheo = consommationTheo;
    }

    public Mission() {

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

    public void setKilometrage(Double kilometrage) {
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

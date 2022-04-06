package ma.fstt.model;

public class Chauffeur extends User {

    private String code;

    public Chauffeur(String nom, String prenom, String code) {
        super(nom, prenom);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Chauffeur{" +
                "code='" + code + '\'' +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}

package utcapitole.miage.tp1.model;

public class Reservation {
    private int nbPersonne;
    private String date;
    private String destination;
    private String nom;
    private String email;
    private String iban;
    private String virement;
    private boolean promo;
    private boolean condition;

    public int getNbPersonne() {
        return nbPersonne;
    }

    public void setNbPersonne(int nbPersonne) {
        this.nbPersonne = nbPersonne;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getVirement() {
        return virement;
    }

    public void setVirement(String virement) {
        this.virement = virement;
    }

    public boolean isPromo() {
        return promo;
    }

    public void setPromo(boolean promo) {
        this.promo = promo;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "nbPersonne=" + nbPersonne +
                ", date='" + date + '\'' +
                ", destination='" + destination + '\'' +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", iban='" + iban + '\'' +
                ", virement='" + virement + '\'' +
                ", promo=" + promo +
                ", condition=" + condition +
                '}';
    }
}

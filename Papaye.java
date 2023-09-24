
public class Papaye {
    private double prix;
    private String origine;

    public Papaye() {
        this.prix = 0.5; // prix en euros
        this.origine = "Hawai";
    }

    public Papaye(double prix, String origine) {
        if (prix < 0)
            this.prix = -prix; // une solution possible pour interdire les prix negatifs
        else
            this.prix = prix;

        if (origine.equals(""))
            this.origine = "Hawai"; // Espagne par défaut
        else
            this.origine = origine;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Override
    public String toString() {
        return "Papaye de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object p) { // predicat pour tester si 2 oranges sont equivalentes
        if (p != null && getClass() == p.getClass()) {
            Papaye pa = (Papaye) p;
            return (prix == pa.prix && origine.equals(pa.origine));
        }
        return false;
    }

    public boolean isSeedless() { // predicat indiquant qu'une orange a des pepins
        return false;
    }

    public static void main(String[] args) {

        Papaye papaye = new Papaye();
        papaye.setPrix(25);
        papaye.setOrigine("Mali");
        System.out.println("Ce fruit provient de :" + papaye.getOrigine());
        System.out.println("Le prix est :" + papaye.getPrix());
        System.out.println(papaye.toString());
        Object m = new Papaye();
        System.out.println(papaye.equals(m));
        System.out.println(papaye.isSeedless());

    }
}

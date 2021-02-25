public abstract class Schnecke {

    // Instantzvariablen
    private String name;
    private String rasse;
    private float speed;
    //Klassenvariable
    protected float zurueckgelegteDistanz;

    // Konstruktor
    public Schnecke(String name, String rasse, float speed) {
        this.name = name;
        this.rasse = rasse;
        this.speed = speed;// Speed wird bei der Instantzierung eingegeben.
        this.zurueckgelegteDistanz = 0;
    }

    //Instanz-Methoden was jedes Objekt kann.
    public String toString() {
        return rasse + " " + name + "ist mit" + speed +"mm/s unterwegs";
    }

    public String getName() {
        return name;
    }

    public float getSpeed() {
        return speed;
    }

    public String getRasse() {
        return rasse;
    }

    public float getZurueckgelegteDistanz() {
        return zurueckgelegteDistanz;
    }
    // + Abstrakte Instanz Methode daher nicht ausimplementiert.
    public abstract void kriechen();

}

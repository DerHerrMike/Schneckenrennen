public abstract class Schnecke {

    // Instanzvariablen
    private String name;
    private float speed;

    //Klassenvariable??
    protected float zurueckgelegteDistanz = 0;

    // Konstruktor
    public Schnecke(String name, float speed) {
        this.name = name;
        this.speed = speed;
    }

    //Instanz-Methoden was jedes Objekt kann.

    public String getName() {
        return name;
    }

    public float getSpeed() {
        return speed;
    }

    public float getZurueckgelegteDistanz() {
        return zurueckgelegteDistanz;
    }

    @Override
    public String toString() {
        return "'" +
                 name + '\'' +
                " mit der Geschwindigkeit " + speed +
                "mm/s. Die Schnecke hat " + zurueckgelegteDistanz +
                "mm zurückgelegt!"+'}';
    }

    // + Abstrakte Instanz Methode daher nicht ausimplementiert.
    public abstract void kriechen();

}

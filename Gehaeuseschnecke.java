public class Gehaeuseschnecke extends Schnecke {

    // Instantzvariable
    private String gehaeuseFarbe;


// Konstruktor + Konstruktor der Elternklasse

    public Gehaeuseschnecke(String name, float speed, String gehaeuseFarbe) {
        super(name, speed);
        this.gehaeuseFarbe = gehaeuseFarbe;
    }


    // EIGENE METHODEN DER KLASSE //
    public String getGehaeuseFarbe() {
        return gehaeuseFarbe;
    }

    @Override
    public void kriechen() {
        zurueckgelegteDistanz += getSpeed();
        System.out.printf("Gehäuseschnecke %s ist bei %.3f mm\n", getName(), getZurueckgelegteDistanz());
    }

    @Override
    public String toString() {
        return "Gehäuseschnecke '" + this.name + '\'' +
                " mit der Geschwindigkeit " + this.speed + "mm/s. Die Schnecke hat " + zurueckgelegteDistanz +
                "mm zurückgelegt!"+'}';
    }

}








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
        zurueckgelegteDistanz = zurueckgelegteDistanz + getSpeed();
        System.out.printf("Gehäuseschnecke %s ist bei %f mm\n", getName(), getZurueckgelegteDistanz());
    }
}






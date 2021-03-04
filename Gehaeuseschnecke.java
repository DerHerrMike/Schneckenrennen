import java.util.Random;

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
        Random r = new Random();
        int z = (r.nextInt(5) + 1);
        if (z == 5) {
            zurueckgelegteDistanz = zurueckgelegteDistanz+0;
            System.out.printf("Gehäuseschnecke %s hat in dieser Runde ihr Haus verloren und bleibt bei %.2f mm\n", getName(), getZurueckgelegteDistanz());
        } else {
            zurueckgelegteDistanz = zurueckgelegteDistanz + getSpeed();
            System.out.printf("Gehäuseschnecke %s ist bei %.2f mm\n", getName(), getZurueckgelegteDistanz());
        }
    }

    @Override
    public String toString() {
        return "ist die "+ this.gehaeuseFarbe + "e Gehäuseschnecke '" + this.name +
                "' mit der Geschwindigkeit " + this.speed + "mm/s. Die Schnecke hat " + zurueckgelegteDistanz +
                " Millimeter zurückgelegt!";
    }

}








public class Gehaeuseschnecke extends Schnecke {

    // Instantzvariable
    private String gehaeuseFarbe;


// Konstruktor + Konstruktor der Elternklasse
    public Gehaeuseschnecke(String name, String rasse, float speed, String gehaeuseFarbe) {
        super(name,rasse,speed);
        this.gehaeuseFarbe = gehaeuseFarbe;
    }

    // EIGENE METHODEN DER KLASSE //


    public String getGehaeuseFarbe() {
        return gehaeuseFarbe;
    }

    @Override
    public void kriechen() {
    this.zurueckgelegteDistanz = zurueckgelegteDistanz+getSpeed();
    }

    public String toString() {
        return "" + getRasse() +" "+ getName()+ " hat bereits "+zurueckgelegteDistanz+ " zurückgelegt";
    }

    public float getZurueckgelegteDistanz(){
        return zurueckgelegteDistanz;
    }


}






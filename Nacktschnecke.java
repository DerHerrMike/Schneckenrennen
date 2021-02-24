public class Nacktschnecke extends Schnecke{

    // Konstruktor plus ElternKonstruktor


    public Nacktschnecke(String name, String rasse, float speed, float zurueckgelegteDistanz) {
        super(name, rasse, speed, zurueckgelegteDistanz);
    }

    @Override // Geerbete Methode //
    public void kriechen() {
        this.zurueckgelegteDistanz = zurueckgelegteDistanz+getSpeed();
    }

    public String toString() {
        return "Schnecke "+getName()+" ("+getRasse()+", "+getSpeed()+") hat bereits "+zurueckgelegteDistanz+ " zurückgelegt";
    }

    public float getZurueckgelegteDistanz(){
        return this.zurueckgelegteDistanz;
    }
}

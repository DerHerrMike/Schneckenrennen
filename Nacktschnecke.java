public class Nacktschnecke extends Schnecke {


    // Konstruktor plus ElternKonstruktor


    public Nacktschnecke(String name, float speed) {
        super( name, speed);
    }

    @Override
    public void kriechen() {
        zurueckgelegteDistanz = zurueckgelegteDistanz + getSpeed();
        System.out.printf("Nacktschnecke %s ist bei %f mm\n", getName(), getZurueckgelegteDistanz());
    }


    public float getZurueckgelegteDistanz() {
        return zurueckgelegteDistanz;
    }

}

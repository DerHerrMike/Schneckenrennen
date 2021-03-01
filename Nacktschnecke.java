public class Nacktschnecke extends Schnecke {


    // Konstruktor plus ElternKonstruktor


    public Nacktschnecke(String name, float speed) {
        super( name, speed);
    }

    @Override
    public void kriechen() {
        zurueckgelegteDistanz += getSpeed();
        System.out.printf("Nacktschnecke %s ist bei %.3f mm\n", getName(), getZurueckgelegteDistanz());
    }


    public float getZurueckgelegteDistanz() {
        return zurueckgelegteDistanz;
    }

    @Override
    public String toString() {
        return "Nacktschnecke '" + this.name + '\'' +
                " mit der Geschwindigkeit " + this.speed + "mm/s. Die Schnecke hat " + zurueckgelegteDistanz +
                "mm zurückgelegt!";
    }

}

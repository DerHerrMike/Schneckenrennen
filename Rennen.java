
import java.util.*;
import java.util.List;


public class Rennen {

    private static float distanz;

    private final List<Schnecke> teilnehmer = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    //Konstruktor Rennen
    public Rennen(float distanz) {
        Rennen.distanz = distanz;
    }

    // Methoden
    public void addSchnecken() {

        System.out.println("Wie viele Nacktschnecken sollen teilnehmen?");
        addNacktschnecken(scanner.nextInt());
        System.out.println("Wie viele Gehäuseschnecken sollen teilnehmen?");
        addGehaueseschnecken(scanner.nextInt());
    }

    private void addNacktschnecken(int anzahlAddSchnecken) {
        int i = 0;
        while (i < anzahlAddSchnecken) {
            System.out.println("Bitte den Namen der Nacktschnecke eingeben:");
            String name = scanner.next();
            System.out.println("Bitte speed eingeben: ");
            float speed = readSpeed();
            teilnehmer.add(new Nacktschnecke(name, speed));
            ++i;
        }
    }

    private void addGehaueseschnecken(int anzahlAddSchnecken) {
        int i = 0;
        while (i < anzahlAddSchnecken) {
            System.out.println("Bitte den Namen der Gehäuseschnecke eingeben:");
            String name = scanner.next();
            System.out.println("Bitte speed eingeben: ");
            float speed = readSpeed();
            System.out.println("Farbe: ");
            String farbe = scanner.next();
            teilnehmer.add(new Gehaeuseschnecke(name, speed, farbe));
            ++i;
        }
    }

    private float readSpeed() {

        while (true) {
            try {
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Falsche Eingabe! Bitte Integer oder Float eingeben:");
                scanner.nextLine();
            }
        }
    }

    public void rennen() {

        System.out.println("**************************************");
        System.out.println();
        System.out.println("Das Rennen über " + distanz + " Millimeter startet jetzt!");
        System.out.println();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean gewonnen = false;
        while (!gewonnen) {
            for (Schnecke schnecke : teilnehmer) {
                schnecke.kriechen();
            }
            System.out.println();
            int lauf = 0;
            Schnecke leader = teilnehmer.get(lauf);

            for (Schnecke schnecke : teilnehmer) {
                if (leader.getZurueckgelegteDistanz() < schnecke.getZurueckgelegteDistanz()) {
                    leader = schnecke;
                }
                lauf++;
            }

            if (leader.getZurueckgelegteDistanz() >= distanz) {
                gewonnen = true;
                findeGewinnerDistanz(leader);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void findeGewinnerDistanz(Schnecke leader) {

        System.out.println("Gewinner " + leader);
    }

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Bitte die Distanz des Rennens in mm festlegen: ");
        Rennen rennen = new Rennen(scanner1.nextFloat());
        rennen.addSchnecken();
        rennen.rennen();
    }
}


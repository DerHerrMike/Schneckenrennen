
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


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

    private void addNacktschnecken(int anzahl) {
        int i = 0;
        while (i < anzahl) {
            System.out.println("Bitte den Namen der Nacktschnecke eingeben:");
            String name = scanner.next();
            System.out.println("Bitte speed eingeben: ");
            float speed = readSpeed();
            teilnehmer.add(new Nacktschnecke(name, speed));
            ++i;
        }
    }

    private void addGehaueseschnecken(int anzahl) {
        int i = 0;
        while (i < anzahl) {
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
        boolean success = false;
        while (!success) {
            try {
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Falsche Eingabe! Bitte Integer oder Float eingeben:");
                scanner.nextLine();
            }
        }
        return 0.0f;
    }

    public void rennen() {
        boolean gewonnen = false;
        while (!gewonnen) {
            for (Schnecke schnecke : teilnehmer) {
                schnecke.kriechen();
                if (schnecke.getZurueckgelegteDistanz() >= distanz) {
                    gewonnen = true;
                    System.out.println("Gewinner " + schnecke);
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Distanz des Rennens in mm festlegen: ");
        Rennen rennen = new Rennen(scanner1.nextFloat());
        rennen.addSchnecken();
        rennen.rennen();
    }
}

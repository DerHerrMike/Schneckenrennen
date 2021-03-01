
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Rennen {


    private static float distanz;

    private final List<Schnecke> teilnehmer = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    //Konstruktor eines Rennens
    public Rennen(float distanz) {
        Rennen.distanz = distanz;
    }


    public void addSchnecken() {

        System.out.println("Wie viele Nacktschnecken sollen teilnehmen?");
        int anzahlNacktschnecken = scanner.nextInt();
        addNacktschnecken(anzahlNacktschnecken);
        System.out.println("Wie viele Gehäuseschnecken sollen teilnehmen?");
        int anzahlGehaeuseschnecken = scanner.nextInt();
        addGehaueseschnecken(anzahlGehaeuseschnecken);
    }

    private void addNacktschnecken(int anzahl) {
        for (int i = 0; i < anzahl; ++i) {
            System.out.println("Bitte den Namen der Nacktschnecke eingeben:");
            String name = scanner.next();
            System.out.println("Bitte speed eingeben: ");
            float speed = readSpeed();
            teilnehmer.add(new Nacktschnecke(name, speed));
        }
    }

    private void addGehaueseschnecken(int anzahl) {
        for (int i = 0; i < anzahl; ++i) {
            System.out.println("Bitte den Namen der Gehäuseschnecke eingeben:");
            String name = scanner.next();
            System.out.println("Bitte speed eingeben: ");
            float speed = readSpeed();
            System.out.println("Farbe: ");
            String farbe = scanner.next();
            teilnehmer.add(new Gehaeuseschnecke(name, speed, farbe));
        }
    }

    private float readSpeed() {
        boolean success =  false;
        while (!success) {
            try {
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Falsche Eingabe! Bitte wiederholen:");
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
                float zurueckgelegteDistanz = schnecke.getZurueckgelegteDistanz();
                if (zurueckgelegteDistanz >= distanz) {
                    gewonnen = true;
                    System.out.println("Gewonnen hat " + schnecke);
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

    private String toString(int schnecke) {
        return "Rennen{" +
                "distanz=" + distanz +
                ", teilnehmer=" + teilnehmer +
                '}';
    }

    private void displayWinner(String toString) {
        System.out.println("Gewonnen hat " + teilnehmer.indexOf(1));
    }

    public float getDistanz() {
        return distanz;
    }


    public static void main(String[] args) {

        System.out.println("Distanz des Rennens in mm festlegen: ");
        Scanner scanner1 = new Scanner(System.in);
        distanz = scanner1.nextFloat();
        Rennen rennen = new Rennen(distanz);
        rennen.addSchnecken();
        rennen.rennen();
    }
}

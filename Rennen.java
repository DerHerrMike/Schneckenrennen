import java.util.ArrayList;
import java.util.Scanner;

public class Rennen {
    String name;
    String rasse;
    float speed;
    String farbe;


    private static float distance = 20.0f;
    private ArrayList<Schnecke> teilnehmer = new ArrayList<>();

    //METHODEN

    // Funktionier noch nicht
//    public ArrayList<Schnecke> getTeilnehmer() {
//        for(int i=0;i<this.teilnehmer.size();i++) {
//          teilnehmerZaehler = teilnehmer.get(i).toString();
//        return teilnehmer.get(i).toString();
//    }
    public void kriechen() {
        for (int i = 0; i < this.teilnehmer.size(); i++) {
            teilnehmer.get(i).kriechen();
        }
    }

    public void addteilnehmer() {
        //Instanzieren
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wieviele Gehäuseschnecke möchtest du zum Rennen anmelden: ");
        int anzahlGehaeuseschneckenImRennen = scanner.nextInt();
        for (int i = 0; i < anzahlGehaeuseschneckenImRennen; i++) {

            System.out.println("Teilnehmende Gehäuseschnecken instanziieren");
            rasse = "Gehäuseschnecke";
            getTeilnehmerName();
            getTeilnehmerFarbe();
            getSpeed();
            teilnehmer.add(new Gehaeuseschnecke(name, rasse, speed, farbe));
        }

        System.out.println("Wieviele Nacktschnecken möchtest du zum Rennen anmelden: ");
        int anzahlNacktschneckenImRennen = scanner.nextInt();
        for (int i = 0; i < anzahlNacktschneckenImRennen; i++) {

            System.out.println("Teilnehmende Nacktschnecken instanziieren");
            rasse = "Nacktschnecke";
            getTeilnehmerName();
            getTeilnehmerFarbe();
            getSpeed();
            teilnehmer.add(new Nacktschnecke(name, rasse, speed));
        }
    }

    public String getTeilnehmerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        name = scanner.nextLine();
        return name;
    }

    public String getTeilnehmerFarbe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Farbe: ");
        farbe = scanner.nextLine();
        return farbe;
    }

    public float getSpeed() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geschwingdigkeit: ");
        speed = scanner.nextFloat();
        return speed;
    }

    public Schnecke getTeilnehmer(int startnummer) {
        return teilnehmer.get(startnummer);
    }


    public static void main(String[] args) {

        Rennen test = new Rennen();
        test.addteilnehmer();
        test.kriechen();
        System.out.println(test.getTeilnehmer(0));
        System.out.println(test.getTeilnehmer(1));

    }
}










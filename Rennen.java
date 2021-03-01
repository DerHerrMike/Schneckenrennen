
import java.util.ArrayList;
import java.util.List;

public class Rennen {
    private float distanz;

    private List<Schnecke> teilnehmer = new ArrayList<>();

    public Rennen(float distanz) {
        this.distanz = distanz;
    }

    public static void main(String[] args) {
        Rennen rennen = new Rennen(20);
        rennen.addSchnecken();
        rennen.rennen();
    }

    public void addSchnecken() {
        teilnehmer.add(new Gehaeuseschnecke("Tiger", 2.4f, "gelb"));
        teilnehmer.add(new Gehaeuseschnecke("Speedy", 3.0f, "rot"));
        teilnehmer.add(new Nacktschnecke("Cookie", 2.2f));
    }

    public void rennen() {
        boolean gewonnen = false;
        while (!gewonnen) {

            for (int i = 0, teilnehmerSize = teilnehmer.size(); i < teilnehmerSize; i++) {
                Schnecke schnecke = teilnehmer.get(i);
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

    private void displayWinner(String toString) {
        System.out.println("Gewonnen hat " + teilnehmer.indexOf(1));
    }


    private String toString(int schnecke) {
        return "Rennen{" +
                "distanz=" + distanz +
                ", teilnehmer=" + teilnehmer +
                '}';
    }
}


//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Rennen {
//    private String name;
//    private String rasse;
//    private float speed;
//    private String farbe;
//    private float distanzRennen;
//    private List<Schnecke> teilnehmer = new ArrayList<>();
//    private int counter = 0;
//    private int ghsImRennen;
//    private int nsImRenne;
//    private int gesamtAnzahlTeilnehmer;
//    private int startnummer;
//    private boolean zielErreichungAbfragen;
//
//
//    //METHODEN
//    public void setDistanzRennen() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Länge des Rennens in mm: ");
//        distanzRennen = scanner.nextFloat();
//    }
//
//    public float getDistanzRennen() {
//        return distanzRennen;
//    }
//
//    public Rennen(float distanzRennen) {
//        this.distanzRennen = distanzRennen;
//    }
//
//    public void addteilnehmer() {
//        //Instanzieren
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wieviele Gehäuseschnecke möchtest du zum Rennen anmelden: ");
//        ghsImRennen = scanner.nextInt();
//        for (int i = 0; i < ghsImRennen; i++) {
//
//            System.out.println("Teilnehmende Gehäuseschnecken instanziieren");
//            rasse = "Gehäuseschnecke";
//
//            setTeilnehmerName();
//            setTeilnehmerFarbe(); // zum testen aus
//            setTeilnehmerSpeed();
//            teilnehmer.add(new Gehaeuseschnecke(name, speed, farbe));
//        }
//
//        System.out.println("Wieviele Nacktschnecken möchtest du zum Rennen anmelden: ");
//        nsImRenne = scanner.nextInt();
//
//        for (int j = 0; j < nsImRenne; j++) {
//
//            System.out.println("Teilnehmende Nacktschnecken instanziieren");
//            rasse = "Nacktschnecke";
//            setTeilnehmerName();
//            setTeilnehmerSpeed();
//            teilnehmer.add(new Nacktschnecke(name, speed));
//        }
//    }
//
//    public String setTeilnehmerName() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Name: ");
//        name = scanner.nextLine();
//        return name;
//    }
//
//    public String setTeilnehmerFarbe() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Farbe: ");
//        farbe = scanner.nextLine();
//        return farbe;
//    }
//
//    public float setTeilnehmerSpeed() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Geschwingdigkeit: ");
//        speed = scanner.nextFloat();
//        return speed;
//    }
//
//    public void rennen(){
//        boolean gewonnen = false;
//        while(!gewonnen){
//
////            for(int i = 0; i < teilnehmer.size(); i++){
////                Schnecke schnecke = teilnehmer.get(i);
////                schnecke.kriechen();
////            }
//
//            for(Schnecke schnecke : teilnehmer){
//                schnecke.kriechen();
//                float zurueckgelegteDistanz = schnecke.getZurueckgelegteDistanz();
//                if(zurueckgelegteDistanz >= distanz){
//                    gewonnen = true;
//                }
//            }
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//


//
//    }
//
//    public float abfrageZwischenstand() {
//        return speed * counter;
//    }
//
//    public void zwischenstandAusgeben() {
//        System.out.println("Zwischenstand nach " + counter + " Sekunde/n: '" + name + "' hat " + abfrageZwischenstand() + "mm geschafft.");
//    }
//
//    public boolean zielErreichtAbfragen() {
//
//        zielErreichungAbfragen = false;
//        if (getDistanzRennen() <= abfrageZwischenstand()) {
//            zielErreichungAbfragen = true;
//        }
//        return zielErreichungAbfragen;
//    }
//
//    public void displayWinner(Schnecke winner) {
//        System.out.println("Gewonnen hat: " + rasse + " " + "'" + name + "'. Sie hat die " + getDistanzRennen() + "mm in " + counter + " Sekunden geschaftt!");
//
//    }
//
//
//    // Main
//    public static void main(String[] args) {
//        Rennen rennen = new Rennen(20);
//        rennen.addSchnecken();
//        rennen.rennen();
//    }
//
//








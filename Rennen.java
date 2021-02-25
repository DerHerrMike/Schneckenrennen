import java.util.ArrayList;
import java.util.Scanner;

public class Rennen {
    private String name;
    private String rasse;
    private float speed;
    private String farbe;
    private float distanzRennen;
    private ArrayList<Schnecke> teilnehmer = new ArrayList<>();


    //METHODEN


    public void setDistanzRennen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Länge des Rennens in mm: ");
        distanzRennen = scanner.nextFloat();
    }

    public float getDistanzRennen() {
        return distanzRennen;
    }

    public void addteilnehmer() {
        //Instanzieren
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wieviele Gehäuseschnecke möchtest du zum Rennen anmelden: ");
        int anzahlGehaeuseschneckenImRennen = scanner.nextInt();
        for (int i = 0; i < anzahlGehaeuseschneckenImRennen; i++) {

            System.out.println("Teilnehmende Gehäuseschnecken instanziieren");
            rasse = "Gehäuseschnecke";
            setTeilnehmerName();
            setTeilnehmerFarbe(); // zum testen aus
            setTeilnehmerSpeed();
            teilnehmer.add(new Gehaeuseschnecke(name, rasse, speed, farbe));
        }

        System.out.println("Wieviele Nacktschnecken möchtest du zum Rennen anmelden: ");
        int anzahlNacktschneckenImRennen = scanner.nextInt();
        for (int i = 0; i < anzahlNacktschneckenImRennen; i++) {

            System.out.println("Teilnehmende Nacktschnecken instanziieren");
            rasse = "Nacktschnecke";
            setTeilnehmerName();
            setTeilnehmerSpeed();
            teilnehmer.add(new Nacktschnecke(name, rasse, speed));
        }
    }

    public String setTeilnehmerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        name = scanner.nextLine();
        return name;
    }

    public String setTeilnehmerFarbe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Farbe: ");
        farbe = scanner.nextLine();
        return farbe;
    }


    public float setTeilnehmerSpeed() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geschwingdigkeit: ");
        speed = scanner.nextFloat();
        return speed;
    }

//    public float getTeilnehmerSpeed(){
//        return speed;
//    }

    public Schnecke getTeilnehmerDaten(int startnummer) {
        return teilnehmer.get(startnummer);
    }
//    public void bewegung() {
//        for (int i = 0; i < this.teilnehmer.size(); i++) {
//            teilnehmer.get(i).kriechen();
//        }
//    }

//    public void theRace() {
//        int az = teilnehmer.size();  // getestet passt
//        for (float i = 0; i < az; i++) {
//            for (int j = 0; j < this.teilnehmer.size(); j++) {
//                teilnehmer.get(j).kriechen();
//            }
//            float zurueckgelegteDistanz = teilnehmer.get((int) i).getZurueckgelegteDistanz(); // getestet passt
//            if (getDistanzRennen() <= zurueckgelegteDistanz) {
//                displayWinner((int) i);
//            }else return;
//            }
//        }

    public void theRace() {

        boolean found = false;
        do {
            for (Schnecke schnecke : teilnehmer) {
                schnecke.kriechen();
            }
            for (Schnecke schnecke : teilnehmer) {
                float zurueckgelegteDistanz = schnecke.getZurueckgelegteDistanz(); // getestet passt
                if (getDistanzRennen() >= zurueckgelegteDistanz) {
                    displayWinner(schnecke);
                    found = true;
                }
            }
        } while (!found);
    }

        public void displayWinner (Schnecke schnecke){
            System.out.println("Sieger: " + schnecke.getName());
        }

        public static void main (String[]args){

            Rennen test = new Rennen();
            test.setDistanzRennen();
            test.addteilnehmer();
            test.theRace();
        }
    }










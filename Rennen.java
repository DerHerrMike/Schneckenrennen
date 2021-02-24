import java.util.ArrayList;

public class Rennen {

    private static float distance = 20.0f;
    private ArrayList<Schnecke> teilnehmer = new ArrayList<>();

    //METHODEN

    public void neuerTeilnehmer(Schnecke newSchnecke) {
        this.teilnehmer.add(newSchnecke);
    }

    public void kriechen () {
        for(int i=0;i<this.teilnehmer.size();i++) {
            this.teilnehmer.get(i);
        }
    }

    public ArrayList<Schnecke> getTeilnehmer() {
        return teilnehmer;
    }

    public void addSchnecke(){
        //Instanzieren
        Gehaeuseschnecke g1 = new Gehaeuseschnecke("Tiger", "Gehäuseschnecke",2.4f,0, "gelb");
        Gehaeuseschnecke g2 = new Gehaeuseschnecke("Speedy", "Gehäuseschnecke",3.0f,0,"rot");
        Nacktschnecke n1 = new Nacktschnecke("Cookie", "Nacktschnecke", 2.2f, 0);
        teilnehmer.add(g1);
        teilnehmer.add(g2);
        teilnehmer.add(n1);
        System.out.println(teilnehmer);
    }

    public static void main(String[] args) {

            Rennen test = new Rennen();
            test.addSchnecke();


//        }


        //Ausgeben


//        System.out.println("Wert Methode g1.kriechen: " + g1.kriechen());
//        System.out.println("Wert Methode g2.kriechen: " + g2.kriechen());
//        System.out.println("Wert Methode n1.kriechen: " + n1.kriechen());


    }



}









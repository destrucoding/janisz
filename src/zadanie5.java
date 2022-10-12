public class zadanie5 {

    public static void main(String[] args) {
        int wymiar1pokoj1 = 3;
        int wymiar2pokoj1 = 4;
        int wymiar1pokoj2 = 3;
        int wymiar2pokoj2 = 4;
        int wymiar1pokoj3 = 2;
        int wymiar2pokoj3 = 3;
        int wymiar1pokoj4 = 2;
        int wymiar2pokoj4 = 2;


        double pokoj;

        int pokoj1 =wymiar1pokoj1*wymiar2pokoj1;
        int pokoj2 = wymiar1pokoj2*wymiar2pokoj2;
        int pokoj3 = wymiar1pokoj3*wymiar2pokoj3;
        int pokoj4 = wymiar1pokoj4*wymiar2pokoj4;

        int powierzchnia_calkowita = pokoj1+pokoj2+pokoj3+pokoj4;

        System.out.println("Wymiary pomieszczenia 1: " + pokoj1);
        System.out.println("Wymiary pomieszczenia 2: " + pokoj2);
        System.out.println("Wymiary pomieszczenia 3: "+ pokoj3);
        System.out.println("Wymiary pomieszczenia 4: " + pokoj4);
        System.out.println("Powierzchnia całkowita pomieszczenia:" +powierzchnia_calkowita);

        double powierzchnia_na_osobe;
        powierzchnia_na_osobe = (double)powierzchnia_calkowita/4;

        System.out.println("Powierzchnia przypadajaca na osobe jest rowna: " +powierzchnia_na_osobe);
        }


    }

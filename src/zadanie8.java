import java.sql.SQLOutput;
import java.util.Scanner;

public class zadanie8 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        String imie = klawiatura.nextLine();
        System.out.println("Podaj swoje naziwsko: ");
        String nazwisko = klawiatura.nextLine();
        System.out.println("Podaj swoj wiek: ");
        int wiek = klawiatura.nextInt();
        System.out.println("Ile chciałbyś zarabiać rocznie?: ");
        double kwota = klawiatura.nextDouble();
        System.out.println("Mam na imie " + imie + " na nazwisko "+ nazwisko + " mam " +wiek+ " lat "+ " i chcialbym zarabiać " + kwota +" rocznie ");
    }




}

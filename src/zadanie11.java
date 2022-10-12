import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj dystans w km: ");
        double paliwo = klawiatura.nextDouble();
        System.out.println("Podaj ilosc paliwa w litrach: ");
        double dystans = klawiatura.nextDouble();
        double kilometr_na_litrze = dystans/paliwo;
        System.out.println("litry na kilometr: "+ kilometr_na_litrze);
    }
}

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        double boy,kilo;
        double index;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz: ");

        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz: ");

        kilo = input.nextDouble();

        index = (kilo/(boy*boy));

        System.out.print("Vücud kitle indeksiniz: " +index);






    }

}

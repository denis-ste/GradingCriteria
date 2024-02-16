import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        int procent = 0;
        String exit = "n";

        do {
            System.out.println("Wprowadz wynik punktów egazminu ocene: ");

            do try {
                again = true;
                procent = scanner.nextInt();
                scanner.nextLine();
                again = false;
            } catch (InputMismatchException error) {
                System.out.println("\nNiewłaściwy format liczby spróbuj ponownie");
                scanner.nextLine();
            } while(again);

            if (procent > 100) System.out.println("Liczba niemożliwa do uzyskania z egzaminu");
            else if (procent < 0) System.out.println("Niemożliwe do uzyskania minusowe punkty");
            else if (procent >= 90) System.out.println("Otrzymałeś ocene 5");
            else if (procent >= 80) System.out.println("Otrzymałeś ocene 4");
            else if (procent >= 70) System.out.println("Otrzymałeś ocene 3");
            else if (procent >= 60) System.out.println("Otrzymałeś ocene 2");
            else if (procent >= 50) System.out.println("Niestety niezaliczyłeś, zalicznie od 60 pkt");

            do {
                System.out.println("Exit program? (y / n): ");
                exit = scanner.nextLine();
                if ( !(exit.equals("n") || exit.equals("y") )) {
                    System.out.println("Niewłaściwy format komendy spróbuj ponownie by zdecydować");
                }
            } while( !(exit.equals("n") || exit.equals("y")));

        } while (!exit.equals("y"));
    }
}


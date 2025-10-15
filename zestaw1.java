import java.util.Scanner;

public class zestaw1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = 1.8 * celsius + 32.0;
            System.out.println("Temperatura w Fahrenheicie: " + fahrenheit);
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj trzy liczby całkowite:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        System.out.println("Największa liczba: " + max);
        System.out.println("Najmniejsza liczba: " + min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wagę (kg): ");
        double waga = scanner.nextDouble();
        System.out.print("Podaj wzrost (m): ");
        double wzrost = scanner.nextDouble();

        double bmi = waga / (wzrost * wzrost);
        System.out.printf("Twoje BMI: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Niedowaga");
        } else if (bmi <= 24.9) {
            System.out.println("Waga prawidłowa");
        } else {
            System.out.println("Nadwaga");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dochód (PLN): ");
        double dochod = scanner.nextDouble();
        double podatek;

        if (dochod <= 85528) {
            podatek = 0.18 * dochod - 556.02;
        } else {
            podatek = 14839.02 + 0.32 * (dochod - 85528);
        }

        if (podatek < 0) podatek = 0;

        System.out.printf("Należny podatek: %.2f PLN\n", podatek);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cena;
        int raty;

        while (true) {
            System.out.print("Podaj cenę towaru (100 - 10000 zł): ");
            cena = scanner.nextDouble();
            if (cena >= 100 && cena <= 10000) break;
            System.out.println("Nieprawidłowa cena.");
        }

        while (true) {
            System.out.print("Podaj liczbę rat (6 - 48): ");
            raty = scanner.nextInt();
            if (raty >= 6 && raty <= 48) break;
            System.out.println("Nieprawidłowa liczba rat.");
        }

        double oprocentowanie;
        if (raty <= 12) oprocentowanie = 0.025;
        else if (raty <= 24) oprocentowanie = 0.05;
        else oprocentowanie = 0.10;

        double suma = cena + (cena * oprocentowanie);
        double rata = suma / raty;

        System.out.printf("Miesięczna rata: %.2f zł\n", rata);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosty kalkulator (+, -, *, /)");

        System.out.print("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj operację (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Wynik: " + (a + b));
                break;
            case '-':
                System.out.println("Wynik: " + (a - b));
                break;
            case '*':
                System.out.println("Wynik: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Błąd: dzielenie przez zero.");
                } else {
                    System.out.println("Wynik: " + (a / b));
                }
                break;
            default:
                System.out.println("Nieznana operacja.");
        }

        System.out.println("Naciśnij Enter, aby zakończyć...");
        try {
            System.in.read();
        } catch (Exception e) {
            // ignoruj
        }
    }










}





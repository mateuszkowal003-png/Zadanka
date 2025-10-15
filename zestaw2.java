import java.util.Scanner;
import java.util.Random;

public class zestaw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 System.out.print("Podaj liczbę całkowitą dodatnią: ");
int n = scanner.nextInt();

if (n <= 0) {
System.out.println("Podano liczbę niedodatnią. Program kończy działanie.");
} else {
System.out.println("Liczby nieparzyste nie większe niż " + n + ":");
for (int i = 1; i <= n; i += 2) {
System.out.print(i);
if (i + 2 <= n) {
System.out.print(", ");
}
}
System.out.println();
}

scanner.close();



//zad2

System.out.print("Podaj liczbę całkowitą A: ");
int A = scanner.nextInt();

System.out.print("Podaj liczbę całkowitą B (większą niż A): ");
int B = scanner.nextInt();

if (A >= B) {
System.out.println("B musi być większe niż A!");
return;
}

int sumaWhile = 0;
int i = A;
while (i <= B) {
sumaWhile += i;
i++;
}
System.out.println(sumaWhile);

int sumaDoWhile = 0;
int j = A;
do {
sumaDoWhile += j;
j++;
} while (j <= B);
System.out.println(sumaDoWhile);

int sumaFor = 0;
for (int k = A; k <= B; k++) {
sumaFor += k;
}
System.out.println(sumaFor);

scanner.close();



//zad 3

System.out.print("Podaj dodatnią liczbę całkowitą: ");
int n = scanner.nextInt();

if (n <= 0) {
System.out.println("Podana liczba nie jest dodatnia. Program kończy działanie.");
return;
}

int potega = 1;

while (potega <= n) {
System.out.println(potega);
potega *= 2;
}

scanner.close();


//zad 4
int suma = 0;
int liczba;

do {
System.out.print("Podaj liczbę (0 kończy): ");
liczba = scanner.nextInt();
suma += liczba;
} while (liczba != 0);

System.out.println("Suma podanych liczb: " + suma);

scanner.close();


//zad 5
int liczba;
boolean pierwsza = true;
int min = 0;
int max = 0;

System.out.println("Podawaj liczby całkowite (0 kończy):");

while (true) {
liczba = scanner.nextInt();

if (liczba == 0) {
break;
}

if (pierwsza) {
min = liczba;
max = liczba;
pierwsza = false;
} else {
if (liczba < min) min = liczba;
if (liczba > max) max = liczba;
}
}

if (pierwsza) {
System.out.println("Nie podano żadnych liczb.");
} else {
int suma = min + max;
double srednia = suma / 2.0;

System.out.println("Najmniejsza liczba: " + min);
System.out.println("Największa liczba: " + max);
System.out.println("Suma: " + suma);
System.out.println("Średnia arytmetyczna: " + srednia);
}

scanner.close();



//zad 6

Random rand = new Random();
int wylosowanaLiczba = rand.nextInt(100) + 1; // losuje liczbę od 1 do 100
int proba;

System.out.println("Zgadnij liczbę z zakresu 1 do 100.");

while (true) {
System.out.print("Podaj swoją liczbę: ");
proba = scanner.nextInt();

if (proba > wylosowanaLiczba) {
System.out.println("Podałeś za dużą wartość.");
} else if (proba < wylosowanaLiczba) {
System.out.println("Podałeś za małą wartość.");
} else {
System.out.println("Gratulacje! Zgadłeś liczbę!");
break;
}
}

scanner.close();



//zad 7
System.out.print("Podaj znak wypełnienia prostokąta: ");
char znak = scanner.next().charAt(0);

System.out.print("Podaj pozycję x (kolumna lewego górnego rogu): ");
int x = scanner.nextInt();

System.out.print("Podaj pozycję y (wiersz lewego górnego rogu): ");
int y = scanner.nextInt();

System.out.print("Podaj wysokość prostokąta (a): ");
int a = scanner.nextInt();

System.out.print("Podaj szerokość prostokąta (b): ");
int b = scanner.nextInt();

System.out.println();

for (int i = 1; i < y; i++) {
System.out.println();
}


for (int i = 0; i < a; i++) {

for (int j = 1; j < x; j++) {
System.out.print(" ");
}

for (int j = 0; j < b; j++) {
System.out.print(znak);
}
System.out.println();
}

scanner.close();


//zad 8
System.out.print("Podaj wysokość choinki (n > 0): ");
int n = scanner.nextInt();

if (n <= 0) {
System.out.println("Wysokość musi być większa od 0!");
return;
}


for (int i = 1; i <= n; i++) {

for (int j = 1; j <= n - i; j++) {
System.out.print(" ");
}

for (int k = 1; k <= (2 * i - 1); k++) {
System.out.print("*");
}

System.out.println();
}

scanner.close();


//zad9
System.out.print("Podaj liczbę całkowitą: ");
int liczba = scanner.nextInt();


int temp = Math.abs(liczba);

int sumaCyfr = 0;
int sumaParzystych = 0;
int sumaNieparzystych = 0;
int liczbaParzystych = 0;
int liczbaNieparzystych = 0;


if (temp == 0) {
System.out.println("Suma cyfr: 0");
System.out.println("Nie można obliczyć średnich (brak cyfr niezerowych).");
return;
}


while (temp > 0) {
int cyfra = temp % 10;
sumaCyfr += cyfra;

if (cyfra % 2 == 0) {
sumaParzystych += cyfra;
liczbaParzystych++;
} else {
sumaNieparzystych += cyfra;
liczbaNieparzystych++;
}

temp /= 10;
}


System.out.println("Suma cyfr: " + sumaCyfr);

if (liczbaParzystych == 0 || liczbaNieparzystych == 0) {
System.out.println("Nie można obliczyć stosunku średnich – brak cyfr parzystych lub nieparzystych.");
} else {
double sredniaParzystych = (double) sumaParzystych / liczbaParzystych;
double sredniaNieparzystych = (double) sumaNieparzystych / liczbaNieparzystych;
double stosunek = sredniaParzystych / sredniaNieparzystych;

System.out.printf("Średnia cyfr parzystych: %.2f\n", sredniaParzystych);
System.out.printf("Średnia cyfr nieparzystych: %.2f\n", sredniaNieparzystych);
System.out.printf("Stosunek średniej parzystych do nieparzystych: %.2f\n", stosunek);
}

scanner.close();


//zad10
System.out.print("Podaj liczbę całkowitą: ");
int liczba = scanner.nextInt();

System.out.print("Dzielniki liczby " + liczba + " to: ");

int absLiczba = Math.abs(liczba);

for (int i = 1; i <= absLiczba; i++) {
if (absLiczba % i == 0) {
System.out.print(i + " ");
}
}

System.out.println();
scanner.close();

*/
//zad11
        System.out.print("Podaj liczbę całkowitą większą niż 1: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Liczba musi być większa niż 1.");
            return;
        }

        boolean czyPierwsza = true;


        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                czyPierwsza = false;
                break;
            }
        }

        if (czyPierwsza) {
            System.out.println(n + " jest liczbą pierwszą.");
        } else {
            System.out.println(n + " nie jest liczbą pierwszą.");
        }

        scanner.close();
    }
}
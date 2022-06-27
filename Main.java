import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        int liczba1 = input.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int liczba2 = input.nextInt();
        System.out.println("Dodawanie - wcisnij 1");
        System.out.println("Odejmowanie - wcisnij 2");
        System.out.println("Mnożenie - wcisnij 3");
        System.out.println("Dzielenie - wcisnij 4");
        System.out.println("Resta z dzielenia - wcisnij 5");
        System.out.println("Podaj numer operacji do wykonania: ");
        int wybor = input.nextInt();
        System.out.print("Wynik to: ");
        switch(wybor) {
        case 1:
            System.out.println(liczba1 + liczba2);
            break;
        case 2:
            System.out.println(liczba1 - liczba2);
            break;
        case 3:
            System.out.println(liczba1 * liczba2);
            break;
        case 4:
            if (liczba2 != 0) {
                System.out.println(liczba1 / liczba2);
            } else {
                System.out.println("Nie dziel przez 0");
            }
            break;
        case 5:
            if (liczba2 != 0) {
                System.out.println(liczba1 % liczba2);
            } else {
                System.out.println("Nie dzielimy przez zero!!");
            }
        }
  }
}
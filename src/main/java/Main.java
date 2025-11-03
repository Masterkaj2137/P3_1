import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj rozmiar kwadratu: ");
    int n = scanner.nextInt();

    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        System.out.print("*");
      }
      System.out.println();
    }

    scanner.close();
  }
}

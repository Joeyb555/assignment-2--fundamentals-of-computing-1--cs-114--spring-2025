import java.util.Scanner;

public class OneHundredBottlesOfBeer {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter the number of verses to print (1-100): ");
    int numVerses = scanner.nextInt();

    while (numVerses < 1 || numVerses > 100) {
  System.out.print("Invalid input. Please enter a number between 1 and 100: ");
    numVerses = scanner.nextInt();
  }

    for (int i = numVerses; i > 0; i--) {
      System.out.println(i + " bottles of beer on the wall");
      System.out.println(i + " bottles of beer");
      System.out.println("If one of those bottles should happen to fall");
      System.out.println((i - 1) + " bottles of beer on the wall");
      System.out.println();
  }

    scanner.close();
 }
}

import java.util.Scanner;

public class PrintVowelsAndNonVowels {

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.println("Enter a string: ");
  String input = scanner.nextLine();

  int countA = 0;
  int countE = 0;
  int countI = 0;
  int countO = 0;
  int countU = 0;
  int nonVowelCount = 0;

for (int i = 0; i < input.length(); i++) {
  char ch = input.charAt(i);

if (ch == 'a') {
  countA++;}
else if (ch == 'e') {
  countE++;}
else if (ch == 'i') {
  countI++;}
else if (ch == 'o') {
  countO++;}
else if (ch == 'u') {
  countU++;}
else if (Character.isLetter(ch)) {

  nonVowelCount++;
 }
}

System.out.println("Count of 'a': " + countA);
System.out.println("Count of 'e': " + countE);
System.out.println("Count of 'i': " + countI);
System.out.println("Count of 'o': " + countO);
System.out.println("Count of 'u': " + countU);

System.out.println("Count of non-vowel characters: " + nonVowelCount);

  scanner.close();
  }
 }

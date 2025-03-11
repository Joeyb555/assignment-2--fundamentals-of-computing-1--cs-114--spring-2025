public class CountFlips {
//--------------------------------------------------------------------
//  Creates a Coin object, flips it a number of times, and prints the results.
//--------------------------------------------------------------------

public static void main(String[] args) {
    int numberOfFlips = 100;
    int headsCount = 0;
    int tailsCount = 0;

Coin coin = new Coin();

for (int i = 0; i < numberOfFlips; i++) {
    coin.flip();
if (coin.isHeads()) {
    headsCount++;}
else {
    tailsCount++;
 }
}
{
System.out.println("Flipped " + numberOfFlips + " times.");
System.out.println("Heads: " + headsCount);
System.out.println("Tails: " + tailsCount);
}
 }
}

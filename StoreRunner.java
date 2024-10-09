import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    MakeupStore tester = new MakeupStore("Armani Foundation", 84.00, 300);
   System.out.println(tester.toString());
    System.out.println("\n"); //prints a blank line


    Blush testBlush = new Blush("Rare Beauty Blush", 30.00, 94, false, "Pink");
    System.out.println(testBlush.toString());
    System.out.println("\n"); //prints a blank line

    testBlush.setPrice(23.00);
    testBlush.setIsPowder(false);
    testBlush.setColor("Love- Teracotta");
    System.out.println("Updated\n" + testBlush.toString());
    System.out.println("\n"); //prints a blank line

    Highlighter testHighlighter = new Highlighter("R.E.M Highlighter", 2.00, 300, true, "Pink");
    System.out.println(testHighlighter.toString());
    System.out.println("\n"); //prints a blank line

    testHighlighter.setPrice(25.00);
    testHighlighter.setIsLiquid(false);
    testHighlighter.setVolume(250);
    System.out.println("Updated\n" + testHighlighter.toString());
    System.out.println("\n"); //prints a blank line


    
    
  }
}
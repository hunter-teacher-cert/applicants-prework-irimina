import java.util.Scanner;

//convert temperature from C to Fa

public class CelsiusToFah{
  public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      System.out.println("What is the current temperature in Celsius? ");
      double celsius = in.nextDouble();

      double fahrenheit = celsius *(9.0/5.0) +32;
      System.out.println("Here is the temperature converted to F: ");
      System.out.println(fahrenheit);
  }
}

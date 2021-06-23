import java.util.*;
import java.util.Random;

public class Craps{
public static void main(String[] args)
{
  System.out.println(roll(10));
  }

public static int roll(int num1)
{
  Random ranNum = new Random(); // instance of random class
  int result = ranNum.nextInt(num1-1);
  result++;
  return result;
}
/*
You will write a program named Craps.java that will play a simplified game of craps.

There should be at least three static methods in addition to main.
One named roll which accepts an integer parameter and returns a random number
 between 1 and that number, inclusive. */



 public static int shoot(int dice, int max)
 {
   int total = 0;
   for(int i = 0; i < dice; i++)
   {
     total += roll(max);
   }
   return total;
 }
 /*
There should also be one named shoot which accepts two parameters -
a number of dice and the maximum value for those dice and returns the result of
rolling those dice.*/


public static boolean round()
{
 int playerRoll= shoot(3,6);
 int point= -1;

 while (true)
   {
     if (playerRoll==2 || playerRoll==3 || playerRoll==12)
      {
        return false;

      }
     else if( playerRoll ==7 || playerRoll==11)
     {
       return true;
     }
     else
     {
       point=playerRoll;
       playerRoll= shoot(3,6);
     }
   }
}
/*
The third method should be named round. It should accept no parameters and it
should return something to indicate if the shooter of the round wins or loses.

A round is played as follows:

The shooter shoots (rolls) the dice.

If he rolls a 2,3, or 12,that’s Craps and he loses.
If he rolls a 7 or 11, that’s a Natural and he wins.
Otherwise:
the value he rolled is now called the Point
the shooter continues to shoot (roll) until he either rolls the Point again
at which point he wins or he rolls a 7 at which point he loses.
The main program should take a parameter from the command line, play that
many
rounds and as it plays indicate each time the shooter wins or loses.
The program should also print out the status of the rounds they occur.
*/


}  // end of class

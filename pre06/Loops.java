/*
Create a directory named pre06 under your assignments repo.
Write a program named Loops.java

which has solutions to excercises 3, 4, and 5 from chapter 7 of
Think Java.

NOTE: When computers calculate non integers,
values only accurate to a certain number of decimal places.
This means that your answers will probably not be exact all
the way to the full expansion.


Exercise 3
In Exercise 9 we wrote a recursive version of power,
which takes a double x and an integer n and returns xn.
Now write an iterative method to perform the same calculation.

Exercise 4
Section 6.7 presents a recursive method that computes the
factorial function.
Write an iterative version of factorial.

*/
import java.io.*;
import java.util.*;


public class Loops{
  public static void main(String[] args) {

     System.out.print("Power: ");
     System.out.println(power(5,4));

     System.out.print("Factorial: ");
     System.out.println(factorial(5));

     System.out.println("Exp");
     System.out.println(myexp(4,2));
}


public static double power(double x, int n)
{
  double total =1;
  for(int i=0; i<n;i++)
  {
    total*=x;
     System.out.print(total); // testing purposes
  }
   return total;
}

public static double factorial (int x){
  double s= 1;
  for(int i=x;i>=1;i--){
    s*=i;
       System.out.println(s);
  }
  return s;
}

public static double myexp (int x, int n){
		double e=0;
		for(int i = 0; i < n; i++) {
			e= e+(power(x,i)/factorial(i));
		}
		return e;
	}



}

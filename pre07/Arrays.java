import java.util.*;

public class Arrays{


	public static void main(String[] args){

	}

/*
Exercise 1   The goal of this exercise is to practice
encapsulation
 with some of the examples in this chapter.
Starting with the code in Section 8.6, write a method
called powArray that takes a double array, a, and returns a
new array that contains the elements of a squared.

Generalize it to take a second argument
 and raise the elements of a to the given power.
Starting with the code in Section 8.10, write a method
called histogram that takes an int array of scores from 0 to
(but not including) 100, and returns a histogram of 100 counters.
 Generalize it to take the number of counters as an argument.

*/


	public static double[] powArray(double [] a){
	 double []b = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			 b[i] = Math.pow(a[i], 2.0);
	}
	           return b;
	}


	public static double powArrayGen(double []a, int b){
	 double []newArray= new double[a.length];
		for (int i = 0; i < a.length; i++) {
			newArray[i] = Math.pow(a[i], b);
	}
	           return newArray;
	}


/*
write a method called histogram that takes an int array of scores
from 0 to (but not including) 100, and returns a histogram of 100 counters.
Generalize it to take the number of counters as an argument.
*/
public static int[] histogram(int[] scores, int numCounters)
  {
    int[] hist = new int[numCounters];
    for(int score:scores)
    {
      hist[score]++;
    }
    return hist;
  }


	/*
	Exercise 4   Write a method called indexOfMax that takes an array
	of integers and returns the index of the largest element.
	Can you write this method using an enhanced for loop?
	Why or why not?
	Answer: No because the foreach loop does not keep track of index
	*/

  static int array[]={1,2,4,5,6,7,8,10,20,7};
	static int indexOfMax(int[] array){
    int max= array[0];
		int maxIndex=0;
    for (int i = 1; i<array.length; i++){
		   if(array[i]>max){
			   max=array[i];
				 maxIndex++;
			 }
		 }
				   return maxIndex;

	}

/*
Exercise 5
Write a method called sieve that takes an integer parameter, n,
 and returns a boolean array that indicates,
for each number from 0 to n - 1, whether the number is prime.
*/
public static boolean isPrime(int n)
  {
    for(int i = 1; i < n/2; i++)
    {
      if(n%i == 0)
        return false;
    }
    return true;
  }

  public static boolean[] sieve(int n)
  {
    boolean []sieve = new boolean[n];
    for(int i = 0; i < n; i++)
    {
      if(isPrime(i))
        sieve[i] = true;
      else
        sieve[i] = false;
    }
    return sieve;
  }

} // end of class

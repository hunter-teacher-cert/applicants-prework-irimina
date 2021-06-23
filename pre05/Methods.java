
/*
Exercise 2
Write a method named isDivisible that takes two integers,
n and m, and that returns true if n is divisible by m,
and false otherwise.

Exercise 3
If you are given three sticks, you may or may not be able to arrange them
in a triangle. For example, if one of the sticks is 12 inches long and
the other two are one inch long, you will not be able to get the short sticks
to meet in the middle.
For any three lengths, there is a simple test to see if it is possible
to form a triangle:

If any of the three lengths is greater than the sum of the other two,
you cannot form a triangle.
Write a method named isTriangle that takes three integers as arguments
and returns either true or false, depending on whether you can or cannot
form a triangle from sticks with the given lengths.
The point of this exercise is to use conditional statements
to write a value method.

Exercise 8
The goal of this exercise is to translate a recursive definition into a
Java method. The Ackermann function
is defined for non-negative integers as follows:

A(m, n) =
⎧
⎪
⎨
⎪
⎩
              n+1	if  m = 0
        A(m−1, 1)	if  m > 0  and  n = 0
A(m−1, A(m, n−1))	if  m > 0  and  n > 0

Write a method called ack that takes two ints as parameters and that
computes and returns the value of the Ackermann function.

Test your implementation of Ackermann by invoking it from main and
displaying the return value. Note the return value gets very big
very quickly. You should try it only for small values of m and n
(not bigger than 3).

*/

public class Methods{
  public static void main(String[] args) {

     System.out.println(ack(1,2));
}


   public static int ack(int m, int n){
     //m,n >=0;

     if(m==0){
       return (n+1);
     }
     else if ((n==0)|| (m>0)) {
        return ack(m-1,1);
     }
        return ack(m-1,ack(m,n-1));

   }

  public static boolean isTriangle(int len1, int len2, int len3)

  {
    if ((len1> (len2+len3)) || (len2>(len1+len3)) || (len3>(len1+len2)))
    {
      return false;
    }
    else{
      return true;
    }
  }

    public static boolean isDivisible(int m, int n)
    {
      return m%n==0;
    }

}

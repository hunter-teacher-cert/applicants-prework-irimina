import java.io.*;
import java.util.*;

public class Time{

  public static void main(String[] args) {

    int hour=18;
    int minute=20;
    int second=20;

    minute = minute +(60*hour);
    second = second +(60*minute);


    System.out.println("Seconds passed since midnight: ");
    System.out.println(second);

    int secinDay = 24*60*60;
    int remaining = secinDay -second;

    System.out.println("Remaining seconds in the day: ");
    System.out.println(remaining);

    int hour1=18;
    int minute1=35;
    int second1=45;


    int elapsedTime = (hour1 *60*60) + (minute1 *60) + 45;

    System.out.println("Elapsed time (in seconds) since working on this assignment: ");
    System.out.println(elapsedTime);
}


}

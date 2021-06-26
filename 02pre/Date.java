import java.util.*;

public class Date{

  public static void main(String[] args) {

    String day = "Friday";
    int date =  18;
    String month= "June";
    int year= 2021;

    String euroFormat = day + "," + date + "," + month + "," + year;
    String ameriFormat= day + "," + month + ", "+ date + "," + year;

    System.out.println("American format: ");
    System.out.println(ameriFormat);

    System.out.println("European format: ");
    System.out.println(euroFormat);
  }


  }

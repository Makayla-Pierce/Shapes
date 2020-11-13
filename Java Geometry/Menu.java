import java.util.Scanner;
import java.util.*;
import java.io.*;

class Menu
{
    public static void main(String[] args)
    throws InterruptedException
    {
    String answer = "";
    double a = 0;
    double b = 0;
    double c = 0;
    double pi = 3.14;
    double Area = 0;
    double Circumference = 0;
    
    Scanner in = new Scanner(System.in);
    
    while (answer != "6") {
    System.out.println("1. Area of a Square");
    System.out.println("2. Area of a Rectangle");
    System.out.println("3. Area of a Triangle");
    System.out.println("4. Circumference of a Circle");
    System.out.println("5. Do another calculation");
    System.out.println("6. Exit Program");
    System.out.println("Choose a number.");
    answer = in.nextLine();
    if (answer.equals ("1")){
        System.out.println("What is the length of the square?");
        a = in.nextDouble();
        Area = a * a;
        System.out.println("The side of the square is " + a + " and the area" + 
                           " of the square is " + Area);
      }
      else{
          if (answer.equals ("2"))
          {
           System.out.println("What is the length of the rectangle?");
           a = in.nextDouble();
           System.out.println("What is the width of the rectangle?");
           b = in.nextDouble();
           Area = a * b;
           System.out.println("The length of the rectangle is " + a +
                           ", the width of the rectangle is " + b + 
                           ", and the area of the rectangle is " + Area);
          }
          else{
                if (answer.equals ("3"))
                {
                    System.out.println("What is the height of the triangle?");
                    a = in.nextDouble();
                    System.out.println("What is the base of the triangle?");
                    b = in.nextDouble();
                    Area = a * (b / 2);
                    System.out.println("The height of the triangle is " + a +
                           ", the base of the triangle is " + b + 
                           ", and the area of the triangle is " + Area);
                }
                else{
                    if (answer.equals ("4"))
                {
                    System.out.println("What is the radius of the circle?");
                    a = in.nextDouble();
                    Circumference = 2 * a * pi;
                    System.out.println("The radius of the circle is " + a + 
                                       ", and the circumference of the circle is " 
                                       + Circumference);
                }
                else{
                    if (answer.equals ("6"))
                    {
                        break;
                    }
                }
              }
         }
     }
  }
}
}
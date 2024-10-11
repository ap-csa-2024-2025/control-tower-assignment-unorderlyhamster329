import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
   // Complete the code below
   
   // TODO: Create Airplane 1 and 2
   Airplane airplane1 = new Airplane();
   Airplane airplane2 = new Airplane("AAA02", 15.8, 128, 30000);
   
   // TODO: Create a Scanner
   Scanner input = new Scanner(System.in);

   // TODO: Getting inputs for Airplane 3
   System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude): ");
   System.out.println("Enter a call sign");
   String callsign = input.nextLine();
   System.out.println("Enter a distance");
   double distance = input.nextDouble();
   System.out.println("Enter a direction");
   int direction = input.nextInt();
   System.out.println("Enter an altitude");
   int altitude = input.nextInt();

   // TODO: Create Airplane 3 from inputs
      Airplane airplane3 = new Airplane(callsign, distance, direction, altitude);

   // TODO: Print the initial positions
   System.out.println("\nInitial Positions:");

   System.out.println("Airplane 1:" + airplane1);
   System.out.println("Airplane 2:" + airplane2);
   System.out.println("Airplane 3:" + airplane3);

   // TODO: Print initial distances 

   double a1anda2 = airplane1.distTo(airplane2);
   double a1anda3 = airplane1.distTo(airplane3);
   double a2anda3 = airplane2.distTo(airplane3);

   System.out.println("\nInitial Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + a1anda2);
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + a1anda3);
   System.out.println("The distance between Airplane 2 and Airplane 3 is " + a2anda3);
   
   // TODO: Print initial height differences
   System.out.println("\nInitial Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(airplane1.getAlt() - airplane2.getAlt()));
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(airplane1.getAlt() - airplane3.getAlt()));
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(airplane2.getAlt() - airplane3.getAlt()));
   
   // TODO: Airplane 1 changes
   double a1newdistance = 
   // TODO: Airplane 2 changes
   
   // TODO: Airplane 3 changes
   
   // TODO: Print new positions of airplanes
   System.out.println("\nNew Positions: ");
   
   // TODO: Print new distances between airplanes
   System.out.println("\nNew Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is ");
   System.out.println("The distance between Airplane 1 and Airplane 3 is ");
   System.out.println("The distance between Airplane 2 and Airplane 3 is ");
   
   // TODO: Print new heights between airplanes
   System.out.println("\nNew Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is ");
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is ");
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is ");
  }
}

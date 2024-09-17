public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

// Problem #1
    int speedKmS = 10; // Km per sec
    int speedKmMin = speedKmS * 60;
    int speedKmHr = speedKmMin * 60;
    int distanceKm = 380000;
    int time = distanceKm / speedKmHr;
    System.out.println(time);

// Problem #2
   int mSecH = 2000;
   int mSecV = 3000;
   int totalSpeedH = mSecH * mSecH;
   int totalSpeedV = mSecV * mSecV;
   int totalSpeedVH = totalSpeedH + totalSpeedV;
   double totalSpeedChange = Math.sqrt(totalSpeedVH);
   System.out.println(totalSpeedChange);

//Problem 3

//a.
int moonRadiusK = 1731;
int moonRadiusM = moonRadiusK * 1000;
int moonRadiusA = moonRadiusM * moonRadiusM;
double moonSurfaceA = 4 * 3.14 * moonRadiusA; // tmr replace 3.14 with pie
System.out.println(moonSurfaceA);

//b.

 
   }
}

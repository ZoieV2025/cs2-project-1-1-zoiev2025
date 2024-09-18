public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

// Problem #1
    int speedKmS = 10; // Km per sec
    int speedKmMin = speedKmS * 60;
    int speedKmHr = speedKmMin * 60;
    int distanceKm = 380000;
    int time = distanceKm / speedKmHr;
    System.out.print("Question 1.: ");
    System.out.println(time);

// Problem #2
   int mSecH = 2000;
   int mSecV = 3000;
   mSecH *= mSecH;
   //int totalSpeedH = mSecH * mSecH;
   mSecV *= mSecV;
   //int totalSpeedV = mSecV * mSecV;
   int totalSpeedVH = mSecH + mSecV;
   //int totalSpeedVH = totalSpeedH + totalSpeedV;
   double totalSpeedChange = Math.sqrt(totalSpeedVH);
   System.out.print("Question 2.: ");
   System.out.println(totalSpeedChange);

//Problem 3

//a.
double moonRadiusK = 1731; // units KM
double moonRadiusM = moonRadiusK * 1000; //converted to meters
moonRadiusM *= moonRadiusM;
//moonRadiusM * moonRadiusM; // squared (r^2)
double moonSurfaceA = 4 * 3.14 * moonRadiusM;
//double moonSurfaceA = 4 * 3.14 * moonRadiusSq; // tmr replace 3.14 with pie
double thickness = 0.001; // m
double moonSurfaceV = moonSurfaceA * thickness;
System.out.print("Question 3.a: ");
System.out.println(moonSurfaceV);

//b.
double moonDensityKg = 3000; //KG per cubic meter (m^3)
double moonMassKg = moonDensityKg * moonSurfaceV; // solving for KG
double moonMassMt = moonMassKg / 1000; 
System.out.print("Question 3.b: ");
System.out.println(moonMassMt);

//c.
double volume = moonSurfaceV;
double surfaceLayer = volume * .25; 
double litersWater = surfaceLayer * 1000;
System.out.print("Question 3.c: ");
System.out.println(litersWater);


   }
}

//Grading
// - coding style: naming variables, organizing well
// - good java conventions, comments to help organize code and explain formulas
// - ***using shortcut operators (1.5)
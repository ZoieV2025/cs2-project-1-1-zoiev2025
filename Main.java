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

// #211 

//1. Problem 1 - If the stars in the Apollo photo have a brightness of 2.5 cents/sec, how many cents
// will be collected in a 20-second time-exposure? 
double brightnessCS = 2.5; // cents/sec
double timeExposureS = 20; //seconds
double brightnessTotal = brightnessCS * timeExposureS; // multiplying b/c seconds cancel out
// brightnessTotal = how many cents the stars omit in 20 seconds
System.out.println("Problem 211: ");
System.out.print("question 1: ");
System.out.println(brightnessTotal); // unit: cents

//2. - If the lunar surface has a brightness of 500 cents/second, how many cents will be
//collected in a 20-second exposure? 
double brightnessLunar = 500; //cents/second
double exposureTime = 20; // seconds
double totalCents = brightnessLunar * exposureTime; // seconds cancel out; moon
System.out.print("question 2: ");
System.out.println(totalCents);

//3. - If the lunar surface is scaled to a camera contrast setting of 100%, A) How bright, in
//cents, is a 1% contrast change? B) What contrast change do the stars represent?

//a.
double percentChange = .01;//percent
double contrastChangeBright = totalCents * percentChange;
System.out.print("question 3a: ");
System.out.println(contrastChangeBright); // unit: cents

//b.
double contrastChangeStars = brightnessTotal / totalCents;
System.out.print("question 3b: ");
System.out.println(contrastChangeStars); //unit: percent

//4. - If the image is set to only record contrast changes of 1% or greater to bring out
//detail on the lunar surface, will the stars be visible? Explain. 
System.out.print("question 4: ");
System.out.println("Since the output of the contrast of the change of the stars is .5%, it will not be visible. However, the moon will be visible because it's exposure is 100%.");

   }
}

//Grading
// - coding style: naming variables, organizing well
// - good java conventions, comments to help organize code and explain formulas
// - ***using shortcut operators (1.5)
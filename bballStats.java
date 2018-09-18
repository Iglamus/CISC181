import java.util.Scanner;

public class bballStats{

     public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the at bats: ");
        int AB = sc.nextInt();
        System.out.println("Please enter the hits: ");
        int hits = sc.nextInt();
        System.out.println("Please enter the doubles: ");
        int Doub = sc.nextInt();
        System.out.println("Please enter the triples: ");
        int Trip = sc.nextInt();
        System.out.println("Please enter the home runs: ");
        int HR = sc.nextInt();
        System.out.println("Please enter the runs: ");
        int run = sc.nextInt();
        System.out.println("Please enter the walks: ");
        int walks = sc.nextInt();
        
        int bases = TB(hits, Doub, Trip, HR);
        double Batt = BA((double)hits,(double) AB, (double)walks);
        double onBase = OBP((double)hits, (double)walks, (double)AB);
        double slugg = SLG((double)bases, (double)AB);
        double onBaseSlugg = OBS(slugg, onBase);
        
        System.out.println(bases);
        System.out.println(Batt);
        System.out.println(onBase);
        System.out.println(slugg);
        System.out.println(onBaseSlugg);
        
     }
     
     public static double BA(double hits, double AB, double walks) {
         
         double BA = hits/AB;
         return BA;
     }
     
     public static double OBP(double hits, double walks, double AB) {
         
         double OBP = (hits + walks)/(AB + walks);
         return OBP;
         
     }
     
     public static double SLG(double bases, double AB) {
         
         double SLG = bases/AB;
         return SLG;
         
     }
     
     public static double OBS(double SLG, double OBP) {
         
         double OBS = SLG + OBP;
         return OBS;
         
     }
     
     public static int TB(int hits, int doubs, int trips, int HR) {
         
         int TB = (hits - doubs - trips - HR) + doubs*2 + trips*3 + HR*4;
         return TB;
         
     }
}

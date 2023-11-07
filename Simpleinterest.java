//This proggram calculates the simple interest to be paid after 5 years
public class Simpleinterest {
    public  static double simpleinterest(double principal,double rate,double time){
        return principal*rate*time;
    
       }
    
    public static void main(String[] args) {
        double pl= 100000;
        double rt= 0.05;
        double t= 5;
        double SI= simpleinterest(pl, rt, t);
        System.out.println("The SI after 5 years is:"+SI);
        
    
    }
}

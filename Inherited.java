//This is a java program using inheritance which displays countries found in different continents of the world
class country {
    void Africa(){
        String newline=System.lineSeparator();
        System.out.println("These are countries found in Africa continent");
        System.out.println("RWANDA"+newline+ "EGYPT"+newline+ "SOUTH AFRICA");
        
    }
}
class pays extends country{
public void Asia(){
    String newline=System.lineSeparator();
    System.out.println("These are countries found in Asia continent:");
    System.out.println("JAPAN" +newline+ "PHILIPPINES"+newline+ "CHINA");
}
}
class Land extends pays{
    void Europe(){
        String newline=System.lineSeparator();
        System.out.println("These are countries found in Europe continent:");
        System.out.println( "FRANCE" + newline + "ITALY" + newline + "SPAIN");
       
    }
}
class paese extends Land{
    void Oceania(){
        String newline=System.lineSeparator();
        System.out.println("These are countries found in Oceania continent:");
        System.out.println( "SAMOA" + newline +"TUVALU" +newline+ "AUSTRALIA" );
        

        }
}
interface landa{
    void America();
}
class C extends paese implements landa{
   public void America(){
    String newline=System.lineSeparator();
    System.out.println("These are countries found in America continent:");
    System.out.println("USA" + newline +"MEXICO" +newline+ "COLUMBIA");
    
}
}
//Main class
public class Inherited {
    public static void main(String[] args) {
        C continento= new C();
        continento.Africa();
        continento.Asia();
        continento.Europe();
        continento.America();
        continento.Oceania();

    }
}

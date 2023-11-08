class country {
    void Africa(){
        System.out.println("RWANDA");
        System.out.println("EGYPT");
        System.out.println("SOUTH AFRICA");
        
    }
}
class pays extends country{
public void Asia(){
    System.out.println("JAPAN");
    System.out.println("PHILIPPINES");
    System.out.println("CHINA");
}
}
class Land extends pays{
    void Europe(){
        System.out.println("FRANCE");
        System.out.println("ITALY");
        System.out.println("SPAIN");
    }
}
interface landa{
    void America();
}
class C extends Land implements landa{
   public void America(){
    System.out.println("USA");
    System.out.println("MEXICO");
    System.out.println("COLUMBIA");
}
}
public class Inherited {
    public static void main(String[] args) {
        C continento= new C();
        continento.Africa();
        continento.Asia();
        continento.Europe();
        continento.America();

    }
}

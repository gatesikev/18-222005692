//This is a java program which uses inheritance to display messages 
class names{
void nom(){
    System.out.println("Je m'appelle Adele");   
}
  
}
 class gender extends names{
    void genre(){
        System.out.println("Female");
    }
}
 class age extends gender{
    void idade(){
        System.out.println("Am 20 years old");
    }
 }
class feeling extends age{
    void emotivo(){
        System.out.println("J'aime ma vie");
    }
 }
 interface keva{
    void GK();
 }
 class t extends names implements keva{
public void GK(){
    System.out.println("This is me");
}
}
//This is the main class
public class inheritance{
    public static void main(String[] args) {
        feeling G= new feeling();
        G.nom();
        G.genre();
        G.idade();
        G.GK();
      G.emotivo();

        

    }
}
  
    
  

public class inheritance {
    public static void main(String[] args) {
        
    }
}

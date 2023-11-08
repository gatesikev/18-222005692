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
 interface keva{
    void GK();
 }
 class t extends names implements keva{
public void GK(){
    System.out.println("This is me");
}
}
public class inheritance{
    public static void main(String[] args) {
        age G= new age();
        G.nom();
        G.genre();
        G.idade();
        G.GK();

        

    }
}
  
    
  

public class inheritance {
    public static void main(String[] args) {
        
    }
}

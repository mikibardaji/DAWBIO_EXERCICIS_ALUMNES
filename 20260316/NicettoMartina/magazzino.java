
import java.util.HashMap;
import java.util.Map;

public class magazzino{

 
    public static void main(String[] args) {
        Map<String,String> magazzino;
        
        magazzino = new HashMap<>();
            
        magazzino.put("P01", "Monitor");
        magazzino.put("P02", "Tastiera");
        magazzino.put("P03", "Mouse");
        if(magazzino.containsKey("P06")==true){
        System.out.println("Esiste il prodotto P06");
        } 
        else
        {
        System.out.println("Non esiste");
        }    

}
}
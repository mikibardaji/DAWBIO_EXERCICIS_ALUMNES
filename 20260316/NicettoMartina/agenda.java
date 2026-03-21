
import java.util.Map;
import java.util.TreeMap;

public class agenda{

 
    public static void main(String[] args) {
        Map<String,Number> agenda; 
        
        agenda = new TreeMap<>();
            
        agenda.put("Zaira", 34567956);
        agenda.put("Albert", 5757467);
       agenda.put("Berta", 67643735);

      agenda.put("Albert", 486748);

      System.out.println("Lista telefonica: ");
      System.out.println(agenda);
        
}
}
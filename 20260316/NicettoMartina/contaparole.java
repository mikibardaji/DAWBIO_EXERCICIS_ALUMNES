
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class contaparole {
    public static void main(String[] args) {
       List<String> frutti = Arrays.asList("mela", "pera", "mela", "banana", "mela", "pera");
Map<String, Integer> contatore = new HashMap<>();

for (String f : frutti) {
    if (contatore.containsKey(f)) {
        contatore.put(f, contatore.get(f) + 1);
    } else {
        contatore.put(f, 1);
    }
}

System.out.println(contatore);
}
}

public class actividad8 {
        public static void main(String[] args) {
          String cadena = "";

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                cadena += "A";
            } else {
                cadena += "T";
            }
        }

        System.out.println(cadena);
    }
}
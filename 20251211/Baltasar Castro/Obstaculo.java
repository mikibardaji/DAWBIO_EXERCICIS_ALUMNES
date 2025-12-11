
import java.util.Random;

public class Block {
    private String tipo;
    private int nivel;

    public Block() {
        Random r = new Random();

        this.tipo = r.nextBoolean() ? "tren" : "barrera";

        if (tipo.equals("tren")) {
            nivel = r.nextInt(6) + 5;
        } else {
            nivel = r.nextInt(5) + 1;
        }

        System.out.println("Obstáculo: " + tipo + " (nivel: " + nivel + ")");
    }

    private Block(boolean maximo) {
        if (maximo) {
            tipo = "tren";
            nivel = 10;
        }
    }

    public static Block maxBlock() {
        return new Block(true);
    }

    public int getNivel() {
        return nivel;
    }

    public String getTipo() {
        return tipo;
    }
}

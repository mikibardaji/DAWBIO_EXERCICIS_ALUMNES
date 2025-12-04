package objectos;

public class mainrettangolo {
    
    public static void main(String[] args) {
        rettangolo ret= new rettangolo(0, 0, 7, 9);


        ret.resultado();

        System.out.println("Perimetro: " + ret.getPerimetro());
        System.out.println("Area: " + ret.getArea());

    }
}
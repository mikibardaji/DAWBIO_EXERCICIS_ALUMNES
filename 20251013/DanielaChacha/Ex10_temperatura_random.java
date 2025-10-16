import java.util.Random;

public class Ex10_temperatura_random 
{
    public static void main(String[] args) 
    {
        Random rd = new Random();
        float temperatura;
        int cont;
        temperatura=0;
        cont=0;

        while (temperatura<36.5)
        {
            temperatura = 35 + rd.nextFloat() * 10;
            cont++;
            System.out.println("Introdueix temperatura: " + temperatura);
        }
        System.out.println("Han calgut " + cont + "  mesures");
    }
}

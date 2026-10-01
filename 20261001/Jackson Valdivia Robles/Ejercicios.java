
public class EjerciciosSecuenciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Ejercicio6();
      Ejercicio7();

      
    }
  public static void Ejercicio6(){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la temperatura en grados celcius: ");
        double Celcius = sc.nextDouble();
        
        double kelvin = Celcius + 273.15;
        
        double Fahrenheit = kelvin * 1.8;
        
        
        System.out.println("Temperatura kelvin = " + kelvin);
        System.out.println("Temperatura farenheit = " + Fahrenheit);
    }
    
    public static void Ejercicio7(){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca distancia en millas nauticas: ");
        double millas = sc.nextDouble();
        
        System.out.println(millas + " millas nauticas son " + (millas * 1852) + " metros");
        
    }
    
}

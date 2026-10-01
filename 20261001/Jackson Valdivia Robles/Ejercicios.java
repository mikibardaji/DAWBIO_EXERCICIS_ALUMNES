
public class EjerciciosSecuenciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio1();
        Ejercicio2();
        Ejercicio3();
        Ejercicio4();
        Ejercicio5();
        Ejercicio6();
        Ejercicio7();

      
    }
public static void Ejercicio1(){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nom = sc.nextLine();
        
        System.out.println("Bon dia " + nom);
    }
    
    
    public static void Ejercicio2(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el largo del cuadrado: ");
        
        int Largo = sc.nextInt();
        
        System.out.println("Introduce el ancho del cuadrado: ");
        
        int Ancho = sc.nextInt();
        
        System.out.println("El area del cuadrado es: " + (Largo * Ancho) + " metros cuadrados");
    
    
    }
    
    
    public static void Ejercicio3(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un numero natural: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Introduzca otro numero natural: ");
    
        double num2 = sc.nextDouble();
        
        double suma = num1 + num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        double resta = num1 - num2;
        
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " x " + num2 + " = " + multiplicacion);
        System.out.println(num1 + " ÷ " + num2 + " = " + division);
    }
    
    
    public static void Ejercicio4(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio del circulo: ");
        
        int radio = sc.nextInt();
        
        int circunferencia = radio * 2;
        
        double area = (Math.PI * (radio * radio));
        
        System.out.println("El diametro del circulo es: " + circunferencia);
        System.out.printf("El area del circulo es: %.2f%n", area);
    }
    
    public static void Ejercicio5(){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el precio nominal de su articulo en dolares: ");
        double Precio_nominal = sc.nextDouble();
        System.out.println("Introduzca el precio real de su articulo en dolares: ");
        double Precio_real = sc.nextDouble();
        
        if(Precio_real < Precio_nominal){
            System.err.println("EL PRECIO REAL DEL ARTICULO NO PUEDE SER MENOR AL NOMINAL");
        }else{
        System.out.println("Su articulo tiene " + (Precio_real - Precio_nominal) + "$ de descuento");
        }
        
        
    
    
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

import java.util.Scanner;

public class Moyano_Sonia_Exe5 {

   public static void main(String[] args) throws Exception {
        
    Scanner sc = new Scanner(System.in);
    double a,b;
    // pedir nombre
    
    System.out.print("Quin és el primer número?");

    //registrar el primer numero a la variable a
    a = sc.nextDouble();

     System.out.print("Quin és el segon número?");
     //registrar el segon número a la variable b
    b = sc.nextDouble();
    //comprobar si a<b indicar l'ordre a i després b
    if (a<b) 
    {
    System.out.println("El ordre dels nombres de manera ascendent és: "+ a +" , "+b);  
    //comprobar si b<a indicar l'ordre b i després a
    }else if (b<a){
    System.out.println("El ordre dels nombres de manera ascendent és: "+ b +" , "+a);  
    }
    //si cap es major indicar que són iguals

    else {System.out.println("Els nombres són iguals");    }
    sc.close();
    }
    }


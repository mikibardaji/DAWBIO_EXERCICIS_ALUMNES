import java.util.Scanner;

public class negatiu {

    public static void main(String[] args) throws Exception {
        
    Scanner sc = new Scanner(System.in);
    double numero;
    // pedir nombre
    
    System.out.print("Quin és el número?");

    //registrar el numero a la variable a
    numero = sc.nextDouble();

    
    //si es major que 0 serà positiu
    if (numero>0) 
    {
    System.out.println("El nombre "+numero+" és positiu ");  
    //si es menor que 0 serà negatiu
    }else if (numero<0){
    System.out.println("El nombre "+numero+" és negatiu");    
    }
    //si és 0 és 0

    else {System.out.println("Els nombres es Zero");    }
    sc.close();
    }
    }

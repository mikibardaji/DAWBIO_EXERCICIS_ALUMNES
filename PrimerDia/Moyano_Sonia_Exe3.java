import java.util.Scanner;

public class mesgran {

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
    //si a<b indicar que b és més gran
    if (a<b) 
    {
    System.out.println("El nombre "+b+" és mes gran que "+a);  
    //si a>b indicar que a és més gran  
    }else if (b<a){
    System.out.println("El nombre "+a+" és mes gran que "+b);    
    }
    //si cap es major indicar que són iguals

    else {System.out.println("Els nombres són iguals");    }
    sc.close();
    }
    }

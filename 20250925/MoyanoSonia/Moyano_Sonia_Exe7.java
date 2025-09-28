import java.util.Scanner;

public class Moyano_Sonia_Exe7 {
public static void main(String[] args) throws Exception {
        
    Scanner sc = new Scanner(System.in);
    double a,b,c;
    // pedir nombre
    
    System.out.print("Quin és el primer número?");

    //registrar el primer numero a la variable a
    a = sc.nextDouble();

    System.out.print("Quin és el segon número?");
     //registrar el segon número a la variable b
    b = sc.nextDouble();

    System.out.print("Quin és el tercer número?");
    //registrar el tercer número a la variable c
    c = sc.nextDouble();
    //si a<b comprobar quin es més gran
    if (a<b) 
    {// si b es més gran comprobem amb c
    if(b<c){// si c és més gran, mostrem que el més gran es c
        System.out.println("El nombre més gran dels tres és: "+c);  
    }else {// si c és fals, mostrem que el més gran es b
        System.out.println("El nombre més gran dels tres és: "+b);  }
    }else if (a>b) 
    {// si a es més gran comprobem amb c
    if(a<c){// si c és més gran, mostrem que el més gran es c
        System.out.println("El nombre més gran dels tres és: "+c);  
    }else {// si c és fals, mostrem que el més gran es b
        System.out.println("El nombre més gran dels tres és: "+a);  }
    
    }
    else if (a==b) 
    {// si a es més gran comprobem amb c
    if(a<c){// si c és més gran, mostrem que el més gran es c
        System.out.println("El nombre més gran dels tres és: "+c);  
    }else {// si c és fals, mostrem que el més gran es a
        System.out.println("El nombre més gran dels tres és: "+a);  }
    }
    else if (b==c)
    {// si a es més gran comprobem amb c
    if(a<c){// si c és més gran, mostrem que el més gran es c
        System.out.println("El nombre més gran dels tres és: "+c);  
    }else {// si c és fals, mostrem que el més gran es b
        System.out.println("El nombre més gran dels tres és: "+a);  }
    }
    else if (a==c)
    {// si a es més gran comprobem amb c
    if(b<c){// si c és més gran, mostrem que el més gran es c
        System.out.println("El nombre més gran dels tres és: "+c);  
    }else {// si c és fals, mostrem que el més gran es b
        System.out.println("El nombre més gran dels tres és: "+b);  }
    }
    sc.close();
    }
    }


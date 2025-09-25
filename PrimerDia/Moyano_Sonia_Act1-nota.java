import java.util.Scanner;

public class nota {

    public static void main(String[] args) throws Exception {
        
    Scanner sc = new Scanner(System.in);
    double nota;
    // pedir nota
    
    System.out.print("Quina nota has tret?");
    nota = sc.nextDouble();
    //si cod<5 suspes
    if (nota<5) 
    {
    System.out.println("Lamentablement has suspès.");    
    

    //si no està suspes
   
     } else if(nota>=5 && nota<6){ System.out.println("Estàs aprovat.");    

     } else if(nota>=6 && nota<9){ System.out.println("Estàs tret una puntuació notable.");   
    
     } else if(nota>=9 && nota<=10){ System.out.println("Estàs tret una puntuació excel·lent.");   
    }
    sc.close();
    }
    }


import java.util.Scanner;

public class bucles6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declaro la variable errores y declaro el array valores arterial
        // creo un bucle que recorra cada valor del array 
        // creo un condicional que almacene + 1 a errores 
        // creo otro condicional en el cual si errores es > 0 muestro al usuario que se encontraron valores criticos
        // si no no se han encontrado valores criticos

        int errores = 0;
        int[] valoresArterial = {100, 120, -111, 150, 102, -123, 102, -200, 113, 140};

        for(int i = 0 ; i < 10 ; i = i + 1 ){
            
            if (valoresArterial[i] < 0) {
                errores = errores + 1;
            }
        };
        if (errores > 0) {
            System.out.print(" se han encontrado valores criticos");
        } else {
            System.out.print(" no se han encontrado valores criticos");
        }
        

        sc.close();
    }   
}

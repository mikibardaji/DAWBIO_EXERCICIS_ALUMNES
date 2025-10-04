import java.util.Scanner;

public class GuerreroMateoExLibre {
    public static void main(String[] args) {

        //Programa que determina el estado de una persona segun su índice de masa corporal
        // Mostrará edad, peso, estatura y IMC

        int edad;
        double peso;
        double estatura;
        double imc;
        String estado = null;


        Scanner sc = new Scanner(System.in);
        System.out.println("-- INTRODUCE TU EDAD PARA CONTINUAR: --");
        edad = sc.nextInt();

        System.out.println("-- INTRODUCE TU PESO EN KILOGRAMOS --");
        peso = sc.nextDouble();

        System.out.println("-- INTRODUCE TU ESTATURA EN METROS --");
        estatura = sc.nextDouble();
        
        imc = peso/(estatura*estatura);

        if (imc<16) {
            estado = "Delgadez severa";
        
        }else if (imc>=16 && imc <=16.9) {
            estado = "Delgadez moderada";
            
        }else if (imc>=17 && imc <=18.4) {
            estado = "Delgadez leve";
            
        }else if (imc>=18.5 && imc <=24.9) {
            estado = "Peso saludable";
            
        }else if (imc>=25 && imc <=29.9) {
            estado = "Sobrepeso";
        
        }else if (imc>=30 && imc <=34.9) {
            estado = "Obesidad grado I";

        }else if (imc>=35 && imc <=39.9) {
            estado = "Obesidad grado II";
            
        }else if (imc>=40) {
            estado = "Obesidad grado III";
            
        }
        System.out.println("--- RESULTADOS ---");
        System.out.println("|Edad........"+ edad);
        System.out.println("|Peso........"+ peso+"kg");  
        System.out.println("|Estatura...."+ estatura+"m");  
        System.out.println("|IMC........."+ imc);
        System.out.println("| "+ estado +" ");
        System.out.println("------------------");

        sc.close();

    }
    
}

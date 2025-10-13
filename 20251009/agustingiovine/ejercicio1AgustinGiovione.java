public class ejercicio1AgustinGiovione {
    public static void main(String[] args) {

        // primero declaro las variables globulos para utilizar en el bucle for y bucle while
        // declaro que cada vez que se ejecute el while aumento el valor mas 1 de globulos
        // muestro al usuario el valor de globulos
        // la condicion es que aumento el valor de globulos o de i cada vez que se ejecuta el bucle de que i o globulos
        // sea menor a 10



        int globulosFor = 0;
        int globulosWhile = 0;

        do { 
            globulosWhile = globulosWhile + 1;
            System.out.println("mostrar globulos while " + globulosWhile);
            
        } while (globulosWhile < 10);

        for (int i = 0 ; i < 10 ; i = i + 1 ) {

            globulosFor = globulosFor + 1;
            System.out.println("mostrar globulos for " + globulosFor);
        }
    }   
}
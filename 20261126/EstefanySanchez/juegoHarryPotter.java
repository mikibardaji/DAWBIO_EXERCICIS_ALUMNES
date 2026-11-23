import java.util.Scanner;

/**
 *
 * @author Estefany.SS
 */
public class juegoHarryPotter {
     public static void main(String[] args) {

        // =================================
        // PRIMERA PREGUNTA
        // =================================

        // Llamamos al primer metodo
        String respuesta = PrimeraPregunta();

        // Comprobamos la primera respuesta
        int resultado = respostaPrimera(respuesta);

        // Mostramos si ha acertado o fallado
        if (resultado == 1) {

            System.out.println("¡Has superado la primera pregunta!");

        } else {

            System.out.println("¡Has fallado! Sigue practicando magia.");

        }

        // =================================
        // SEGUNDA PREGUNTA
        // =================================

        // Llamamos al tercer metodo
        String respuesta2 = preguntaSegona();

        // Comprobamos la segunda respuesta
        int resultado2 = respostaSegona(respuesta2);

        // Mostramos si ha acertado o fallado
        if (resultado2 == 1) {

            System.out.println("¡Has superado la segunda pregunta!");

        } else {

            System.out.println("¡Has fallado la segunda pregunta!");

        }

        // Mensaje final
        System.out.println("==============================");
        System.out.println("¡Gracias por jugar a Harry Potter!");
        System.out.println("==============================");

    }


    // =================================
    // METODO 1: PRIMERA PREGUNTA
    // =================================

    public static String PrimeraPregunta() {

        // Creamos el Scanner
        Scanner lector = new Scanner(System.in);

        // Mostramos el titulo
        System.out.println("==============================");
        System.out.println("        HARRY POTTER");
        System.out.println("==============================");

        // Mostramos la primera pregunta
        System.out.println("¿Como se llama la escuela de magia a la que asiste Harry Potter?");

        // Mostramos las cuatro opciones
        System.out.println("A) Durmstrang");
        System.out.println("B) Hogwarts");
        System.out.println("C) Beauxbatons");
        System.out.println("D) Ilvermorny");

        // Pedimos la respuesta completa
        System.out.println("Escribe tu respuesta:");

        String respuesta = lector.nextLine();

        // Convertimos la respuesta a mayusculas
        respuesta = respuesta.toUpperCase();

        // Devolvemos la respuesta
        return respuesta;

    }


    // =================================
    // METODO 2: COMPROBAR PRIMERA RESPUESTA
    // =================================

    public static int respostaPrimera(String respuesta) {

        // Convertimos a mayusculas y quitamos espacios
        respuesta = respuesta.toUpperCase().trim();

        // Comprobamos si la respuesta es correcta
        if (respuesta.equals("HOGWARTS")) {

            System.out.println("¡Correcto! ¡Eres digno de Hogwarts!");

            return 1;

        } else if (respuesta.equals("DURMSTRANG")) {

            System.out.println("¡Ups! Te has equivocado de escuela.");

        } else if (respuesta.equals("BEAUXBATONS")) {

            System.out.println("¡Casi! Esa escuela no es donde estudia Harry.");

        } else if (respuesta.equals("ILVERMORNY")) {

            System.out.println("¡Vaya! Esa escuela esta en Estados Unidos.");

        } else {

            // Si escribe una respuesta que no es valida
            System.out.println("¡Respuesta no valida! Ni siquiera Dumbledore sabe que has querido decir.");

        }

        // Si falla, devolvemos 0
        return 0;

    }


    // =================================
    // METODO 3: SEGUNDA PREGUNTA
    // =================================

    public static String preguntaSegona() {

        // Creamos el Scanner
        Scanner lector = new Scanner(System.in);

        // Mostramos la segunda pregunta
        System.out.println("==============================");
        System.out.println("         PREGUNTA 2");
        System.out.println("==============================");

        System.out.println("¿Como se llama la lechuza de Harry Potter?");

        // Mostramos las cuatro opciones
        System.out.println("A) Errol");
        System.out.println("B) Hedwig");
        System.out.println("C) Fawkes");
        System.out.println("D) Crookshanks");

        // Pedimos la respuesta completa
        System.out.println("Escribe tu respuesta:");

        String respuesta = lector.nextLine();

        // Convertimos la respuesta a mayusculas
        respuesta = respuesta.toUpperCase();

        // Devolvemos la respuesta
        return respuesta;

    }


    // =================================
    // METODO 4: COMPROBAR SEGUNDA RESPUESTA
    // =================================

    public static int respostaSegona(String respuesta) {

        // Convertimos a mayusculas y quitamos espacios
        respuesta = respuesta.toUpperCase().trim();

        // Comprobamos si la respuesta es correcta
        if (respuesta.equals("HEDWIG")) {

            System.out.println("¡Correcto! ¡Hedwig estaria orgullosa!");

            return 1;

        } else if (respuesta.equals("ERROL")) {

            System.out.println("¡Ups! Esa es la lechuza de la familia Weasley.");

        } else if (respuesta.equals("FAWKES")) {

            System.out.println("¡Casi! Fawkes es el fenix de Dumbledore.");

        } else if (respuesta.equals("CROOKSHANKS")) {

            System.out.println("¡Te has confundido! Es el gato de Hermione.");

        } else {

            // Si escribe una respuesta que no es valida
            System.out.println("¡Respuesta no valida!");

        }

        // Si falla, devolvemos 0
        return 0;

    }


} 
    










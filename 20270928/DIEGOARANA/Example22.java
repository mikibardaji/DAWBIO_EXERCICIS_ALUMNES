/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example22;

public class Example22 {

public static void main(String[] args) {
// 1. Dinero inicial en la cartera
double dinero_cartera = 50;
System.out.println("Dinero inicial en la cartera: " + dinero_cartera + "€");

// 2. Precio de una entrada de cine
double precio_entrada = 8.50;
System.out.println("Precio de una entrada de cine: " + precio_entrada + "€");

// 3. Cantidad de entradas compradas
int cantidad_entradas = 2;
System.out.println("Cantidad de entradas compradas: " + cantidad_entradas);

// 4. Calcular: gasto_total_entradas
double gasto_total_entradas = precio_entrada * cantidad_entradas;

// 5. Mostrar "Gasto total de entradas"
System.out.println("Gasto total de entradas: " + gasto_total_entradas + "€");

// 6. Calcular: dinero_restante
double dinero_restante = dinero_cartera - gasto_total_entradas;

// 7. Mostrar "Dinero restante para palomitas y bebida"
System.out.println("Dinero restante para palomitas y bebida: " + dinero_restante + "€");
    }
}
    

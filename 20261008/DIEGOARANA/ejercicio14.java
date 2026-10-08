/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package ejercicio14;

import java.util.Scanner;

/**
*
* @author diego90895
*/
public class ejercicio14 {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// 14. Desenvolupeu un programa que entri un import en euros, mostri un menú amb diferents monedes,
// llegeixi el nom de la moneda i mostri la conversió a la moneda escollida.

Scanner lector = new Scanner(System.in);

double euros, francSuis, dolarCanadenc, pesoMexica, realBrasiler;
final double canvioFrancSuis = 0.95;
final double canvioDolarCanadenc = 1.48;
final double canvioPesoMexica = 21.50;
final double canvioRealBrasiler = 6.10;

System.out.print("Quant es el teu import en euros? ");
euros = lector.nextDouble();

System.out.println("A quina moneda ho vols passar? ");
System.out.println("a - Franc Suis");
System.out.println("b - Dolar Canadenc");
System.out.println("c - Peso Mexica");
System.out.println("d - Real Brasiler");
System.out.print("Introdueix la lletra de la moneda: ");
char moneda = lector.next().charAt(0);

switch (moneda){
case 'a':
francSuis = euros * canvioFrancSuis;
System.out.println("Ara tens: " + francSuis + " CHF.");
break;
case 'b':
dolarCanadenc = euros * canvioDolarCanadenc;
System.out.println("Ara tens: " + dolarCanadenc + " CAD.");
break;
case 'c':
pesoMexica = euros * canvioPesoMexica;
System.out.println("Ara tens: " + pesoMexica + " MXN.");
break;
case 'd':
realBrasiler = euros * canvioRealBrasiler;
System.out.println("Ara tens: " + realBrasiler + " BRL.");
break;
default:
System.out.println("Lletra no valida.");
}
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication.pkg1;
import java.util.Scanner;

/**
 *
 * @author msh6189
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String nom;
       
        System.out.println("Introdueix el teu nom:");
        nom = sc.nextLine();
       
        System.out.println("Bon dia " + nom);

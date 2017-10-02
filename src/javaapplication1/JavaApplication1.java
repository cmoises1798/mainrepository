/*
 * To change this license header, choose License Headerss in Proyect Properties.
 * To change this template file, choose Tools | Template
 * and open the template in the editor.
 */
package javaApplication1;
import java.util.Scanner;

/**
 * 
 * @author A9
 */
public class JavaApplication1{
        
/**
 * 
 * @param args the command line arguments
 */
public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
    System.out.println("Digite un numero");
    int numer1 = Integer.parseInt(reader.nextLine());
    System.out.println("Digite otro numero");
    int numer2 = Integer.parseInt(reader.nextLine());
    
    if (numer1>numer2) {
        String toPrint = "\nEl mayor numero de los ingresados es :"+numer1;
        System.out.println(toPrint);
        }
    else {
        String toPrint ="\nEl mayor numero de los ingresados es:"+numer2;
        System.out.println(toPrint);
        }
    }
}
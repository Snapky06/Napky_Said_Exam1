/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_examen;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author saidn
 */
public class Napky_Rajo_Piramide {
    public static void main(String[] args) {
        
            System.out.println("-------Piramide-------\n");
            
            Scanner leer = new Scanner(System.in);
                    
            System.out.println("--------------------------------------");
            System.out.print("Cuantas Filas Desea Para Su Columna : ");
            int numero_filas = leer.nextInt();
            System.out.println("--------------------------------------\n");
            
            
            int primer_valor=1;
            int incremento=2;
            
            for(int indice = 1;indice<=numero_filas;indice++ ){
            int suma = 0;
            for(int indice2=0;indice2<indice;indice2++){
                System.out.print(primer_valor+" ");
                suma+=primer_valor;
                primer_valor+=incremento;
            }
                System.out.println("= "+ suma);
            }
            
    }
}

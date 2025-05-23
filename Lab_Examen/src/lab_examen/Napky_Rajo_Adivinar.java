/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_examen;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author saidn
 */
public class Napky_Rajo_Adivinar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Random rand = new Random();
        int numero_escogido=0;
        int numero_intentos = 0;
        int numero_para_adivinar = rand.nextInt(100)+1;
        
        System.out.println("-----------------------------------------");
        System.out.println("Tiene 10 Intentos Para Adivinar El Numero");
        System.out.println("-----------------------------------------\n");
        do{
            
            numero_intentos++;
            
            System.out.println("-------------");
            System.out.println("Intentos : "+numero_intentos);
            System.out.println("-------------");
                    
            System.out.println("\n----------------------------");
            System.out.print("Adivine El Numero (1-100) : ");
            numero_escogido = leer.nextInt();
            System.out.println("----------------------------\n");
            if(numero_escogido>100){
                System.out.println("\n----------------------------");
                System.out.println("El Numero Que Escogio Es Mayor Al Limite");
                System.out.println("----------------------------\n");
                
                System.out.println("\n----------------------------");
            System.out.print("Adivine El Numero (1-100) : ");
            numero_escogido = leer.nextInt();
            System.out.println("----------------------------\n");
            numero_escogido = leer.nextInt();
            }else if(numero_escogido<1){
                System.out.println("\n----------------------------");
                System.out.println("El Numero Que Escogio Es Menor Al Limite");
                System.out.println("----------------------------\n");
                
                System.out.println("\n----------------------------");
            System.out.print("Adivine El Numero (1-100) : ");
            numero_escogido = leer.nextInt();
            System.out.print("----------------------------\n");
            }
            
            if(numero_escogido<numero_para_adivinar){
                System.out.println("\n------------------------------");
                System.out.println("El Numero Que Escogio Es Menor");
                System.out.println("------------------------------\n");
            }else if(numero_escogido>numero_para_adivinar){
                System.out.println("\n------------------------------");
                System.out.println("El Numero Que Escogio Es Mayor");
                System.out.println("------------------------------\n");
            }else if(numero_escogido==numero_para_adivinar){
                System.out.println("\n---------------------------");
                System.out.println("Escogio El Numero Correcto ");
                System.out.println("---------------------------\n");
                numero_intentos=10;
            }
            
            if(numero_intentos==10){
                System.out.println("------------------------");
                System.out.println("Se Acabaron Sus Intentos");
                System.out.println("El Numero Era : "+numero_para_adivinar);
                System.out.println("------------------------");
            }
            
        }while(numero_intentos<10);
        
    }
}

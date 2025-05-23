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
public class Napky_Said_Piedra_Papel_Tijera {
    public static void main(String[] args) {
        String piedra_papel_tijera="";
        String juego_usuario="";
                boolean jugar_de_nuevo=false;
                String si_no="";
        System.out.println("--------------------------------------------");       
        System.out.println("Bienvenido Al Juego De Piedra Papel O Tijera");
        System.out.println("--------------------------------------------");  
        Scanner leer = new Scanner(System.in);
        do{
        Random rand = new Random();
        
        int numero_random = rand.nextInt(3)+1;
        
        if(numero_random==1){
        piedra_papel_tijera="piedra";
        }else if(numero_random==2){
                piedra_papel_tijera="papel";
                }else if(numero_random==3){
                piedra_papel_tijera="tijera";
                }
        
        System.out.println("\n----------------------------------------------------");
        System.out.print("Que Jugada Decide Hacer (piedra o papel o tijera) :  ");
        juego_usuario = leer.next().toLowerCase();
        System.out.println("Jugada Del Oponente : "+piedra_papel_tijera);
        System.out.println("----------------------------------------------------");
           
        System.out.println("\n----------------------------------------------------");
        if(juego_usuario.equals("papel")&&piedra_papel_tijera.equals("tijera")){
            System.out.println("El Ganador A Sido La Computadora");
        }else if(juego_usuario.equals("piedra")&&piedra_papel_tijera.equals("papel")){
        System.out.println("El Ganador A Sido La Computadora");
        }else if(juego_usuario.equals("tijera")&&piedra_papel_tijera.equals("piedra")){
        System.out.println("El Ganador A Sido La Computadora");
        }else if(juego_usuario.equals("papel")&&piedra_papel_tijera.equals("piedra")){
            System.out.println("El Ganador A Sido Usted");
        }else if(juego_usuario.equals("piedra")&&piedra_papel_tijera.equals("tijera")){
        System.out.println("El Ganador A Sido Usted");
        }else if(juego_usuario.equals("tijera")&&piedra_papel_tijera.equals("papel")){
        System.out.println("El Ganador A Sido Usted ");
        }else if(juego_usuario.equals(piedra_papel_tijera)){
            System.out.println("A Habido Un Empate");
        }else{
            System.out.println("No A Habido Un Ganador Claro");
        }
        System.out.println("----------------------------------------------------\n");
        
            System.out.println("---------------------------------");
            System.out.print("Desea Jugar Otra Vez (si o no) :  " );
            
            si_no = leer.next().toLowerCase();
            System.out.println("---------------------------------");
            if(si_no.equals("si")){
            jugar_de_nuevo=true;
            }else{
            jugar_de_nuevo=false;
            }
        }while(jugar_de_nuevo);
        
        
    }
}

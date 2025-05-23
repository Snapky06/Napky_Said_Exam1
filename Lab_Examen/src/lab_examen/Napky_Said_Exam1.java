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
public class Napky_Said_Exam1 {
    public static void main(String[] args) {
        int opcion=0;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random rand = new Random();
        
        do{
            System.out.println("\n-----Examen Lab 1-----");
            System.out.println("[1]Piramide");
            System.out.println("[2]Clave");
            System.out.println("[3]Piedra Papel O Tijera");
            System.out.println("[4]Adivinar");
            System.out.println("[5]Salir Del Programa");
            System.out.print("Seleccione : ");
        
            opcion = leer.nextInt();
            System.out.println("----------------------\n");
            if(opcion<1&&opcion>5){
                System.out.println("\n------------------------------");
                System.out.println("Escogio Una Opcion Inexistente");
                System.out.println("------------------------------\n");
            }
            
            switch(opcion){
            
                case 1 : 
                    
                    System.out.println("-------Piramide-------\n");
                    
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
                    
                    break;
                    
                case 2 :
                    
                    System.out.println("-----Clave-----\n");
        int opcion_clave = 0;
        String mensaje = "", abecedario = "abcdefghijklmnñopqrstuvwxyz", abecedario_mayuscula = "ABCDEFGHIJKLMNñOPQRSTUVWXYZ";
        String palabra_cifrada = "";
        char letra = ' ', letra2 = ' ';
        do {
            System.out.println("\n---------------------");
            System.out.println("[1]Cifrar Un Texto");
            System.out.println("[2]Descifrar Un Texto");
            System.out.println("[3]Salir De Clave");
            System.out.print("Seleccione : ");
            opcion_clave = leer.nextInt();
            System.out.println("---------------------\n");

            if (opcion_clave != 1 && opcion_clave != 3 && opcion_clave != 2) {

                System.out.println("\n---------------------------------");
                System.out.println("El Numero Que Ingreso Es Invalido");
                System.out.println("---------------------------------\n");
            }

            switch (opcion_clave) {
                case 1:
                    palabra_cifrada = "";
                    System.out.println("\n-------------------------");
                    System.out.print("Que Texto Desea Descifrar : ");

                    mensaje = leer.next();
                    System.out.println("-------------------------\n");

                    for (int indice = 0; indice < mensaje.length(); indice++) {
                        letra = mensaje.charAt(indice);

                        if (letra == ' ') {
                            palabra_cifrada += " ";
                        } else {
                            boolean letraEncontrada = false;

                            for (int indice2 = 0; indice2 < abecedario.length(); indice2++) {
                                letra2 = abecedario.charAt(indice2);

                                if (letra == letra2) {
                                    int nuevoIndice = (abecedario.length() - 1 - indice2);
                                    palabra_cifrada += abecedario.charAt(nuevoIndice);
                                    letraEncontrada = true;
                                    break;
                                }
                            }

                            if (!letraEncontrada) {

                                for (int indice3 = 0; indice3 < abecedario.length(); indice3++) {
                                    letra2 = abecedario_mayuscula.charAt(indice3);

                                    if (letra == letra2) {
                                        int nuevoIndice = (abecedario_mayuscula.length() - 1 - indice3);
                                        palabra_cifrada += abecedario_mayuscula.charAt(nuevoIndice);
                                        letraEncontrada = true;
                                        break;
                                    }

                                }

                            }

                            if (!letraEncontrada) {
                                palabra_cifrada += letra;
                            }
                        }

                    }
                    System.out.println("-------------------------\n");
                    System.out.println("Texto Cifrado : " + palabra_cifrada);
                    System.out.println("-------------------------\n");
                    break;

                case 2:  
    if (palabra_cifrada.equals("")) {
    System.out.println("\n----------------------------------------------------------------");
    System.out.println("No hay palabra cifrada para descifrar. Primero cifra un mensaje.");
    System.out.println("----------------------------------------------------------------\n");
        break;
    }
    if (palabra_cifrada.equals("Volvio A Intentar")) {
    System.out.println("\n----------------------------------");
    System.out.println("Ya Descifro Esta Palabra Una Vez.");
    System.out.println("----------------------------------\n");
        break;
    }
    

    String mensajeDescifrado = "";
    System.out.println("\n-------------------------");
    System.out.println("Descifrando la clave : "+palabra_cifrada);
    System.out.println("-------------------------\n");

    for (int indice = 0; indice < palabra_cifrada.length(); indice++) {
        letra = palabra_cifrada.charAt(indice);

        if (letra == ' ') {
            mensajeDescifrado += " ";
        } else {
            boolean letraEncontrada = false;

            for (int indice2 = 0; indice2 < abecedario.length(); indice2++) {
                letra2 = abecedario.charAt(indice2);

                if (letra == letra2) {
                    int nuevoIndice = abecedario.length() - 1 - indice2;
                    mensajeDescifrado += abecedario.charAt(nuevoIndice);
                    letraEncontrada = true;
                    break;
                }
            }

            if (!letraEncontrada) {
                for (int indice3 = 0; indice3 < abecedario_mayuscula.length(); indice3++) {
                    letra2 = abecedario_mayuscula.charAt(indice3);

                    if (letra == letra2) {
                        int nuevoIndice = abecedario_mayuscula.length() - 1 - indice3;
                        mensajeDescifrado += abecedario_mayuscula.charAt(nuevoIndice);
                        letraEncontrada = true;
                        break;
                    }
                }
            }

            if (!letraEncontrada) {
                mensajeDescifrado += letra;
            }
        }
    }
    System.out.println("\n-------------------------");
    System.out.println("Mensaje descifrado: " + mensajeDescifrado);
    System.out.println("-------------------------\n");
    
    palabra_cifrada="Volvio A Intentar";
    break;

            }

        } while (opcion_clave != 3);
                    
                    break;
            
                case 3:
                    
                    String piedra_papel_tijera="";
        String juego_usuario="";
                boolean jugar_de_nuevo=false;
                String si_no="";   
        System.out.println("\n-----Piedra Papel O Tijera-----\n"); 
        
        do{
        
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
        
        
                    
                    break;
                    
                case 4:
                    
                    int numero_escogido=0;
        int numero_intentos = 0;
        int numero_para_adivinar = rand.nextInt(100)+1;
        
                    System.out.println("\n-----Adivinar-----\n");
        
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
                numero_intentos=11;
            }
            //hkhkhkhkhkhjhjjhjjhhj
            if(numero_intentos==10){
                System.out.println("------------------------");
                System.out.println("Se Acabaron Sus Intentos");
                System.out.println("El Numero Era : "+numero_para_adivinar);
                System.out.println("------------------------");
            }
            
        }while(numero_intentos<10);
                    
                    break;
            }
        }while(opcion!=5);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_examen;

import java.util.Scanner;

/**
 *
 * @author saidn
 */
public class Napky_Rajo_Clave {

    public static void main(String[] args) {
        System.out.println("-----Clave-----\n");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
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
    }
}

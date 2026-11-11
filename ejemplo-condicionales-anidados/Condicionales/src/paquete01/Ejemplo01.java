/*
 * Dada una opción (1,2,3), imprimir los valores de verdad
 * para la operación de a y b. Donde 1 es para AND, 2 para OR, 3 para NOT
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese la operación que requiere generar\n"
                + "1. AND\n"
                + "2. OR\n"
                + "3. NOT");
        opcion = entrada.nextInt();
        
        if (opcion > 0 && opcion <= 3) {
            if (opcion==1) {
                System.out.printf("%s\n", "Trabajar con AND");
                
            }else{
                if (opcion==2) {
                    System.out.printf("%s\n", "Trabajar con OR");
                }else{
                    // se asume opción = 3
                    // sería con NOT
                    System.out.printf("%s\n", "Trabajar con NOT");
                }
            }
        }else{
            System.out.printf("%s\n", "Opción inválida");
        }

    }

}

/*
Al usuario se le presenta el mensaje de con que quiere manejar el selcciona 
trabajar con AND asi que selecciona la opcion 1, el proceso ejecutara la
primera condicion de si 1>0 && 1<=3 la cual es verdadera, seguimos a la segunda
condicion de si 1 == 1 lo cual es verdadera y presentara el mensaje de que 
esta trabajando con AND.
*/
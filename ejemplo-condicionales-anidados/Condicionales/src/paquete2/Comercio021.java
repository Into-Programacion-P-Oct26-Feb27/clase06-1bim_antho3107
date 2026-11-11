/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Comercio021 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        
        String comercio;
        String nombre;
        String apellido;
        String region;
        int edad;
        double sueldoBasico;
        int numeroProductos;
        
        double productividad;
        double coeficiente = 0.6;
        double bono  = 0;
        
        double porcentajeSeguro;
        double adicionalSeguro;
        
        double sueldoFinal; 
        
        System.out.println("Ingrese el nombre del comercio");
        comercio = entrada.nextLine();
        
        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese la region del Ecuador de donde es viva");
        region = entrada.nextLine();
        
        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el sueldo básico por favor");
        sueldoBasico = entrada.nextDouble();        
        
        System.out.println("Ingrese el número de productos vendidos "
                + "por favor");
        numeroProductos = entrada.nextInt();
        
        // calcular la productividad
        productividad = numeroProductos * coeficiente;
        
        if (productividad<=30){
            bono = 25; // $25
        }else{
            if (productividad>30 && productividad<80){
                bono = 50;
            }else{
                if (productividad>=80 && productividad < 200) {
                    bono = 100;
                }else{
                    if(productividad >= 200 && productividad <= 500){
                        bono = 200;
                    }else{
                        if(productividad >500){
                            bono = 300;
                        }
                    }
                }
            }
        }
        
        if (region.equals("Sierra")) {
            porcentajeSeguro = 10;
        } else {
            if (region.equals("Costa")) {
                porcentajeSeguro = 12;
            } else {
                if (region.equals("Oriente")) {
                    porcentajeSeguro = 15;
                } else {
                    if (region.equals("Insular")) {
                        porcentajeSeguro = 30;
                    } else {
                        porcentajeSeguro = 8; 
                        /*
                        Lo usamos para que la variable tenga un valor si 
                        es que no se cumplio ninguna condicion y no se quede
                        sin ningun valor.a
                        */
                    }
                }
            }
        }
        
        
        adicionalSeguro = (sueldoBasico * porcentajeSeguro)/100;
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;
        
        System.out.printf("Reporte de Empleado %s\n\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Sueldo: $%.2f\n"
                + "Número de productos vendidos: %d\n"
                + "\tProductidad: %.2f\n"
                + "\tBono: $%.2f\n"
                + "Adicional del seguro: $%.2f\n\n"
                + "Sueldo final: $%.2f\n",
                comercio,
                nombre, 
                apellido,
                edad,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                adicionalSeguro,
                sueldoFinal);
        
        
    }
    
}

/*
De acuerdo a nueva normativa el % del seguro es variable si el empleado es de:
Sierra 10%
Costa 12%
Oriente 15%
Insular 30%
Acoplar una solucion para una nueva normativa
*/

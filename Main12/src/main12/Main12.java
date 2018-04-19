
package main12;
/* 12.- Excepciones
Crear dos excepciones propias para lo siguiente: Un programa que calcule las raíces de un
polinomio de segundo grado, pedir los diferentes coeficientes (a, b y c) al usuario.
Pero que lance una excepción propia cuando no es de segundo grado y mandar el mensaje. 
Y lanzar la
excepción propia llamada "Imaginario" y que el mensaje que imprima "Raíces complejas, no
las puedo calcular"*/

import java.io.IOException;
import java.util.Scanner;


public class Main12 {
    public static void main(String[] args) {
        double a,b,c,x1,x2;
        double discriminante;
        double denominador;
        
        try{Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese valores ax,bx,c separados por ',': ");
        
        String valores = leer.nextLine(); 
        String [] numeros = valores.split(","); //separa los numeros

        a = Double.parseDouble(numeros[0]); 

        b = Double.parseDouble(numeros[1]); 

        c = Double.parseDouble(numeros[2]); 

        discriminante = (b*b)-(4*(a*c));
        denominador=(2*a);
        
        if (discriminante < 0) {
        System.out.println ("La Ecuacion No Tiene Soluciones Reales");
        throw new Exception("perro");
        }

        if (discriminante ==0) {
        System.out.println("La ecuacion tiene solo una raiz real");
        
        x1 = (-b)/(2*a);
        System.out.println ("La Solucion es, X1=X2 : " +x1);
        }
        
        if (discriminante > 0) {
        System.out.println ("La ecuacion tiene dos raizes reales");
        x1 = (-b + Math.sqrt(discriminante)/denominador);
        x2 = (-b - Math.sqrt(discriminante)/denominador);
        System.out.println("La solucion de x1: "+x1);
        System.out.println("La solucion de x2: "+x2);
        }
        }catch(Exception e){
        System.out.println("jajajjaja");
        
        }

    }

}

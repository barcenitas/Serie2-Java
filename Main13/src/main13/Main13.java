
package main13;

import java.util.Scanner;

/*simplifique
 13. Realizar un programa que simplifique una fracción a su mínima expresión. (Si la entrada
es de 9/81 por ejemplo, la salida debe ser 1/9). Considerar excepciones posibles.
 */
public class Main13 {

    public static void main(String[] args) {

        int v1,v2,v3,v4,minEx;
        int numerador;
        int denominador;
        
        String valores;
        String [] numeros;
        ///////////
        String valores2;
        String [] numeros2;
        try{
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese el primer numero (nuemerador )de dos cifras separados por ',': ");

               valores = leer.nextLine(); 
               numeros = valores.split(","); //spara los numerosepara los numeros

                v1 = Integer.parseInt(numeros[0]); 
                v2 = Integer.parseInt(numeros[1]); 
                System.out.println("Ingresaste: "+v1+"+"+v2+"="+v1+v2);

                /////////
                Scanner leer2 = new Scanner(System.in);
                System.out.println("Ingrese el primer numero (nuemerador )de dos cifras separados por ',': ");

               valores = leer2.nextLine(); 
               numeros = valores.split(","); //separa los numeros

                v3 = Integer.parseInt(numeros[0]); 
                v4 = Integer.parseInt(numeros[1]); 
                System.out.println("Ingresaste: "+v3+"+"+v4+"="+v3+v4);
                //////////////
                System.out.println("Vas a dividir: "+v1+v2+"/"+v3+v4);
                

                    
                    System.out.println("La minima expresion a dividir es: "+v1+v2+"/"+v3+v4);
                
                
           }catch(Exception e){
                System.out.println("jajajjaja");
        
        } 
    }
    
}

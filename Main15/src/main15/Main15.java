/*
 15.- Cifrado Cesar
Programa que realice un cifrado César. Recibe como argumentos un 1 si se quiere cifrar o un
0 si se quiere descifrar por línea de comandos. Ejemplo:
java Cifrado 1
Dependiendo de la bandera se realizará el desplazamiento de 3 caracteres ya sea a la derecha
o a la izquierda. Ejemplo:
    java Cifrado 1
    Cadena ingresada -> hola
    Cadena cifrada -> krñd
    java Cifrado 0
    Cadena ingresada -> dglrv
    Cadena descifrada -> adiós
*/

package main15;

import java.util.ArrayList;
import java.util.Scanner;

public class Main15 {


	public static void main(String[] args) {

		/*char[] Abecedario={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		Ya está definida por java*/
		Scanner s = new Scanner(System.in);
		ArrayList<Character> caracter = new ArrayList<Character>();

		if(args[0].equals("0")){
			System.out.print("La palabra a cifrar es: "); 
			String palabra = s.nextLine();
			for(int indice=0; indice<palabra.length(); indice++) caracter.add(palabra.charAt(indice));
				for(int indice=0; indice<caracter.size(); indice++)
				{

					char aux = (char) ((int) caracter.get(indice)+3);

					caracter.set(indice,aux);
				}
				System.out.println("La palabra cifrada es: "+caracter);

			}else{
				args[0].equals("1");
				System.out.print("\n Ingresa la palabra a Descifrar: "); 
				String palabra = s.next();
				for(int indice=0; indice<palabra.length(); indice++) caracter.add(palabra.charAt(indice));
					for(int indice=0; indice<caracter.size(); indice++)
					{
						char aux = (char) ((int) caracter.get(indice)-3);
						caracter.set(indice,aux);
					}
					System.out.println("\n Palabra descifrada: "+caracter);

				}   
			}

		}

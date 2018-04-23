/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main12;

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
    	double A,B,C;
    	ExceptionComplex a = new ExceptionComplex();

    	System.out.println("Ingrese valores ax,bx,c separados por ',': ");
    	while (true) {
        	try{Scanner leer = new Scanner(System.in); 
                
                String valores = leer.nextLine(); 
                String [] numeros = valores.split(","); //separa los numeros
                
                A = Double.parseDouble(numeros[0]); 

                B = Double.parseDouble(numeros[1]); 

                C = Double.parseDouble(numeros[2]); 
       
                
            	break;
        	}catch(NumberFormatException e) {
            	System.out.println("Ingrese un numero valido");
        	}
    	}

    	Operaciones p = new Operaciones(A,B,C);   	 
    	try {
        	p.Raiz();
       	 
    	}catch(ExceptionComplex ce) {
        	System.out.println(a.getMessage());
    	}
	}
}


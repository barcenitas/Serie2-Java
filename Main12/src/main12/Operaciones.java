/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main12;

/**
 *
 * @author Erick
 */

    
public class Operaciones {
	double A,B,C;
	public Operaciones(double A, double B, double C) {
    	this.A=A;
    	this.B=B;
    	this.C=C;
	}

	public void Raiz() throws ExceptionComplex {
        
   	double discriminante = (B*B)-(4*(A*C));
        double denominador=(2*A);
        
    	if (discriminante>0) {
        	System.out.println("Las raices son las siguientes:");
                        
              System.out.println("X1"+"="+((-B + Math.sqrt(discriminante))/(denominador))); 
             System.out.println("X2"+"="+((-B - Math.sqrt(discriminante))/(denominador)));
    	}
    	else if (discriminante<0){
        	throw new ExceptionComplex();
    	}
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main16;
public class Asterisco extends Rombo{
    public void at1(int numero){
        char caracter='*';
        for(int i=0; i<numero; i++){
            System.out.println();
                    for(int j=0; j <numero-i-1; j++){
                            System.out.print(" ");       
                    }for(int k=0; k<2*i+1;k++){
                            System.out.print(caracter);
                    }           
        }
    
    }
}

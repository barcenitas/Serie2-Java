/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main16;

import java.util.Scanner;
import java.io.IOException;

public class Rombo {
 //Asterisco a = new Asterisco();
    public void Rom(){
    
        int numero=0;
        Scanner s = new Scanner(System.in);
        Asterisco a = new Asterisco();
        Asterisco2 b = new Asterisco2();
        try{ 
            System.out.print("Ingresa un numero: ");
            numero=s.nextInt();
            a.at1(numero);
            b.at2(numero);
        }catch(Exception e){
        }
    }
}

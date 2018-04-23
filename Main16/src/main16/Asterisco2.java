
package main16;


public class Asterisco2  extends Rombo{
        public void at2(int numero){
        char caracter='*';
        for(int j=numero-2; j>=0; j--){
            System.out.println();
                    for(int i=0; i <numero-j-1; i++){
                            System.out.print(" ");       
                    }for(int i=0; i<2*j+1; i++){
                            System.out.print(caracter);
                    }           
        }
        }
}

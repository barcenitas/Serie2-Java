
package main17;

import java.util.Scanner;


/**
 *
 * @author erick
 */
public class Disco extends Torre{
    // Definimos los discos
        
    public void Disco(){
            System.out.print("Ingresa el numero de discos: ");
            Scanner sc = new Scanner(System.in);
            int ndiscos = Integer.parseInt(sc.nextLine());
            
        int nDisks = ndiscos;
        
        doTowers(nDisks, 'A', 'B', 'C');
    }
}

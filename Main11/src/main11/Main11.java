
package main11;
/*
 11.- Zoológico (Arreglo de animales, polimorfismo)
Interfaz animal, habrá dos tipos de animales, unos carnívoros (clase padre) como tigres,
leones, pumas (clases hijas) y otros herbívoros (clase padre) como antílopes, cebras, venados
(clases hijas). Cada uno de los animales tendrá su comida favorita (atributo). 

Los animales podrán hacer distintas funciones como jugar (mismo tipo, aunque no sea verdad) o comerse
a otro animal (tipos distintos) dependiendo el caso (se pasa el animal a interactuar y se
checara si es carnívoro o herbívoro). En el main hacer unas pruebas de la interacción entre
estos animales, todos los animales serán tratados como “animal” para el pase en parámetros.
*/

public class Main11 {

    public static void main(String[] args) {

 
        Carnivoros tg = new Tigre();
        Herbivoros al = new Antilope();
        
        tg.comer();
        tg.jugar();
        al.comer();
        al.jugar();
        

    }
    
}

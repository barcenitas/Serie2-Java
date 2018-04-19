/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main17;

/**
 *
 * @author erick
 */
public class Torre{
        public static void doTowers(int topN, char from,char inter, char to) {
        if (topN == 1){
            System.out.println("Disk 1 from " + from + " to " + to);
        }else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disco " + topN + " desde " + from + " hacia " + to);
            // llamada recursiva
            doTowers(topN - 1, inter, from, to);
        }
    } 
}

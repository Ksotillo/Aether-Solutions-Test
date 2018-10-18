/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaaethersolutions;

/**
 *
 * @author Familia Sotillo
 */
public class Pregunta1 {
    /* >Problema 1

The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000. */
    public void solucion(){
        int aux = 0;
        for (int i = 0; i < 1011; i += 11) {
            aux = aux + i;
             System.out.println(i);
}
        System.out.println("The series equals to " + aux + " not to 10405071317. Also 1010 does not belongs to the series.");
}
    //El problema carece de congruencia, para empezar la Serie nunca llega a 1010 y mucho menos la suma da: 10405071317
   
}

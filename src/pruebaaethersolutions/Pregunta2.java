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
public class Pregunta2 {

    /* >Problema 2

In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:
1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
It is possible to make £2 in the following way:
1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
How many different ways can £2 be made using any number of coins? */
    private double p1 = 0;
    private final double p[] = {0, 1, 2, 5, 10, 20, 50, 100, 200};
    private final double n = 200;

    public double factorial(double n, double m) {
        //Multiplica desde n hasta m-1. n>=m
        double f = 1;
        while (n > m) {
            f = f * n;
            n--;
        }
        return f;
    }

    public void solucion() {
        for (int i = 0; i < p.length; i++) {
            double r = p[i];
            if ((n - r) > r) {
            p1 = factorial(n, n - r) / factorial(r, 1) + p1;
            
        } else {
            p1 = factorial(n, r) / factorial(n - r, 1) + p1;
            //System.out.println(p1);
        }
        }
        System.out.println("£2 can be made in "+ p1 + " different ways, using any number of coins");
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaaethersolutions;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Familia Sotillo
 */
public class PruebaAetherSolutions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("  _      __    __                                                \n"
                + " | | /| / /__ / /______  __ _  ___                               \n"
                + " | |/ |/ / -_) / __/ _ \\/  ' \\/ -_)                              \n"
                + " |__/|__/\\__/_/\\__/\\___/_/_/_/\\__/_     __     __  _             \n"
                + "  / _ |___ / /_/ /  ___ ____  / __/__  / /_ __/ /_(_)__  ___  ___\n"
                + " / __ / -_) __/ _ \\/ -_) __/ _\\ \\/ _ \\/ / // / __/ / _ \\/ _ \\(_-<\n"
                + "/_/ |_\\__/\\__/_//_/\\__/_/   /___/\\___/_/\\_,_/\\__/_/\\___/_//_/___/\n"
                + "                                                                 \n"
                + "");
        boolean aux = false;
        do {
            aux = false;
            System.out.println("Welcome to Kevin Sotillo's test solution. Please choose wich answer you want to review: "
                    + "\n 1. For answer 1"
                    + "\n 2. For answer 2"
                    + "\n 3. For answer 3"
                    + "\n 4. For answer 4"
                    + "\n 5. To exit");
            Scanner sc = new Scanner(System.in);
            int resp = sc.nextInt();

            switch (resp) {
                case 1: {
                    Pregunta1 p = new Pregunta1();
                    p.solucion();
                    break;
                }
                case 2: {
                    Pregunta2 p = new Pregunta2();
                    p.solucion();
                    break;
                }
                case 3: {
                    Pregunta3 p = new Pregunta3();
                    p.solucion();
                    break;
                }
                case 4: {
                    Pregunta4 p = new Pregunta4();
                    p.solucion();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
                default:
                    break;
            }
            while (true) {
                System.out.println("Would you like to review another answer? Y/N");
                if (sc.next().equalsIgnoreCase("Y")) {
                    aux = true;
                    break;
                } else if (sc.next().equalsIgnoreCase("N")) {
                    System.exit(0);
                } else {
                    System.out.println("Please choose Y/N");
                }
            }
        } while (aux);
    }

}

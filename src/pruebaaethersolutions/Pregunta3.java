/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaaethersolutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Familia Sotillo
 */
public class Pregunta3 {

    /* >Problema 3

Using text.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file? */

    public void solucion() throws FileNotFoundException, IOException {
        ArrayList<String> array = new ArrayList<String>();//ArrayList donde ubicaré todos los nombres
        String cadena;//Un string auxiliar para leer el archivo
        FileReader f = new FileReader("src\\p022_names.txt");
        BufferedReader b = new BufferedReader(f);

        while ((cadena = b.readLine()) != null) {
            String[] cortarCadena = cadena.split(",");//Ubico todos los nombres que están separados por comas
            array.addAll(Arrays.asList(cortarCadena));//Los añado a mi array
        }
        b.close();

        Collections.sort(array);//Ordeno el array por orden alfabetico
        
        
        int score[] = new int[array.size()];//Un nuevo array donde guardar los score
        for (int i = 0; i < array.size(); i++) {//Recorro mi ArrayList
            for (int j = 1; j < (array.get(i)).length()-1; j++) {//Para recorrer letra por letra toda la palabra
                score[i] =  score[i] + ((int)((array.get(i)).charAt(j)))-64;//A cada letra la convertiré en su equivalente en ASCII y le restaré 64 para obtener su posicion en el albfabeto,
                                                                            //sumaré todas esas letras en la posicion de la correspondiente a la palabra en el array "Score" (que es la misma que la del ArrayList)
            }
            score[i] = score[i]*i;//Multiplicaré el total de la sumatoria del valor de las letras por la posición de la palabra en el vector
           
        }
        long total = 0;
        for (int i = 0; i < score.length; i++) {
            total = total + score[i];//Sumatoria de todos los scores
            
        }
        
        System.out.println("The total of all the names' score in the file is: " + total);//There it is
    }

}

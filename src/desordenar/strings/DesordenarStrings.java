/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desordenar.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class DesordenarStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String frase;
        System.out.print("Introduzca palabra o frase: ");
        frase = teclado.nextLine();
        desordenarDatos(frase);
    }

    static void desordenarDatos(String datos) {
        String temporal, temporalFin = "";  //temporal es usado para desordenar un bloque de forma dinámica. temporalFin concatena los bloques
        String partes[] = datos.split(" "); //Partes en las que se divide el bloque
        for (int i = 0; i < partes.length; i++) {
            temporal = partes[i];
            List<String> chars = Arrays.asList(temporal.split(""));
            Collections.shuffle(chars); //Desordenamos el bloque
            String salida = "";
            for (String s : chars) {
                salida += s;
            }
            temporalFin = temporalFin + salida + " "; //Concatenamos los bloques
        }
        System.out.println("Desordenado: " + temporalFin);
    }
}
//FUENTES
    //https://amatellanes.wordpress.com/2013/05/17/java-desordenar-aleatoriamente-un-string-en-java/

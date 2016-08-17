/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoDeOrdenacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jerico
 */
public class Insercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

        int vec[] = new int[6];
        int aux,a,j;
        System.out.println("METO DE ORDENACION POR INSERCION");
        System.out.println("================================");
        for (int i = 1; i < vec.length; i++) {
            System.out.println("Ingrese un numero");
            vec[i] = Integer.parseInt(dato.readLine());
        }
        System.out.println("Vector DesOrdenado");
        for (int i = 1; i < vec.length; i++) {
            System.out.print("[" + vec[i] + "] ");

        }
        for (int i = 0; i < vec.length; i++) {
            a=vec[i];
            for (j = i-1; j>=0&&vec[j]>a;j--) {
                vec[j+1]=vec[j];
                
            }
            vec[j+1]=a;
        }
        System.out.println("Vector Ordenado");
        for (int i = 1; i < vec.length; i++) {
            System.out.print("[" + vec[i] + "] ");

        }
        
        

        System.out.println(" ");
    }

}

       

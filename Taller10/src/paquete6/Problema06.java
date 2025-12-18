/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema06 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[][] matrizOriginal = new double[5][6];
        double[][] matrizResultante = new double[5][6];
        double numero;

        System.out.println("Ingrese un numero entero o real:");
        numero = entrada.nextDouble();

        for (int fila = 0; fila < matrizOriginal.length; fila++) {
            for (int col = 0; col < matrizOriginal[fila].length; col++) {
                System.out.printf("Ingrese valor para la posicion [%d][%d]:\n"
                        , fila, col);
                matrizOriginal[fila][col] = entrada.nextDouble();
                
               matrizResultante[fila][col] = matrizOriginal[fila][col] * numero;
            }
        }
        System.out.println("\nMatriz Inical :");
        double valor_O= matrizOriginal.length;
        for (int fila = 0; fila < valor_O; fila++) {
            for (int col = 0; col < matrizOriginal[fila].length; col++) {
                System.out.print(matrizOriginal[fila][col] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("\nMatriz Resultante:");
         double valor_M= matrizResultante.length;
        for (int fila = 0; fila < valor_M; fila++) {
            for (int col = 0; col < matrizResultante[fila].length; col++) {
                System.out.print(matrizResultante[fila][col] + "\t");
            }
            System.out.println("\n");
        }
    }

}

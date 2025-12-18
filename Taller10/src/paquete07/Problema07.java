/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Problema07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int[][] X = new int[3][3];
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];

        boolean ideCumple = true;

  
        for (int fila = 0; fila < X.length; fila++) {
            for (int col = 0; col < X[fila].length; col++) {

                System.out.printf("Ingrese valor para X[%d][%d]:\n", fila, col);
                X[fila][col] = entrada.nextInt();

                A[fila][col] = (X[fila][col] + 1) * (X[fila][col] + 1);

                B[fila][col] = X[fila][col] * X[fila][col]
                             + 2 * X[fila][col]
                             + 1;
                if (A[fila][col] != B[fila][col]) {
                    ideCumple = false;
                }
            }
        }

        System.out.println("\nMatriz A:");
        int matrizA= A.length;
        for (int fila = 0; fila < matrizA; fila++) {
            for (int col = 0; col < A[fila].length; col++) {
                System.out.print(A[fila][col] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("\nMatriz B:");
        int matrizB= B.length; 
        for (int fila = 0; fila < matrizB; fila++) {
            for (int col = 0; col < B[fila].length; col++) {
                System.out.print(B[fila][col] + "\t");
            }
            System.out.println("\n");
        }

        if (ideCumple) {
            System.out.println("\nLa identidad algebraica: Si se cumple "
                    + "correctamente ");
        } else {
            System.out.println("\nLa identidad algebraica: No se cumple "
                    + "correctamente ");
        }
    }
}

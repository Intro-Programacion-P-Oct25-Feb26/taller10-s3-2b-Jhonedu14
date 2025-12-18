/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author USUARIO
 */
public class Problema8 {
    public static void main(String[] args) {

        int[][] matrizA = {{1, 2, 3}, {6, 8, 9}};
        int[][] matrizB = {{10, 1, 2}, {10, 9, 1}};

        int[][] matrizResultado = new int[2][3];

        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int col = 0; col < matrizA[fila].length; col++) {

                if (matrizA[fila][col] < matrizB[fila][col]) {
                    matrizResultado[fila][col] = matrizA[fila][col];
                } else {
                    matrizResultado[fila][col] = matrizB[fila][col];
                }
            }
        }
        int matrizR= matrizResultado.length;
        for (int fila = 0; fila < matrizR; fila++) {
            for (int col = 0; col < matrizResultado[fila].length; col++) {
                System.out.printf(matrizResultado[fila][col] + "\t");
            }
            System.out.println("");
        }
    }
}

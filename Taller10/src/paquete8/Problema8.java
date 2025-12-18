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

    double[][] matrizA = {{1, 2, 3}, {6, 8, 9}};
        double[][] matrizB = {{10, 1, 2}, {10, 9, 1}};
        double[][] matrizMenor = new double[2][3];
          
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {

                if (matrizA[i][j] <= matrizB[i][j]) {
                    matrizMenor[i][j] = matrizA[i][j];
                } else {
                    matrizMenor[i][j] = matrizB[i][j];
                }
            }
        }
        int matrizM= matrizMenor.length;
        for (int i = 0; i < matrizM; i++) {
            for (int j = 0; j < matrizMenor[i].length; j++) {
                System.out.print(matrizMenor[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

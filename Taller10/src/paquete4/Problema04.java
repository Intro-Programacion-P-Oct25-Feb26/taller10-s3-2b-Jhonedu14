/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        int[][] A = new int[3][2];
        int[][] B = new int[3][2];

        boolean cumpleCondi1 = true; 
        boolean cumpleCondi2 = false; 

        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("Ingrese A[%d][%d]: ", i, j);
                A[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.printf("Ingrese B[%d][%d]: ", i, j);
                B[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nMatriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();  
        }
        System.out.println("\nMatriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                if (A[i][j] < B[i][j]) {
                    cumpleCondi1 = false;
                }

                if (A[i][j] > B[i][j]) {
                    cumpleCondi2 = true;
                }
            }
        }
        if (cumpleCondi1 && cumpleCondi2) {
            System.out.println("\nLa matriz A es mayor que la matriz B");
        } else {
            System.out.println("\nLa matriz A no es mayor que la matriz B");
        }
    }

}

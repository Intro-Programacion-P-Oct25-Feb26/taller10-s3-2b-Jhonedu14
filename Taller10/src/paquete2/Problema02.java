/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {
    public static void main(String[] args) {
       
        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };

        int totalMenores = 0;
        int[] adultosPorFamilia = new int[3];

        String reporte = "";

        int valor_e = edades.length;

        for (int i = 0; i < valor_e; i++) {
            int contadorAdultos = 0;

            for (int j = 0; j < edades[i].length; j++) {
                if (edades[i][j] < 18) {
                    totalMenores = totalMenores + 1;
                } else {
                    contadorAdultos = contadorAdultos + 1;
                }
            }
            adultosPorFamilia[i] = contadorAdultos;
        }
        
        int adultos= adultosPorFamilia.length;
        System.out.println("Total de Adutlos por familia:");
        for (int i = 0; i < adultos; i++) {
            reporte = String.format(
                    "%sFamilia %d tiene %d adultos\n",
                    reporte,
                    i + 1,
                    adultosPorFamilia[i] );
        }
        reporte = String.format(
                "%sTotal de menores de edad: %d",
                reporte,
                totalMenores);
      
        System.out.println(reporte);
    }

}

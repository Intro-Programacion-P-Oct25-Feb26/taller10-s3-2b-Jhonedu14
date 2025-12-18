/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {
      public static void main(String[] args) {
      
          boolean[][] sensores = {                  // para guiarse
            {true, true, true, true, true, true},   // zona 0 
            {true, false, true, false, true, false}, // zona 1 
            {false, false, false, false, false, false}, // zona2 
            {true, true, false, true, true, false}  // zona 3
        };

        int zonasSinFallos = 0;
        String reporte = "";

        System.out.println("Reporte de las zonas con fallos:");
        for (int i = 0; i < sensores.length; i++) {
            int contadorFallos = 0;

            for (int j = 0; j < sensores[i].length; j++) {
                if (sensores[i][j] == false) {
                    contadorFallos= contadorFallos+1;
                }
            }

            if (contadorFallos == 0) {
                zonasSinFallos=  zonasSinFallos+1;
            } else {
                reporte = String.format(
                        "%sZona %d presenta %d fallos\n",
                        reporte,
                        i,
                        contadorFallos);
            }
        }

        reporte = String.format(
                "%s\nZonas que funcionan sin fallos: %d",
                reporte,
                zonasSinFallos
        );

        System.out.println(reporte);
    }
}


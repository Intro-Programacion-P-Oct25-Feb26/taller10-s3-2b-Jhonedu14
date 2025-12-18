/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {
    public static void main(String[] args) {
     
        String[][] estudiantes = {
            {"Sarah Ward", "Philip Payne"},
            {"Carrie Burton", "Lauren Rice"},
            {"Emma Escobar", "Lori Flores"},
            {"Steven West", "Toni Martin"}
        };

        String reporte = "";

        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int col = 0; col < estudiantes[fila].length; col++) {

                String nombre = estudiantes[fila][col];
                String inicial_l = nombre.substring(0, 1);

              if (inicial_l.equals("S") || inicial_l.equals("P") || 
                      inicial_l.equals("T")) {
                    reporte = String.format("%s%s\n", reporte, nombre);
                }
            }
        }

        System.out.println("Reporte de estudiantes que Inician con letras:"
                + " S, P o T:");
        System.out.println(reporte);
    }

}

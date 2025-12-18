/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };

        String[] estudiantes = {"Ana", "Luis", "Carlos", "Maria"};

        int[] diasAsistidos = new int[4];

        String reporte = "";
        String cumple_a; 

        int valor1 = asistencia.length;

        for (int i = 0; i < valor1; i++) {
            int contador = 0;

            for (int j = 0; j < asistencia[i].length; j++) {
                if (asistencia[i][j] == true) {
                    contador= contador+1;
                }
            }
            diasAsistidos[i] = contador;
        }
        int valor2= estudiantes.length;
        for (int i = 0; i < valor2; i++) {

            if (diasAsistidos[i] == 5) {
                cumple_a = "Asistencia Completa ";
            } else {
                cumple_a = "No cumple la asistencia completa en los 5 dias ";
            }
            reporte = String.format(
                    "%sEstudiante: %s\n"
                    + "Dias asistidos: %d\n"
                    + "%s\n\n",
                    reporte,
                    estudiantes[i],
                    diasAsistidos[i],
                    cumple_a);
        }

        System.out.println(reporte);
    }
}


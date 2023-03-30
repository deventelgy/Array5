import com.sun.source.doctree.SummaryTree;

import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        float Promedio;
        int SumaNotas=0;
        //calcular el promedio final del ciclo de los cursos ingresados
        String texto = JOptionPane.showInputDialog("Ingrese cantidad de Notas: ");
        int cantidad = Integer.parseInt(texto);

        //String cursos[] = new String[cantidad];
        int notas[] = new int[cantidad];

        for(int i=0; i<cantidad;i++){
            String calif = JOptionPane.showInputDialog("Ingrese nota N°"+i);
            notas[i] = Integer.parseInt(calif);

            SumaNotas = SumaNotas + notas[i];
        }
        Promedio=SumaNotas/cantidad;

        for(int i=0;i<cantidad;i++){
            System.out.println("Nota "+i+" = "+notas[i]);
        }
        System.out.println("Promedio = "+Promedio);
    }
}
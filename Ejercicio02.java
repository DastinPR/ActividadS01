package ejercicios;

import java.awt.*;
import static javax.swing.JOptionPane.*;

public class Ejercicio02 {
    public static void main(String[] args) {
        double b,A,p,ar;
        int rep;

            do {
            
                b = Double.parseDouble(showInputDialog(null,"Ingrese la base del rectángulo.","Calculadora de Areas y Perímetros.",WARNING_MESSAGE));
                A = Double.parseDouble(showInputDialog(null,"Ingrese la altura del rectángulo.","Calculadora de Areas y Perímetros.",WARNING_MESSAGE));

                p=(b*2)+(A*2);
                ar=(b*A);
            
            
                showMessageDialog(null,"El perímetro del rectángulo es: " + p + "m"+"\n"+"El área del rectángulo es: " + ar + "m²","Calculadora de Areas y Perímetros.",INFORMATION_MESSAGE);
                rep = showConfirmDialog(null,"¿Repetir Programa?","Calculadora de Areas y Perímetros.",OK_OPTION);
            
        }while(rep==0);
    }
}

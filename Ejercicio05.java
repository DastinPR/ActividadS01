package ejercicios;

import static javax.swing.JOptionPane.*;

public class Ejercicio05 {
    public static void main(String[] args) {
        double f=0,c=0;
        int rep=0;

        do{
            f = Double.parseDouble(showInputDialog(null,"Introduzca la temperatura en Fahrenheith.","Tansformador Fahrenheith a Celsius.",INFORMATION_MESSAGE));

            c=(f*1.8)+32;

            showMessageDialog(null,"Se ha hecho la conversión:\n" + f + "°F (Farenheith) => " + c + "°C (Celsius)","Tansformador Fahrenheith a Celsius.",INFORMATION_MESSAGE);
            rep = showConfirmDialog(null,"¿Repetir Programa?","Tansformador Fahrenheith a Celsius.",YES_NO_OPTION);
        
        }while(rep==0);

    }
}

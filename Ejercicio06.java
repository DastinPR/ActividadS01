package ejercicios;

import static javax.swing.JOptionPane.*;

public class Ejercicio06 {
    public static void main(String[] args) {
        int rep=0;
        double a=0,b=0,c=0,m=0;
        
        do{
            
            a = Double.parseDouble(showInputDialog(null,"Ingresar el 1er número.","Hallar media.",INFORMATION_MESSAGE));

            b = Double.parseDouble(showInputDialog(null,"Ingresar el 2do número.","Hallar media.",INFORMATION_MESSAGE));

            c = Double.parseDouble(showInputDialog(null,"Ingresar el 3er número.","Hallar media.",INFORMATION_MESSAGE));

            m=(a+b+c)/3;

            showMessageDialog(null,"Los números son: "+ a +", "+ b +", "+ c +"\nLa media de los tres números es: "+m ,"Hallar media.",INFORMATION_MESSAGE);
            rep = showConfirmDialog(null,"¿Repetir Programa?","Hallar media.",YES_NO_OPTION);
        }while(rep==0);
    }
}

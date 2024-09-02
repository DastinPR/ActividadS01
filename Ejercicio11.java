package ejercicios;

import static javax.swing.JOptionPane.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        int rep=0;
        double a=0,b=0,c=0,d=0,x1=0,x2=0;

        do {
            try{
                a = Double.parseDouble(showInputDialog(null,"Ingresar el coeficiente del término cuadrático (¨aX²¨)","Hallar raíces de una ecuación cuadrática. (aX²+bX+c)",INFORMATION_MESSAGE));
            } catch (NumberFormatException e) {
                showMessageDialog(null,"Se ha detectado el error: " + e,"¡Error!",ERROR_MESSAGE);}

            try{
                b = Double.parseDouble(showInputDialog(null,"Ingresar el coeficiente del término lineal (bX)","Hallar raíces de una ecuación cuadrática. (aX²+bX+c)",INFORMATION_MESSAGE));
            } catch (NumberFormatException e) {showMessageDialog(null,"Se ha detectado un error: " + e,"¡Error!",ERROR_MESSAGE);
            }

            try{
                c = Double.parseDouble(showInputDialog(null,"Ingresar el coeficiente del término indpendiente (+-c)","Hallar raíces de una ecuación cuadrática. (aX²+bX+c)",INFORMATION_MESSAGE));
            } catch (NumberFormatException e) {showMessageDialog(null,"Se ha detectado un error \n"+e,"Error",ERROR_MESSAGE);
            }

            d=Math.pow(b,2)-4*a*c;
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);

            showMessageDialog(null,"La discriminante de la ecuación es: " + d + "\n Las Raíces son " + x1 + " y " + x2);
            rep = showConfirmDialog(null, "¿Repetir Programa?", "Hallar raíces de una ecuación cuadrática. (aX²+bX+c)", YES_NO_OPTION);
        
        }while(rep==0);
    }
}

package ejercicios;

import static javax.swing.JOptionPane.*;

public class Ejercicio03 {
    public static void main(String[] args){
        double c1=0,c2=0,h;
        int rep;
        do{
            try{
                
                c1 = Double.parseDouble(showInputDialog(null,"Ingresar el 1er cateto.","Hallar la Hipotenusa.",INFORMATION_MESSAGE));
            
            }catch (NumberFormatException e) {showMessageDialog(null,"Se ha detectado el error: " +e,"¡Error!",WARNING_MESSAGE);}

            try{
                
                c2 = Double.parseDouble(showInputDialog(null,"Ingresar el 2do cateto.","Hallar la Hipotenusa.",INFORMATION_MESSAGE));
            
            }catch (NumberFormatException e) {showMessageDialog(null,"Se ha detectado el error: " +e,"¡Error!",WARNING_MESSAGE);}

            if(c1<=0 || c2<=0){showMessageDialog(null,"Los catetos no pueden ser negativos ni iguales a cero.","¡ERROR!",ERROR_MESSAGE);
            
            }else{
                
                h=Math.sqrt(Math.pow(c1,2)+Math.pow(c2,2));
                showMessageDialog(null,"La hipotenusa es:\n" +h,"Hallar la Hipotenusa.",INFORMATION_MESSAGE);}

            rep = showConfirmDialog(null,"¿Repetir Programa?","Hallar la Hipotenusa.",YES_NO_OPTION);
            
        }while(rep==0);
    }
}

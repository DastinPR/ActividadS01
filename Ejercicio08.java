package ejercicios;

import static javax.swing.JOptionPane.*;

public class Ejercicio08 {
    public static void main(String[] args) {
        int b=0;
        double p=0,pg;
        
        do{
            try{
                p=Double.parseDouble(showInputDialog(null,"Ingresar la cantidad a pagar","Descuento",INFORMATION_MESSAGE));
            }catch(NumberFormatException e) {
                showMessageDialog(null,"Se ha detectado un error \n"+e,"Error",ERROR_MESSAGE);
            }

            if(p>0){
                pg=p-(p*0.15);
                showMessageDialog(null,"El pago total con el descuento será: S/"+pg,"Descuento",INFORMATION_MESSAGE);
            }else{
                showMessageDialog(null,"Ha ingresado un monto negativo","Error",ERROR_MESSAGE);
            }

            b=showConfirmDialog(null,"¿Repetir Programa?","Descuento",YES_NO_OPTION);
        }while(b==0);
    }
}

package ejercicios;

import static javax.swing.JOptionPane.*;

public class Ejercicio09 {
    public static void main(String[] args) {
        int rep=0;
        double a=0,b=0,r=0;
        do{
            try{
                try{
                   
                    a=Double.parseDouble(showInputDialog(null,"Ingresar el primer número:","Calculadora de división.",INFORMATION_MESSAGE));
                
                }catch(NumberFormatException e1){showMessageDialog(null,"Se ha detectado el error: " + e1 ,"¡Error!",ERROR_MESSAGE);}

                try{
                    
                    b=Double.parseDouble(showInputDialog(null,"Ingresar el segundo número:","Calculadora de división.",INFORMATION_MESSAGE));
                
                }catch(NumberFormatException e2){showMessageDialog(null,"Se ha detectado el error: " + e2 ,"¡Error!",ERROR_MESSAGE);}
                
                r=a/b;
                
                if(b==0){
                    throw new ArithmeticException();
                }else{
                    showMessageDialog(null,"La división es: "+ r ,"Calculadora de división.",INFORMATION_MESSAGE);
                }
            }catch(ArithmeticException e3){
                showMessageDialog(null,"Se ha detectado el error: "+ e3 ,"¡Error!",ERROR_MESSAGE);
            }

            rep=showConfirmDialog(null,"¿Repetir Programa?","Calculadora de división.",YES_NO_OPTION);
        }while(rep==0);
    }
}

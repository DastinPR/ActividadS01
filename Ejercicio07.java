package ejercicios;

import static javax.swing.JOptionPane.*;

public class Ejercicio07 {
    public static void main(String[] args) {
        int rep=0,i=0,m=0,h=0;

        do{
            
            i=Integer.parseInt(showInputDialog(null,"Ingrese la cantidad de minutos.","Transformar a minutos.",INFORMATION_MESSAGE));
            h= (int) i/60;
            m=i%60;

            if(i>0){
                if(h>1){
                    showMessageDialog(null,"La transformación de: "+ i +" minutos"+"\nEs: "+ h +" horas y "+ m +" minutos","Transformar a minutos.",INFORMATION_MESSAGE);
                }else{
                    showMessageDialog(null,"La transformación de: "+ i +" minutos"+"\nEs: "+ h +" hora y "+ m +" minutos","Transformar a minutos.",INFORMATION_MESSAGE);
                }
            }else{
                showMessageDialog(null,"Valor incorrecto.","¡Error!",WARNING_MESSAGE);
            }
            rep=showConfirmDialog(null,"¿Repetir Programa?","Transformar a minutos.",YES_NO_OPTION);

        }while(rep==0);
    }
}

package ejercicios;

import static javax.swing.JOptionPane.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        int rep=0;
        int a=0;
        
        do{

            try{
                a=Integer.parseInt(showInputDialog(null,"Ingresar el número","Hallar Par o Impar.",INFORMATION_MESSAGE));
            }catch (NumberFormatException e){showMessageDialog(null,"Se ha detectado un error \n"+e,"Error",ERROR_MESSAGE);
            }
                if((a%2)==0){
                    showMessageDialog(null,"El número " + a + " es par.","Hallar Par o Impar.",INFORMATION_MESSAGE);
                }else{
                    showMessageDialog(null,"El número " + a + " es impar.","Hallar Par o Impar.",INFORMATION_MESSAGE);
                }

            rep=showConfirmDialog(null,"¿Repetir Programa?","Hallar Par o Impar.",YES_NO_OPTION);
        }while(rep==0);
    }
}

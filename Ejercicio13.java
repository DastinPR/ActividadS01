package ejercicios;

import static javax.swing.JOptionPane.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        int rep=0;
        do{
           
            int edad=0;
            double salario=0;

            try{
                edad = Integer.parseInt(showInputDialog(null, "Indique su edad.", "LA TRIBUTACIÓN.", INFORMATION_MESSAGE));
                if(edad<=0){ throw new NumberFormatException();
                }
            }catch (NumberFormatException e){showMessageDialog(null,"Se ha detectado el error: " +e ,"¡Error!",ERROR_MESSAGE);
            }

            if(edad>=18){
                try{
                    salario = Integer.parseInt(showInputDialog(null, "Ingrese su salario mensual.", "LA TRIBUTACIÓN.", INFORMATION_MESSAGE));
                    if(salario<0){throw new NumberFormatException();
                    }
                    
                }catch (NumberFormatException e){
                    showMessageDialog(null,"Se ha detectado el error: " +e,"¡Error!",ERROR_MESSAGE);}
                
                if(salario>=1300){showMessageDialog(null,"Usted tributa.","LA TRIBUTACIÓN.",INFORMATION_MESSAGE);
                
                }else{
                    showMessageDialog(null,"Usted no tributará.","LA TRIBUTACIÓN.",INFORMATION_MESSAGE);
                }

            }else{
                showMessageDialog(null,"Usted es menor de edad, por lo tanto, no tributa.","LA TRIBUTACIÓN.",INFORMATION_MESSAGE);
            }
            rep=showConfirmDialog(null,"¿Repetir Programa?","LA TRIBUTACIÓN.",YES_NO_OPTION);
        }while(rep==0);
    }
}

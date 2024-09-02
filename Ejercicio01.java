package ejercicios;

import static javax.swing.JOptionPane.*;
import java.time.LocalDateTime;

public class Ejercicio01 {
    public static void main(String[] args) {
        int rep = 0;
        String Name = "";
        
            do{
                Name = showInputDialog(null,"Coloque su nombre completo.","Saludos Informaticos v1.2",INFORMATION_MESSAGE);
                int time = LocalDateTime.now().getHour();

                if(Name.isBlank()){
                showMessageDialog(null,"No se ha ingresado ningún nombre.","Saludos Informaticos v1.2",WARNING_MESSAGE);
                }else{
                    
                    if(time<=5){
                    showMessageDialog(null,"Hola, Buenas noches " +Name+ " :D","Saludos Informaticos v1.2",INFORMATION_MESSAGE);
                    }else{
                        
                    showMessageDialog(null,"Hola, Buenos dias " +Name+ " :D","Saludos Informaticos v1.2",INFORMATION_MESSAGE);
                    }
            }
            
            rep=showConfirmDialog(null,"¿Repetir Programa?","Saludos Informáticos v1.2",YES_NO_OPTION);
            
        }while(rep==0);
    }
}

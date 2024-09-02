package ejercicios;

import static javax.swing.JOptionPane.*;

public class Ejercicio04 {
    public static void main(String[] args) {
        int rep=0;
        double a=0,b=0;

        do{
            a = (Math.random()*100)+1;
            b = (Math.random()*100)+1;

            showMessageDialog(null,"Los números son\n" + a + " y " + b,"Operaciones con números aleatorios.",INFORMATION_MESSAGE);

            showMessageDialog(null,"Las operaciones son:\n - Suma: "+ (a+b) +"\n - Resta: "+ (a-b) +"\n - Multiplicación: "+ (a*b) +"\n - División: "+(a/b),"Operaciones con números aleatorios.",INFORMATION_MESSAGE);

            rep = showConfirmDialog(null,"¿Repetir Programa?","Operaciones con números aleatorios.",YES_NO_OPTION);
        
            
        }while(rep==0);
    }
}

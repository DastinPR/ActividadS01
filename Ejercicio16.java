package ejercicios;

import static javax.swing.JOptionPane.*;

public class Ejercicio16 {
    public static void main(String[] args) {
        int rep=0,n1=0,n2=0,n3=0,i=0;
        String p="",q="",r="";
        boolean primo = false;

        do {
            
            try {
                n1 = Integer.parseInt(showInputDialog(null, "Ingresar el primer número.", "DIVISIÓN.", QUESTION_MESSAGE));
                if (n1 < 0) {
                    throw new IllegalArgumentException("No se permiten valores negativos.");
                }
                
            } catch (IllegalArgumentException e) {
                showMessageDialog(null, "Ocurrió el rrror: " + e.getMessage(), "¡Error!", ERROR_MESSAGE);
            }
            
            try {
                n2 = Integer.parseInt(showInputDialog(null, "Ingresar el segundo número.", "DIVISIÓN.", QUESTION_MESSAGE));
                if (n2 < 0) {
                    throw new IllegalArgumentException("No se permiten valores negativos.");
                }
                
            } catch (IllegalArgumentException e) {
                showMessageDialog(null, "Error: " + e.getMessage(), "¡Error!", ERROR_MESSAGE);
            }
            
            try {
                n3 = Integer.parseInt(showInputDialog(null, "Ingresar el tercer número.", "DIVISIÓN.", QUESTION_MESSAGE));
                if (n3 < 0) {
                    throw new IllegalArgumentException("No se permiten valores negativos.");
                }
            } catch (IllegalArgumentException e) {
                showMessageDialog(null, "Error: " + e.getMessage(), "¡Error!", ERROR_MESSAGE);
            }

            //Detección de números pares o impares
            if(n1%2==0){
                p="El número " + n1 + " es par";
            }else{
                p="El número " + n1 + " es impar";
            }
            if(n2%2==0){
                q="El número " + n2 + " es par";
            }else{
                q="El número " + n2 + " es impar";
            }
            if(n3%2==0){
                r="El número " + n3 + " es par";
            }else{
                r="El número " + n3 + " es impar";
            }
            for(i=2;i<=Math.sqrt(n1);i++){
                primo=true;
                if((n1%i)==0){
                    primo=false;
                    break;
                }
            }

            if(primo == true){
                p = p + " Y es primo.";
            }else{
                p = p + " Y no es primo.";
            }

            for(i=2;i<=Math.sqrt(n2);i++){
                primo=true;
                if((n2 % i) == 0){
                    primo=false;
                    break;
                }
            }

            if(primo == true){
                q = q + " Y es primo.";
            }else{
                q = q + " Y no es primo.";
            }

            for(i=2;i<=Math.sqrt(n3);i++){
                primo=true;
                if((n3%i)==0){
                    primo=false;
                    break;
                }
            }

            if(primo == true){
                r = r + " Y es primo.";
            }else{
                r = r + " Y no es primo.";
            }

            showMessageDialog(null, "Resultados:\n" + p + "\n" + q + "\n" + r);
            rep = showConfirmDialog(null, "¿Repetir Programa?", "DIVISIÓN.", YES_NO_OPTION);
        }while (rep == 0) ;
    }
}
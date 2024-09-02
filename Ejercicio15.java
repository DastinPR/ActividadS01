package ejercicios;

import static javax.swing.JOptionPane.*;
import java.math.BigInteger;

public class Ejercicio15 {
    public static void main(String[] args) {
        int rep,numero=0;
        
        do {
            try {
                String input = showInputDialog(null, "Ingrese un número entero para calcular su factorial:", "CALCULADORA DE FACTORIALES.", INFORMATION_MESSAGE);
                numero = Integer.parseInt(input);

                if (input.isBlank()) {
                    throw new NullPointerException("El valor introducido no puede estar vacío.");
                }

                if (numero < 0) {
                    throw new IllegalArgumentException("El número debe ser mayor o igual a cero.");
                }

                BigInteger factorial = BigInteger.ONE;
                for (int i = 1; i <= numero; i++) {
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }

                showMessageDialog(null, "El factorial de " + numero + " es " + factorial, "CALCULADORA DE FACTORIALES.", INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {showMessageDialog(null, "Error: Ingrese un número entero válido.", "¡Error!", ERROR_MESSAGE);
            } catch (IllegalArgumentException | NullPointerException e) {showMessageDialog(null, "Error: " + e.getMessage(),"¡Error!", ERROR_MESSAGE);
            }

            rep = showConfirmDialog(null, "¿Repetir Programa?", "CALCULADORA DE FACTORIALES.", YES_NO_OPTION);

        } while (rep == 0);
    }
}
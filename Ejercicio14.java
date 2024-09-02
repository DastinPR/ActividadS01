package ejercicios;

import static javax.swing.JOptionPane.*;
import java.util.Locale;

public class Ejercicio14 {
    public static void main(String[] args) {
        int b, g;
       
        String apellido;
        String[] Genero = {"Masculino.", "Femenino."};
        
        char primera_letra = 0;

        do {
            try {
                apellido = showInputDialog(null, "Ingrese su primer apellido", "ORGANIZACIÓN DE SALONES.", INFORMATION_MESSAGE);

                if (apellido == null || apellido.isBlank()) {throw new NullPointerException("Debe rellenar su apellido.");
                }

                if (!apellido.matches("[a-zA-Z]+")) {throw new IllegalArgumentException("El apellido contiene números y caracteres especiales inválidos.");
                }

                primera_letra = apellido.toUpperCase(Locale.ROOT).charAt(0);
            } catch (NullPointerException | IllegalArgumentException e) {showMessageDialog(null, "Error: " + e.getMessage(), "Error", ERROR_MESSAGE);
            }

            g = showOptionDialog(null, "Escoja su género", "ORGANIZACIÓN DE SALONES.",DEFAULT_OPTION, INFORMATION_MESSAGE, null, Genero, Genero[0]);
            String grupo = (g == 0 && primera_letra > 'N') || (g == 1 && primera_letra < 'M') ? "A" : "B";
            showMessageDialog(null, "Usted se encuentra en el grupo " + grupo, "ORGANIZACIÓN DE SALONES.", INFORMATION_MESSAGE);
            b = showConfirmDialog(null, "¿Repetir Programa?", "ORGANIZACIÓN DE SALONES.", YES_NO_OPTION);
        
        } while (b == 0);
    }
}

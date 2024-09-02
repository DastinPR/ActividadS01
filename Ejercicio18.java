package ejercicios;

import static javax.swing.JOptionPane.*;

public class Ejercicio18 {
    public static void main(String[] args) {
        int rep;
        double rA = 0;
        double tI = 0;

        do {
            try {
                String input = showInputDialog(null, "Ingrese su renta anual:", "LA DECLARACIÓN DE LA RENTA.", INFORMATION_MESSAGE);
                rA = Double.parseDouble(input);

                if (input.isBlank()) {
                    throw new NullPointerException("No se ha ingresado ningún valor.");
                }

                if (rA < 0) {
                    throw new IllegalArgumentException("La renta anual debe ser >= a 0.");
                }

                if (rA < 10000) {tI = 5;
                } else if (rA < 20000) {tI = 15;
                } else if (rA < 35000) {tI = 20;
                } else if (rA < 60000) {tI = 30;
                } else { tI = 45;
                }

                showMessageDialog(null, "Para una renta anual de S/ " + rA + 
                        ", el tipo impositivo es " + tI + ""
                        + "%.", "Resultado", INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {showMessageDialog(null, "Error Detectado: Ingrese un valor válido.", "¡Error!", ERROR_MESSAGE);
            } catch (IllegalArgumentException | NullPointerException e) {showMessageDialog(null, "Error Detectado: " + e.getMessage(), "¡Error!", ERROR_MESSAGE);
            }

            rep = showConfirmDialog(null, "¿Repetir Programa?", "LA DECLARACIÓN DE LA RENTA.", YES_NO_OPTION);

        } while (rep == 0);
    }
}

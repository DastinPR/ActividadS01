package ejercicios;

import static javax.swing.JOptionPane.*;

public class Ejercicio17 {
    public static void main(String[] args) {
        int rep;
        double l1 = 0, l2 = 0, l3 = 0;

        do {
            try {
                l1 = Double.parseDouble(showInputDialog(null, "Ingrese la medida del 1er lado: ", "HALLAR TRIÁNGULO.", INFORMATION_MESSAGE));
                l2 = Double.parseDouble(showInputDialog(null, "Ingrese la medida del 2do lado: ", "HALLAR TRIÁNGULO.", INFORMATION_MESSAGE));
                l3 = Double.parseDouble(showInputDialog(null, "Ingrese la medida del 3er lado: ", "HALLAR TRIÁNGULO.", INFORMATION_MESSAGE));

                if (l1 <= 0 || l2 <= 0 || l3 <= 0) { throw new IllegalArgumentException("Los lados no deben ser 0 y deben ser mayores.");
                }
                if (l1 + l2 <= l3 || l1 + l3 <= l2 || l2 + l3 <= l1) {throw new IllegalArgumentException("No se forma un triángulo válido.");
                }

                String tipoTriangulo;
                if (l1 == l2 && l2 == l3) {
                    tipoTriangulo = "Equilátero.";
               } else if (l1 == 2 || l1 == 1 || l2 == l3) {
                    tipoTriangulo = "Isósceles.";
                } else {
                    tipoTriangulo = "Escaleno.";
                }

                showMessageDialog(null, "El triángulo es " + tipoTriangulo, "HALLAR TRIÁNGULO.", INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {showMessageDialog(null, "Error encontrado: Ingrese valores numéricos válidos.", "¡Error!", ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {showMessageDialog(null, "Error encontrado: " + e.getMessage(), "¡Error!", ERROR_MESSAGE);
            }

            rep = showConfirmDialog(null, "¿Repetir Programa?", "Continuar", YES_NO_OPTION);

        } while (rep == 0);
    }
}

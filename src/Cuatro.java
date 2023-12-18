
public class Cuatro {

	public static void main(String[] args) {
		int tabla[] = {12, 26, 43, 81, 2, 5, 4, 10};
        int posicion_final = tabla[tabla.length - 1]; // Guarda el último numero
        
        for (int i = tabla.length - 1; i > 0; i--) {
            tabla[i] = tabla[i - 1]; // Mueve cada numero una posición a la derecha
        }
        
        tabla[0] = posicion_final; // Coloca el último numero en la primera posicion
        
        // Imprime la tabla modificada
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }

			}
		}

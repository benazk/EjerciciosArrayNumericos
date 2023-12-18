
public class Ocho {

	public static void main(String[] args) {
		int tabla[] = {12, 1, 3, 1, 1, 1, 3, 1, 12};
		double mitad = Math.floor(tabla.length / 2); //Como de la izquierda solo lee hasta la mitad, se crea una variable (la mitad del length)
		boolean espejo = true; //Si se lee igual de ambos lados, este valor sera true. Si no, sera false
		for (int i = 0; i < mitad; i++) {
			for (int j = tabla.length - i; j > tabla.length - i; j--) {
				if (tabla[i] != tabla[j]) {
					espejo = false;
				}
			} 
		}
		if (espejo) { //Si el boolean es verdadero, ejecuta esto.
			System.out.println("La tabla se lee igual de derecha que de izquierda");
		}
		if (espejo == false) { //Si el boolean es falso, ejecuta esto.
			System.out.println("La tabla no se lee igual de derecha que de izquierda");
		}
	}

}

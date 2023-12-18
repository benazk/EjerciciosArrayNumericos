
public class Tres {

	public static void main(String[] args) {
		int tabla[]= { 1,6,2,77,3,10,23,14 };
		boolean repetidos = true;
		
		//Recorre el array comparando la posicion i con las demas posiciones j, ignorandola si ambas variables son la misma (bucle anidado)
		for (int i = 0; i < tabla.length - 1; i++) {
			for(int j = 0; j < tabla.length - 1; j++) {
				if (i != j) {
					if (tabla[i] == tabla[j]) {
						repetidos = true; //si se repite algun numero, este valor pasara a true
					}
					else {
						repetidos = false;
					}
				}
				
			}
		}
		if (repetidos) {
		System.out.println("Hay numeros repetidos");
		}
		else {
			System.out.println("Todos los numeros de la tabla son diferentes");
		}
	}

}

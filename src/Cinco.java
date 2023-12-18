
public class Cinco {
	static int factorial(int x) { //Se crea la funcion para los factoriales
		if(x == 0 || x == 1) {
			return 1;
		}
		else {
			return x * factorial(x - 1);
		}
	}
	public static void main(String[] args) {
		
		int tabla[] = new int[10];
		
		for (int i = 0; i < tabla.length; i++) { //recorre la tabla, llenandola de los factoriales correspondientes
			tabla[i] = factorial(i);
		}
		
		for (int i = 0; i < tabla.length; i++) { //Mostrar la tabla en la consola
			System.out.println(tabla[i] + " ");
		}
	}

}


public class Seis {
	static int fibonacci(int a) { //esta funcion devuelve el numero de fibonacci
		int b = 1;
		int c = 1;
		int d = 0;
		if (a == 0) {
			return 0;
		}
		else if (a == 1) {
			return 1;
		}
		else {
			for (int i = 0; i < a; i++ ) {
				d = b + c;
				b = c;
				c = d;
			}
		}
		return d;
	}
	public static void main(String[] args) {
		int tabla[] = new int[10];
		
		for (int i = 0; i < tabla.length; i++) { //recorre la tabla, llenandola de los numeros de fibonacci corrrespondientes
			tabla[i] = fibonacci(i);
		}
		for (int i = 0; i < tabla.length; i++) { //Mostrar la tabla en la consola
			System.out.println(tabla[i] + " ");
		}


	}

}

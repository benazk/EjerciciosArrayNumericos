
public class Once {

	public static void main(String[] args) {
		int tabla[] = {12, 23, 42, 81, 2, 7, 4, 10}; //array de numeros
		int dividiendo = 0;
		int primos = 0;
		
		for(int i = 0; i < tabla.length; i++) { //bucle que recorre las posiciones del array
			for(int j = 2; j < tabla[i]; j++) { //bucle que va desde el numero 2 hasta el numero de la posicion del array
				if(tabla[i]%j == 0) { //si hay algun numero divisible, lo suma aqui
					dividiendo++;
				}
			}
			if(dividiendo == 0) { //si hay algun numero divisible con el numero de una posicion, suma 1 a la cantidad de primos.
				primos++;
			}
			dividiendo = 0;
		}
		System.out.println("hay " + primos + " numeros primos"); //muestra en pantalla
	}
}

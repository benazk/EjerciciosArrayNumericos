
public class Siete {

	public static void main(String[] args) {
		int tabla[] = {12, 26, 43, 81, 2, 5, 4, 10};
		int pares = 0; //variable para los pares
		int impares = 0; //variable para los impares
		
		for (int i = 0; i < tabla.length; i++) { //un bucle para contar los pares e impares
			if (tabla[i] %2 == 0) {
				pares++;
			}
			else {
				impares++;
			}
		}
		
		//estas 3 condiciones evaluan si hay mas pares, impares o la misma cantidad de ambos
		if (pares > impares) {
			System.out.println("Hay mas pares");
		}
		else if (impares > pares) {
			System.out.println("Hay mas impares");
		}
		else {
			System.out.println("hay los mismos pares que impares");
		}

	}

}

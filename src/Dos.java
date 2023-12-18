
public class Dos {

	public static void main(String[] args) {
		
		int tabla[]= { 3,6,2,77,3,10,23,14,1,23 };
		int mitad = tabla.length / 2; //variable que contiene la posicion central del array
		int suma_mitad1 = 0; 
		int suma_mitad2 = 0; 
		
		//Suma de los numeros de la primera mitad
		for(int i = 0; i < mitad; i++) {	
			suma_mitad1 += tabla[i];
		}
		//Suma de los numeros de la segunda mitad
		for(int i = mitad; i < tabla.length; i++) {
			suma_mitad2 += tabla[i]; 
		}

		//Condiciones para sacar en pantalla cual lado tiene el mayor valor
		if(suma_mitad1 > suma_mitad2) {
			System.out.println("La suma de los numeros de la primera mitad es mayor");
		}
		else {
			if(suma_mitad1 < suma_mitad2) {
				System.out.println("La suma de los numeros de la segunda mitad es mayor");
			}
			else {
				System.out.println("La suma de los numeros de ambos lados es la misma");
			}
		}

	}

}

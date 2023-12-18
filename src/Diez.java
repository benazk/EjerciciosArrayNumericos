
public class Diez {

	public static void main(String[] args) {
		int tabla[] = {12, 26, 42, 81, 2, 7, 4, 10};
		int divisibles_siete = 0; //contador de numeros divisibles entre 7
		for (int i = 0; i < tabla.length; i++) {  //recorre la tabla y si algun numero es perfectamente divisible entre siete, le suma 1 al contador.
			if (tabla[i]%7 == 0) {
				divisibles_siete++;
			}
		}
		System.out.println("Hay " + divisibles_siete + " numeros divisibles entre 7"); //Muestra en pantalla la cantidad de numeros divisibles con 7.

	}

}

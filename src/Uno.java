
public class Uno {

	public static void main(String[] args) {
		int tabla[]= { 3,6,2,77,3,10,23,14 };
		int conteo_de_3 = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			if(tabla[i] == 3) {
				conteo_de_3++;
			}
		}
		
		System.out.println("hay " + conteo_de_3 + " tres-es en la tabla");
	}

}

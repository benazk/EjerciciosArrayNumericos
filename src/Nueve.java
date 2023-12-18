
public class Nueve {

	 static boolean seRepite (int t[], int cant, int num) { //Funcion para ver si el candidato es igual a algun numero de la tabla
		for(int i = 0; i < t.length; i++) {
			if (t[i] == num) {
				System.out.println(t[i] + " - " + num);
				return true;
			}
		
		}
		return false;
	}
	public static void main(String[] args) {
		int tabla[] = new int[8];
		int cand = 0; //candidato a numero en la tabla
		
		for (int i = 0; i < tabla.length; i++ ) { //crea un candidato con un numero aleatorio
			cand = (int) Math.floor(Math.random() * 40);
			
			while(seRepite(tabla, i, cand)){ //mientras la funcion devuelva que el candidato ya esta en la tabla, sacara otro candidato
				cand = (int) Math.floor(Math.random() * 40);
				System.out.println("candidato:" + cand);
			}
			tabla[i] = cand; //mete el candidato en la tabla
		}
		
		for (int i = 0; i < tabla.length; i++ ) {//muestra la tabla en pantalla
			System.out.print(tabla[i] + " ");
		}
	}
	

}

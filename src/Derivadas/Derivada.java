package Derivadas;

public class Derivada {
	public static final String X = "x";
	public static final char SUMA = '+';
	public static final char RESTA = '-';

	public int derivadaNum(int num) {
		return 0;
	}
	
	public int derivadaX() {
		return 1;
	}
	
	public int derivadaNumX(String funcion) {
		return 0;
	}
	
	public String derivadasPolinomicas(String enunciado) {
		String solucion = "";
		if (enunciado.indexOf(SUMA) == -1 && enunciado.indexOf(RESTA) == -1) {
			if (enunciado.indexOf(X) == -1) {
				solucion = "0";
			} else {
				solucion = enunciado.substring(0, enunciado.indexOf(X));
			}
		} else {
			
		}
		return solucion;
	}
}

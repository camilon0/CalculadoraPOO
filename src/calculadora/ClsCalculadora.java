package calculadora;



public class ClsCalculadora {
	
	public double suma(double num1, double num2) {
		double resultado = 0;
		resultado = num1 + num2;
		return resultado;
	}
	
	public double rest(double num1, double num2) {
		double resultado = 0;
		resultado = num1 - num2;
		return resultado;
	}
	
	public double multi(double num1, double num2) {
		double resultado = 0;
		resultado = num1 * num2;
		return resultado;
	}
	
	public double divi(double num1, double num2) {
		double resultado = 0;	
		resultado = num1 / num2;
		return resultado;
	}
	
	public double potencia(double numBase, double numPotencia) {
		double resultado = 0;
		resultado = Math.pow(numBase, numPotencia);		
		return resultado;
	}
	
	public double raizCuadrada(double numRaiz) {
		double resultado = 0;
		resultado = Math.sqrt(numRaiz);
		return resultado;
	}

}

package calculadora;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// variables
		double num1, num2, numBase, numPotencia, numRaiz;
		int opcion = 0;

		DecimalFormat resultado = new DecimalFormat ("0.00");
		ClsCalculadora operaciones = new ClsCalculadora();
				
		do {			
			try {
		opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una operación\n\n "
				
				+ "1.Suma\n "
				+ "2.Resta\n "
				+ "3.Multiplicación\n "
				+ "4.División\n "
				+ "5.Potencia de un numero\n "
				+ "6.Raíz cuadrada de un numero\n "
				+ "7.Salir\n ", 
				"Menú operación",JOptionPane.INFORMATION_MESSAGE));
		
		switch(opcion) {
		
		case 1:
			try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1"));			
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 2"));
			JOptionPane.showInputDialog(null,"La suma es: "+ "\n"+resultado.format(operaciones.suma(num1, num2)),"-------------SUMA-------------",JOptionPane.INFORMATION_MESSAGE);
			
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"No es un numero, ingrese nuevamente" );
			}
			
			break;
			
		case 2:
			
			try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1"));
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 2"));
			JOptionPane.showInputDialog(null,"La resta es: "+ "\n"+resultado.format(operaciones.rest(num1, num2)),"-------------RESTA-------------",JOptionPane.INFORMATION_MESSAGE);
			
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"No es un numero, ingrese nuevamente" );
			}
			
			break;
			
		case 3:
			
			try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1"));
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 2"));
			JOptionPane.showInputDialog(null,"La Multiplicación es: "+ "\n"+resultado.format(operaciones.multi(num1, num2)),"---MULTIPLICACION---",JOptionPane.INFORMATION_MESSAGE);
			
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"No es un numero, ingrese nuevamente" );
			}
			
			break;
			
		case 4:
			
			try {
			num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1"));
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 2"));
			
			JOptionPane.showInputDialog(null,"La División es: "+ "\n"+resultado.format(operaciones.divi(num1, num2)),"------DIVISION------",JOptionPane.INFORMATION_MESSAGE);
			if (num2 == 0) {
				JOptionPane.showMessageDialog(null, "El resultado es una Indeterminación,\n Ingrese un numeros diferentes de 0");
			}
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"No es un numero, ingrese nuevamente" );
			}
			
			break;
			
		case 5:
			
			try {
			numBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero base"));
			numPotencia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la potencia"));
			JOptionPane.showInputDialog(null,"La potencia de "+ numBase + "es:" + "\n"+resultado.format(operaciones.potencia(numBase, numPotencia)),"--POTENCIA--",JOptionPane.INFORMATION_MESSAGE);
			
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"No es un numero, ingrese nuevamente" );
			}
			
			break;
			
		case 6:
			
			try {
			numRaiz = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero al que le quieres sacar Raiz cuadrada"));
			JOptionPane.showInputDialog(null,"La Raiz cuadrada de " + numRaiz + " es: "+ "\n"+resultado.format(operaciones.raizCuadrada(numRaiz)),"-RAIZ CUADRADA-",JOptionPane.INFORMATION_MESSAGE);
			
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"No es un numero, ingrese nuevamente" );
			}
			
			break;
		case 7:
					
			break;
			
		default:
			
			try {
			JOptionPane.showMessageDialog(null,"Opcion no valida, solo entre 1 y 6 o 7 para finalizar:"+"\n"+"","ERROR",JOptionPane.INFORMATION_MESSAGE );
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"No es un numero, ingrese nuevamente" );
			}
			break;
		}
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null,"No es un numero, ingrese nuevamente" );
		}
		}while(opcion!=7);
		
	
		}		
	
}


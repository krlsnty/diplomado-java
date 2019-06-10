package ClasesOperadores;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String nombre="Santiago Giraldo";
		double nota1=4.5;
		double nota2=4.5;
		double nota3=5.0;
		double nota4=4.4;
		double nota5=3.9;
		double promedio=(nota1+nota2+nota3+nota4+nota5)/5;
		promedio=Math.round(promedio*100d)/100d;
//		double parteEntera=Math.floor(promedio);
//		double parteDecimal=promedio-parteEntera;
//		parteDecimal=parteDecimal*100;
//		parteDecimal=Math.round(parteDecimal);
//		promedio=parteEntera+(parteDecimal/100);
		System.out.println(nombre+" tiene una nota promedio de: "+promedio);
	}

}

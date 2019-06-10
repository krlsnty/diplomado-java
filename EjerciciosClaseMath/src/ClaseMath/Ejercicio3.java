package ClaseMath;

public class Ejercicio3 {

	public static void main(String[] args) {


		double nota1=Math.random()*10;
		nota1=(double)Math.round(nota1*100)/100;
		double nota2=Math.random()*10;
		nota2=(double)Math.round(nota2*100)/100;
		double nota3=Math.random()*10;
		nota3=(double)Math.round(nota3*100)/100;
		double nota4=Math.random()*10;
		nota4=(double)Math.round(nota4*100)/100;
		double nota5=Math.random()*10;
		nota5=(double)Math.round(nota5*100)/100;
		
		double promedio=(nota1+nota2+nota3+nota4+nota5)/5;
		
		System.out.println("El promedio de las notas es: "+promedio);
		
		
	}

}

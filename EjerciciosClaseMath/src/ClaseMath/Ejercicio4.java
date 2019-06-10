package ClaseMath;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		double numero1=Math.random()*50;
		double numero2=Math.random()*50;
		
		int numero1redondeado=(int) Math.ceil(numero1);
		int numero2redondeado=(int) Math.round(numero2);
				
		System.out.println("el valor del número uno es: "+numero1redondeado);
		System.out.println("el valor del número dos es: "+numero2redondeado);
		
		System.out.println("el valor mayor es: "+Math.max(numero1redondeado, numero2redondeado));
	}

}

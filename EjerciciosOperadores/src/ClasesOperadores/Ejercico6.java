package ClasesOperadores;

public class Ejercico6 {

	public static void main(String[] args) {


		int ladoCuadrado=8;
		double areaDuadrado=Math.pow(ladoCuadrado, 2);
		double perimetroCuadrado=ladoCuadrado*4;
		System.out.println("El área del cuadrado es: "+areaDuadrado);
		System.out.println("El perimetro del cuadrado es: "+perimetroCuadrado);
		
		int baseTrianguloDos=9;
		int alturaTrianguloDos=8;
		int ladoUnoTrianguloDos=8;
		int ladoDosTrianguloDos=8;
		double areaTrianguloDos=(baseTrianguloDos*alturaTrianguloDos)/2;
		double perimetroTrianguloDos=baseTrianguloDos+ladoUnoTrianguloDos+ladoDosTrianguloDos;
		System.out.println("El área del triangulo es: "+areaTrianguloDos);
		System.out.println("El perimetro del cuadrado es: "+perimetroTrianguloDos);
		
		int baseRectangulo=8;
		int alturaRectangulo=6;
		double perimetroRetangulo=2*(baseRectangulo+alturaRectangulo);
		double areaRetangulo=baseRectangulo*alturaRectangulo;
		System.out.println("El área del retangulo es: "+areaRetangulo);
		System.out.println("El perimetro del retangulo es: "+perimetroRetangulo);

	}

}

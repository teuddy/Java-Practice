package poo.clases.ejercisios;

public class TestCircle {

	public static void main(String[] args) {
		
		Circle circulo = new Circle();
		
		/*System.out.println("El radio del circulo es " + circulo.getRadius() + " Y el Area es " + circulo.getArea()
		+ ".");*/
		
		Circle circulodos = new Circle(2.0);
		
		/*System.out.println("El radio del circulo es " + circulodos.getRadius() + " Y el Area es " + circulodos.getArea()
		+ ".");*/
		
		Circle circuloColor = new Circle(3.0,"Verde");
		
		//System.out.println(circuloColor.getColor());
		
	
		System.out.println(circuloColor.toString());// el metodo String es llamado implicitmente aunque no se coloque el metodo
		 System.out.println(circuloColor);// Esto es lo mismo que arriba
		//System.out.println(+ circuloColor); el simvolo +invoca tostrign tmbien
	}

}

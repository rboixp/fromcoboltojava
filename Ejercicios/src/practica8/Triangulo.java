package practica8;

public class Triangulo extends Figura {
	private float lado1;
	private float lado2;
	private float lado3;
	
	 public Triangulo() {
		super();
		this.lado1 = 1f;
		this.lado2 = 2f;
		this.lado3 = 3f;
	}	
	
	 public Triangulo(String nombre)  {
		super(nombre);
	}
	 
	@Override
	public float calcularPerimetro() {
		return 2f*lado1;
	}
	 @Override
	public float calcularSuperficie() {
		return lado2*lado1;
	 }
	

}

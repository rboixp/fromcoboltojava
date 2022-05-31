package practica8;

public class Cuadrado extends Figura{
	private float lado;

	public Cuadrado(String nombre, float lado) {
		super(nombre);
		this.lado = lado;
	}
	public Cuadrado() {
		super("Pepe");
		this.lado = 2f;
	}
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(lado);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Cuadrado))
			return false;
		Cuadrado other = (Cuadrado) obj;
		if (Float.floatToIntBits(lado) != Float.floatToIntBits(other.lado))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", getLado()=" + getLado() + "]";
	}
	
	 @Override
	public float calcularPerimetro() {
		return 2f*lado;
	}
	 @Override
	public float calcularSuperficie() {
		return lado*lado;
	}	
		
	
	
}

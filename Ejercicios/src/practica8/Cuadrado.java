package practica8;

public class Cuadrado extends Figura{
	private float lado;

	public Cuadrado( float lado) {
		super("Cuadrado");
		this.lado = lado;
	}
	public Cuadrado() {
		super("Cuadrado");
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
		return super.hashCode() + (int)lado;
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) 			&&
				obj instanceof Cuadrado 		&&
				lado == ((Cuadrado)obj).getLado();
	}
	@Override
	public String toString() {
    	StringBuilder sb = new StringBuilder(super.toString());
    	sb.append(",lado=");
    	sb.append(lado);
    	return sb.toString();
	}
	
	 @Override
	public float calcularPerimetro() {
		return 4f*lado;
	}
	 @Override
	public float calcularSuperficie() {
		return lado*lado;
	}	
		
	
	
}

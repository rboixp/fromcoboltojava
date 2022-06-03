package practica8;

public class Rectangulo extends Figura{
	private float altura;
	private float base;
	
	public Rectangulo() {
		super("Rectangulo");
		this.altura = 2f;
		this.base = 1f;
	}	
	
		
	public Rectangulo( float altura, float base) {
		super("Rectangulo");
		this.altura = altura;
		this.base = base;
	}
	@Override
	public float calcularPerimetro() {
		return 2f*base + 2f*altura;
	}
	 @Override
	public float calcularSuperficie() {
		return altura*base;
	 }

	@Override
	public int hashCode() {
		return super.hashCode() + (int)base + (int)altura;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) 			&&
				obj instanceof Rectangulo 		&&
				base == ((Rectangulo)obj).getBase() &&
				altura == ((Rectangulo)obj).getAltura();
	}

	@Override
	public String toString() {
    	StringBuilder sb = new StringBuilder(super.toString());
    	sb.append(",base=");
    	sb.append(base);
    	sb.append(",altura=");
    	sb.append(altura);
    	return sb.toString();
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}
	

}

package practica8;

public class Rectangulo extends Figura{
	private float altura;
	private float base;
	
	public Rectangulo() {
		super("Pepe");
		this.altura = 2f;
		this.base = 1f;
	}	
	
	public Rectangulo(String nombre) {
		super(nombre);
		this.altura = 2f;
		this.base = 1f;
	}		
	public Rectangulo(String nombre, float altura, float base) {
		super(nombre);
		this.altura = altura;
		this.base = base;
	}
	@Override
	public float calcularPerimetro() {
		return 2f*base;
	}
	 @Override
	public float calcularSuperficie() {
		return altura*base;
	 }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(altura);
		result = prime * result + Float.floatToIntBits(base);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Rectangulo))
			return false;
		Rectangulo other = (Rectangulo) obj;
		if (Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
			return false;
		if (Float.floatToIntBits(base) != Float.floatToIntBits(other.base))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rectangulo [altura=" + altura + ", base=" + base + ", toString()=" + super.toString() + "]";
	}
	

}

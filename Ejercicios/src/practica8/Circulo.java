package practica8;

public class Circulo extends Figura   {
	private float radio;

	
	public Circulo() {
		super();
		this.radio = 20f;
	}	
	
	public Circulo(String nombre , float radio) {
		super(nombre);
		this.radio = radio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(radio);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Circulo))
			return false;
		Circulo other = (Circulo) obj;
		if (Float.floatToIntBits(radio) != Float.floatToIntBits(other.radio))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", toString()=" + super.toString() + "]";
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}
	 @Override
	public float calcularPerimetro() {
		return 2f*3.1415f*radio;
	}
	 @Override
	public float calcularSuperficie() {
		return 3.1415f*radio*radio;
	}
	

}

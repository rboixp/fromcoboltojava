package practica8;

public abstract class Figura {
	protected float maximaSuperficie;
	private String nombre;
	
	public Figura() {
		super();
		this.nombre = "Cuadrado";
		this.maximaSuperficie = 10;
	}	
	
	public Figura(String nombre) {
		super();
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Figura [maximaSuperficie=" + maximaSuperficie + ", nombre=" + nombre + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(maximaSuperficie);
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Figura))
			return false;
		Figura other = (Figura) obj;
		if (Float.floatToIntBits(maximaSuperficie) != Float.floatToIntBits(other.maximaSuperficie))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public float getMaximaSuperficie() {
		return maximaSuperficie;
	}

	public void setMaximaSuperficie(float maximaSuperficie) {
		this.maximaSuperficie = maximaSuperficie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract float calcularPerimetro();	
	public abstract float calcularSuperficie();


}

package practica7;

public class Alumno extends Persona {
	private int legajo;

	public Alumno(int legajo) {
		this.legajo = legajo;
	}

	public Alumno() {
		this.legajo = 1;
	}

	public Alumno(String nombre , String apellido,  int legajo) {
		super(apellido,nombre);
		this.legajo = legajo;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + legajo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Alumno))
			return false;
		Alumno other = (Alumno) obj;
		if (legajo != other.legajo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + ", toString()=" + super.toString() + "]";
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	


}

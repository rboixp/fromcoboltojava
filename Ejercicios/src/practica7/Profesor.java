package practica7;

public class Profesor extends Persona{
	private String iosfa;
	
	public Profesor() {
		this.iosfa = "AR2313";
	}
	
	public Profesor(String iosfa) {
		this.iosfa = iosfa;
	}
	
	public Profesor(String iosfa,String apellido, String nombre) {
		super(apellido,nombre);
		this.iosfa = iosfa;
	}

	public String getIosfa() {
		return iosfa;
	}

	public void setIosfa(String iosfa) {
		this.iosfa = iosfa;
	}

	@Override
	public String toString() {
		return "Profesor [iosfa=" + iosfa + ", getApellido()=" + getApellido() + ", getNombre()=" + getNombre() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((iosfa == null) ? 0 : iosfa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Profesor))
			return false;
		Profesor other = (Profesor) obj;
		if (iosfa == null) {
			if (other.iosfa != null)
				return false;
		} else if (!iosfa.equals(other.iosfa))
			return false;
		return true;
	}	
	
	
	

}

package practica8;

import objetos.Cuenta;

public abstract class Figura {
	protected float maximaSuperficie;
	private String nombre;
	
	public Figura() {
		super();
		this.nombre = "Figura";
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
		return (int)maximaSuperficie + (int)nombre.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		boolean bln =false;
		if(obj instanceof Cuenta){
			//downcast
			 int i =134;
			 //upcast es automatico
			long l = i;
			
			Figura fig = (Figura)obj;					
			bln = maximaSuperficie == fig.getMaximaSuperficie() &&
			      nombre  == fig.getNombre();	
		}
		return bln;
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

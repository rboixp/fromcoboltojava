package practica8;

import objetos.CajaDeAhorro;

public class Circulo extends Figura   {
	private float radio;

	
	public Circulo() {
		super();
		this.radio = 20f;
	}	
	
	public Circulo( float radio) {
		super("Circulo");
		this.radio = radio;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + (int)radio;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) 			&&
				obj instanceof Circulo 		&&
				radio == ((Circulo)obj).getRadio();
	}

	@Override
	public String toString() {
    	StringBuilder sb = new StringBuilder(super.toString());
    	sb.append(",radio=");
    	sb.append(radio);
    	return sb.toString();
	
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}
	 @Override
	public float calcularPerimetro() {
		return 2f*(float)Math.PI*radio;
	}
	 @Override
	public float calcularSuperficie() {
		return (float)Math.PI*radio*radio;
	}
	

}

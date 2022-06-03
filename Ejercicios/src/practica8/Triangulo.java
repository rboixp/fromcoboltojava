package practica8;

public class Triangulo extends Figura {
	private float lado1;
	private float lado2;
	private float lado3;
	
	 public Triangulo() {
		super("Triangulo");
		this.lado1 = 1f;
		this.lado2 = 2f;
		this.lado3 = 3f;
	}	
	
	 public Triangulo(float lado1, float lado2, float lado3)  {
		 super("Triangulo");
			this.lado1 = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;
		 
	}
	 
	@Override
	public float calcularPerimetro() {
		return lado1 + lado2 + lado3;
	}
	 @Override
	public float calcularSuperficie() {
		 float s = calcularPerimetro()/2f;
		return (float) Math.sqrt((s* (s-lado1) * (s-lado2)* (s-lado3)));
	 }

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	public float getLado3() {
		return lado3;
	}

	public void setLado3(float lado3) {
		this.lado3 = lado3;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + (int)lado1 + (int)lado2 + (int)lado3;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) 			&&
				obj instanceof Triangulo 		&&
				lado1 == ((Triangulo)obj).getLado1() &&
				lado2 == ((Triangulo)obj).getLado2() &&
				lado3 == ((Triangulo)obj).getLado3();
	}

	@Override
	public String toString() {
    	StringBuilder sb = new StringBuilder(super.toString());
    	sb.append(",lado1=");
    	sb.append(lado1);
    	sb.append(",lado2=");
    	sb.append(lado2);
    	sb.append(",lado3=");
    	sb.append(lado3);    	
    	return sb.toString();
	}

}

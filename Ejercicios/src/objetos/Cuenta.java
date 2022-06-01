package objetos;

public abstract class Cuenta implements Vaciable {
	//atributos
	private int 	numero	;
	protected float 	saldo	;
	private static int CantidadDeCuentas;
	
   public static int getCantidadDeCuentas() {
		return CantidadDeCuentas;
	}
	public static void setCantidadDeCuentas(int cantidadDeCuentas) {
		CantidadDeCuentas = cantidadDeCuentas;
	}
//1-metodo constructor
	//es el primer metodo que se ejecuta cuando se crea un objeto
  public Cuenta(){
	  CantidadDeCuentas++;
	  numero=100;
	  saldo =100;
  }
  public Cuenta(int pNum, float pSal){
	  CantidadDeCuentas++;
	  numero=pNum;
	  saldo =pSal;
  }
 //2-accessors, getter y setter
  //aceso - tipo de dato que devuelve, nombre, parametro
  public void setNumero(int pNum){
	  numero=pNum;
 
  }
  public int  getNumero(){
	  return numero;
  }
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
 //3-metodos de negocio
	public void acreditar(float pValor){
		saldo+=pValor; //saldo = saldo + pValor
	}
	public abstract void debitar(float pValor);
	
	public boolean equals(Object obj){
		boolean bln =false;
		if(obj instanceof Cuenta){
			//downcast
			 int i =134;
			 //upcast es automatico
			long l = i;
			
			Cuenta cue = (Cuenta)obj;					
			bln = numero == cue.getNumero() &&
				  saldo  == cue.getSaldo();	
		}
		return bln;
	}
	
	public int hashCode(){
		return numero + (int)saldo;
	}
	
	public String  toString(){
		StringBuilder sb = new StringBuilder("\nnumero=");
		sb.append(numero);
		sb.append(",saldo=");
		sb.append(saldo);	
		
		return sb.toString();
	}
	public static void vaciarContador () {
		CantidadDeCuentas = 0;
	}
	@Override
	public boolean isEmpty() {
		return numero==0 && saldo==0;
	}
	
}

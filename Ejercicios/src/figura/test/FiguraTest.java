package figura.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import objetos.CajaDeAhorro;
import objetos.Cuenta;
import objetos.CuentaCorriente;
import practica8.*;


public class FiguraTest {
	
	Figura figVacia;
	Figura figParametros;
	
	Circulo cirVacia;
	Circulo cirParametros;
	
	Cuadrado cuaVacia;
	Cuadrado cuaParametros;
	
	Rectangulo recVacia;
	Rectangulo recParametros;	
	
	Triangulo triVacia;
	Triangulo triParametros;
	
	
	List<Figura> listFiguras;
	Set<Figura> setFiguras;	
	
	@Before
	public void setUp() throws Exception {

		figVacia = new Triangulo();
		figParametros = new Triangulo(1f, 2f, 3f);
		
		 cirVacia = new Circulo();
		 cirParametros = new Circulo(2f); 
		
		 cuaVacia = new Cuadrado();
		 cuaParametros = new Cuadrado(3f);
		
		 recVacia = new Rectangulo();
		 recParametros= new Rectangulo(2f,3f);	
		
		 triVacia = new Triangulo();
		 triParametros = new Triangulo(1f,6f,5f);		
		
		

		
		//permite duplicados
		listFiguras = new ArrayList<Figura>();
		listFiguras.add(new Circulo());
		listFiguras.add(new Cuadrado());
		listFiguras.add(new Triangulo());
		listFiguras.add(new Rectangulo());
		listFiguras.add(new Circulo());
		listFiguras.add(new Cuadrado());
		listFiguras.add(new Triangulo());
		listFiguras.add(new Rectangulo());
		listFiguras.add(new Circulo(5f));
		listFiguras.add(new Cuadrado(5f));
		listFiguras.add(new Triangulo(5f,7f,8f));
		listFiguras.add(new Rectangulo(10f,11f));
		

		setFiguras = new HashSet<Figura>();
		setFiguras.add(new Circulo());
		setFiguras.add(new Cuadrado());
		setFiguras.add(new Triangulo());
		setFiguras.add(new Rectangulo());
		setFiguras.add(new Circulo(5f));
		setFiguras.add(new Cuadrado(5f));
		setFiguras.add(new Triangulo(5f,7f,8f));
		setFiguras.add(new Rectangulo(10f,11f));
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		 figVacia = null;
		 figParametros = null;		
		 cirVacia = null;
		 cirParametros = null;		
		 cuaVacia = null;
		 cuaParametros = null;		
		 recVacia = null;
		 recParametros = null;			
		 triVacia = null;
		 triParametros = null;		
		 listFiguras  = null;
		 setFiguras = null;	
		
	}
	
	@Test
	public void figVacia() {
		System.out.println(figVacia.getMaximaSuperficie());
		assertEquals(100, figVacia.getMaximaSuperficie());
	}

}

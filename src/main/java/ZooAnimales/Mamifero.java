package ZooAnimales;
import gestion.*;
import java.util.ArrayList;
public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	

	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje,int patas) {
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		this.pelaje=pelaje;
		this.patas=patas;
		listado.add(this);
	}
	public Mamifero() {}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Animal crearCaballo(String nombre, int edad, String genero) {
		Mamifero m1= new Mamifero(nombre,edad,"pradera",genero,true,4);
		caballos++;
		return m1;
	}
	
	public static Animal crearLeon(String nombre, int edad, String genero) {
		Mamifero m1= new Mamifero(nombre,edad,"selva",genero,true,4); 
		leones++;
		return m1;
	}

	public ArrayList<Mamifero> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void isPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
}

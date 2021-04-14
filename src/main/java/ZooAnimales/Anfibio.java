package ZooAnimales;
import gestion.Zona;
import java.util.ArrayList;
public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel,boolean venenoso) {
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		
	}
	public Anfibio() {}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public static Animal crearRana(String nombre, int edad, String genero) {
		Anfibio anf1=new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas++;
		return anf1;
	}
	
	public static Animal crearSalamandra(String nombre, int edad, String genero) {
		Anfibio anf1=new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		salamandras++;
		return anf1;
	}

	public ArrayList<Anfibio> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void isVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}

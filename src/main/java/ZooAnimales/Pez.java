package ZooAnimales;
import gestion.Zona;
import java.util.ArrayList;
public class Pez extends Animal {
	private static ArrayList<Pez> listado=new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;	
	}
	public Pez() {}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	public static Animal crearSalmon(String nombre, int edad, String genero) {
		Pez pez1=new Pez(nombre,edad,"oceano",genero,"rojo",6);
		salmones++;
		return pez1;
	}

	public static Animal crearBacalao(String nombre, int edad, String genero) {
		Pez pez1=new Pez(nombre,edad,"oceano",genero,"gris",6);
		bacalaos++;
		return pez1;
	}

	public ArrayList<Pez> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}

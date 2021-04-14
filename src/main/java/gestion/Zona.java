package gestion;
import zooAnimales.*;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private static ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre,Zoologico zoo) {
		this.nombre=nombre;
		this.zoo=zoo;
		
	}
	public Zona() {}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);		
	}
	
	public  static int cantidadAnimales() {
		return animales.size();
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
}

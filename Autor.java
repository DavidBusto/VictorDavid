package Proyecto;

public class Autor {
	String nombre;
	int edad;
	int a;
	String Autores;
	String dirección;
	public Autor(){	}
	
	public Autor(String nombre, int edad, int a, String Autores, String dirección) {
		this.nombre = nombre;
		this.edad = edad;	
		this.a=a;
		this.Autores=autores;
		this.dirección=direccion;
	}

	public String getNombre() {
		return nombre;	}

	public void setNombre(String nombre) {
		this.nombre = nombre;	}

	public int getEdad() {
		return edad;	}

	public void setEdad(int edad) {
		this.edad = edad;	
	}
	
	public String toString() {
		return "Autor [nombre=" + nombre + ", edad=" + edad + "]";	
	}
	
	
}

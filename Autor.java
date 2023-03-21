package Proyecto;

public class Autor {
	String nombre;
	int edad;
	int a;
	public Autor(){	}
	
	public Autor(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;	}

	public String getNombre() {
		return nombre;	}

	public void setNombre(String nombre) {
		this.nombre = nombre;	}

	public int getEdad() {
		return edad;	}

	public void setEdad(int edad) {
		this.edad = edad;	
		
		System.out.println("Adios");
		System.out.println("Hola");
		System.out.println("fndsjfgbafiewhuihwruerkjbrekbkre");


	}
	
	public String toString() {
		return "Autor [nombre=" + nombre + ", edad=" + edad + "]";	}
	
	
}

package clasesDatos;

import java.util.Objects;

public class Empleado {
	private String dni;
	private String nombre;
	private String apellidos;
	private String categoria;
	private int edad;
	private boolean clubSocial; //indica si el empleado está en el club social de la empresa
	private float sueldo;
	
	///////////////////////////CONSTRUCTORES////////////////////////////
	// CONSTRUCTOR COMPLETO
	/**
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param categoria
	 * @param edad
	 * @param clubSocial indica si el empleado está en el club social de la empresa
	 * @param sueldo
	 */
	public Empleado(String dni, String nombre, String apellidos, String categoria, int edad, boolean clubSocial,
			float sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.categoria = categoria;
		this.edad = edad;
		this.clubSocial = clubSocial;
		this.sueldo = sueldo;
	}
	
	//CONSTRUCTOR VACÍO
	public Empleado() {
		super();
		this.dni = "";
		this.nombre = "............";
		this.apellidos = ".............";
		this.categoria = "Base";
		this.edad = 0;
		this.clubSocial = false;
		this.sueldo = (float) 0.0; 
	}

	//CONSTRUCTOR PARCIAL
	/**
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 */
	public Empleado(String dni, String nombre, String apellidos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.categoria = "Base";
		this.edad = 0;
		this.clubSocial = false;
		this.sueldo = (float) 0.0; 
	}

	
	///////////////////////////GETers & SETTers///////////////////////////////
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isClubSocial() {
		return clubSocial;
	}

	public void setClubSocial(boolean clubSocial) {
		this.clubSocial = clubSocial;
	}
	
	public void setClubSocial() {
		this.clubSocial = sueldo>2000;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	
	///////////////////////////////// TO STRING //////////////////////////////////

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", categoria=" + categoria
				+ ", edad=" + edad + ", clubSocial=" + clubSocial + ", sueldo=" + sueldo + "]";
	}

	
	///////////////////////////////////// EQUALS /////////////////////////////////////////
	
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre);
	}
	
	
}



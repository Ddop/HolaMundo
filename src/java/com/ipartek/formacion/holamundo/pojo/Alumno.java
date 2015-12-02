package com.ipartek.formacion.holamundo.pojo;
//Clase instanciable que representa a un alumno

public class Alumno {

	//Constantes de clase
	public static final String NOMBRE_ANONIMO = "Anónimo";
	public static final String NOMBRE_SIN_DEFINIR = "Sin definir";
	public static final char SEXO_HOMBRE = 'H';
	public static final char SEXO_MUJER = 'M';
	public static final char SEXO_INDEFINIDO = 'I';
	
	//Atributos
	public String nombre;
	public String apellidos;
	public boolean becado;
	public int edad;
	public char sexo;// Posibles valores H, M, I

	// "Source/Generate Constructor using Fields"
	public Alumno(String nombre, String apellidos, boolean becado, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.becado = becado;
		this.edad = edad;
		this.sexo = sexo;
		//TODO meter valores por defecto si no entran O no son el tipo debido
		//TODO validar que la entrada de parámetros sea de su tipo o exista
	}

	// Getters y Setters "Source/Generate Getters y Setters"
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		// Si es vacio, meter "Sin definir"
		// Si no poner primera letra en mayusc

		String cadenasinespacios = nombre.replaceAll(" ", "");
				
		if ((cadenasinespacios == "") || (cadenasinespacios.length() == 0)) {
			cadenasinespacios = "Sin definir";
		
		} else { 
		
			char primera = Character.toUpperCase(cadenasinespacios.charAt(0));
			cadenasinespacios=cadenasinespacios.replaceFirst (cadenasinespacios.charAt(0)+"", primera+"");
		}	
				
		
	}//FIN VOID SET NOMBRE

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", becado=" + becado + ", edad=" + edad
				+ ", sexo=" + sexo + "]";
	}

	// Cambia el Get, por ser un boolean
	public boolean isBecado() {
		return becado;
	}

	public void setBecado(boolean becado) {
		this.becado = becado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	
	
	public Boolean isMayorEdad() {
		boolean esono = false;
		if (this.edad >= 18) {
			esono = true;
		}
		
		return esono;
	}

}


	/*public Alumno(String nombre, String apellidos, boolean becado, int edad, char sexo) {
		super();
		this.nombre = NOMBRE_ANONIMO;
		this.apellidos = "";
		this.becado = false;
		this.edad = 0;
		this.sexo = SEXO_INDEFINIDO;
	}*/
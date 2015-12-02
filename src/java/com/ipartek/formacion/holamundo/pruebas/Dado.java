package com.ipartek.formacion.holamundo.pruebas;


/**
 * Clase java que elige uno entre 15 alumnos
 * @author David Ortiz
 *
 */

public class Dado {
	
	//Constante. Final. No se modifica. (Static solo reserva memoria una vez) 
	public static final int ALUMNOS = 15;
	//Luego usamos lenght para que no haga iob el string, ya que actualmente falta un alumno, la posicion 15
	
	public static final String NOMBRES_ALUMNOS [] = {
			"David Ibarzabal", 
			"Oscar",
			"Gorka",
			"Ariane",
			"Gontzal",
			"Aitor",
			"Santi",
			"David Ortiz",
			"Sergio",
			"David Barbudo",
			"Edorta",
			"Asier",
			"Alberto",
			"Iñigo" ,
	};

	
	/**
	 * Muestra El ¿string de strings? <code>NOMBRES_ALUMNOS</code>. Los alumnos en sorteo<br>
	 * Tal que:
	 * <ul>
	 * <li>	[1] David Ibarzabal</li>
	 * <li>	[N] ...</li>
	 * <li>	[12] Edorta</li>
	 * <li>	[13] Asier</li>
	 * <li>	[14] Alberto</li>
	 * <li>	[15] Iñigo</li>
	 * </ul>
	 */
	public static void mostrar_alumnos() {
		
		System.out.println("Estos son los concursantes\n");
		for (int i = 0; i <= 13; i++){
		//mas alegante
		//for (int i = 0; i <= NOMBRES_ALUMNOS.lenght; i++){
			System.out.println("["+i+"]"+ NOMBRES_ALUMNOS[i]);	
		}
	}
	
	/**
	 * Genera int al azar entre 0 y 15
	 * Da -1 en caso de no asignar valor
	 */
	public static int generar_numero(){
		//-1 es el código de error
		int resultado = -1;
		resultado = (int) (Math.random() * ALUMNOS );
		return resultado;
	}
	
	
	/**
	 * Pintamos concursantes
	 * Generamos numero internamente
	 * Decimos a quien le ha tocado	 
	 */
	public static void main(String[] args) {
	mostrar_alumnos();
	System.out.println("\nLe toca a:");
	int alumnoafortunado = generar_numero();
	System.out.println("["+alumnoafortunado+"]"+ NOMBRES_ALUMNOS[alumnoafortunado]);

	
}//Fin void

}//Fin clase Dado
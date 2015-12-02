package com.ipartek.formacion.holamundo.pruebas;
import com.ipartek.formacion.holamundo.pojo.Alumno;

public class ParImpar {

	public static void main(String[] args) {
		System.out.println("Primer ejer\nMirar pares 1 a 10\n");

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				System.out.println(i + " es par");
			} else {
				System.out.println(i + " es IMpar");
			}

		}
		//System.out.println(i);
		System.out.println("\nY ya está, colega");
		
	
	}//final del main


	
	
	
}

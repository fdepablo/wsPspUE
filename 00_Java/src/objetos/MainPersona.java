package objetos;

import java.util.ArrayList;

public class MainPersona {

//	La firma del m�todo son 3 cosas:
//	1.- Nombre del m�todo
//	2.-N�mero de par�metros de entrada
//	3.- Tipo de par�metros

	public static void main(String[] args) {
		Persona p = new Persona();

		p.nombre = "Harry Potter";
		p.edad = 23;
		p.peso = 65;

		Persona p2 = new Persona();

		p2.nombre = "Ernion";
		p2.edad = 20;
		p2.peso = 70;

		p = p2;

		p2.edad = 30;
		// Dos referencias apuntando al mismo objeto
		System.out.println(p.edad);
		System.out.println(p2.edad);

		cambiarEdad(p);

		int numero = 5;
		cambiarValor(numero);

		crearPersona();

		MainPersona mein = new MainPersona();
		mein.otroMetodo();

//		int octal = 01234;
//		int hexa = 0xFFFFA;
//		int bin = 0b101;
//		int numLargo = 10_000_000;
//		long numMaslargo = 10000000000L;

		String nombre = "felix";
		String nombre2 = "felix";

		if (nombre == nombre2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}

		String nombre3 = new String("felix");
		String nombre4 = new String("felix");

		if (nombre3 == nombre4) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}

		Persona p4 = new Persona();
		p4.nombre = "Snape";
		p4.edad = 60;
		p4.peso = 60;

		Direccion d1 = new Direccion();
		p4.direccion = d1;
		p4.direccion.nombreVia = "jog�arts";

		d1.nombreVia = "Hazcaban";

		Persona p5 = new Persona();
		p5.nombre = "Bobby";
		d1 = new Direccion();
		p5.direccion = d1;

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		Persona p6 = new Persona();

		listaPersonas.add(p6);
		p6.nombre = "Jagris";

		p6 = new Persona();
		p6.nombre = "Ron G�esley";
		listaPersonas.add(p6);

		listaPersonas.get(1).nombre = "Gandalf";
		d1 = new Direccion();
		d1.nombreVia = "Gran V�a";
		listaPersonas.get(1).direccion = d1;
	}

	public void otroMetodo() {
		System.out.println("Hola caracola");
	}

	public static void crearPersona() {
		Persona p = new Persona();
		p.nombre = "Dumbeldor";
	}

	public static void cambiarEdad(Persona p) {
		p.edad = 40;
	}

	public static void cambiarValor(int i) {
		i = 10;
	}
}

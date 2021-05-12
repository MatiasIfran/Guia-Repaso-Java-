package parte1;

public abstract class Capacitacion implements Agendable{

	private static String nombre;
	private static boolean esPrioritaria;
	private static Tema tema;
	

	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Capacitacion.nombre = nombre;
	}
	public static boolean isEsPrioritaria() {
		return esPrioritaria;
	}
	public static void setEsPrioritaria(boolean esPrioritaria) {
		Capacitacion.esPrioritaria = esPrioritaria;
	}
	public static Tema getTema() {
		return tema;
	}
	public static void setTema(Tema tema) {
		Capacitacion.tema = tema;
	}
	
}

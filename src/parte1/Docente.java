package parte1;

public class Docente {

	private String nombre;
	private String email;
	private Integer a�os_antiguedad;
	private Double costo_hora;
	
	
	public Docente(String nombre, String email, Integer anios, Double costo_hora) {
		this.nombre = nombre;
		this.email = email;
		this.a�os_antiguedad = anios;
		this.costo_hora = costo_hora;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getA�os_antiguedad() {
		return a�os_antiguedad;
	}
	public void setA�os_antiguedad(Integer a�os_antiguedad) {
		this.a�os_antiguedad = a�os_antiguedad;
	}
	public Double getCosto_hora() {
		return costo_hora;
	}
	public void setCosto_hora(Double costo_hora) {
		this.costo_hora = costo_hora;
	}
	
	
}

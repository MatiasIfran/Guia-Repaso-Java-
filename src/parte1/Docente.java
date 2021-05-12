package parte1;

public class Docente {

	private String nombre;
	private String email;
	private Integer años_antiguedad;
	private Double costo_hora;
	
	
	public Docente(String nombre, String email, Integer anios, Double costo_hora) {
		this.nombre = nombre;
		this.email = email;
		this.años_antiguedad = anios;
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
	public Integer getAños_antiguedad() {
		return años_antiguedad;
	}
	public void setAños_antiguedad(Integer años_antiguedad) {
		this.años_antiguedad = años_antiguedad;
	}
	public Double getCosto_hora() {
		return costo_hora;
	}
	public void setCosto_hora(Double costo_hora) {
		this.costo_hora = costo_hora;
	}
	
	
}
